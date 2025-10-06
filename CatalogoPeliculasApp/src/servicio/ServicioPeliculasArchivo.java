package servicio;

import dominio.Pelicula;

import java.io.*;

public class ServicioPeliculasArchivo implements IServicioPeliculas{

    private final String NOMBRE_ARCHIVO = "peliculas.txt";

    //Cosntructor
    public ServicioPeliculasArchivo(){
        File archivo = new File(NOMBRE_ARCHIVO);
        try{
            if(archivo.exists()){
                System.out.println("El archivo ya existe");
            }else{
                FileWriter archivoCrea = new FileWriter(archivo);
                PrintWriter ArchivoSalida = new PrintWriter(archivoCrea);
                ArchivoSalida.close();
                System.out.println("Se creó el archivo.");
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error al abrir el archivo: " + e.getMessage());
        }
    }

    //Métodos
    @Override
    public void listarPeliculas() {
        //Abrir archivo
        File archivo = new File(NOMBRE_ARCHIVO);
        try{
            FileReader archivoLee = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(archivoLee);

            String linea;
            linea = lector.readLine();

            while(linea != null){
                Pelicula pelicula = new Pelicula(linea);
                System.out.println(pelicula);
                linea = lector.readLine();
            }

            lector.close();

        }catch(IOException e){
            System.out.println("Ocurrio un error al abrir el archivo: " + e.getMessage());
        }

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        boolean anexar = false;
        File archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula);
            salida.close();
            System.out.println("Se agregó al archivo : " + pelicula);

        }catch(Exception e){
            System.out.println("Ocurrió un error al agregar película: " + e.getMessage());
        }

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        File archivo = new File(NOMBRE_ARCHIVO);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lineaTexto = entrada.readLine();
            int indice = 1;
            boolean encontrada = false;
            String peliculaBuscar = pelicula.getNombre();
            while(lineaTexto != null){
                if(peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineaTexto)){
                    encontrada = true;
                    break;
                }

                lineaTexto = entrada.readLine();
                indice++;

            }

            if(encontrada){
                System.out.println("Película " + lineaTexto + " encontrada - linea " + indice);
            }else{
                System.out.println("No se encontró la película " + pelicula.getClass());
                entrada.close();
            }

        }catch(Exception e){
            System.out.println("Ocurió un error al buscar en el archivo: " + e.getMessage());
        }
    }
}
