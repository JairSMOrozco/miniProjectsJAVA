package presentacion;

import dominio.Pelicula;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasArchivo;
import servicio.ServicioPeliculasLista;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {

        //Variables
        Scanner consola = new Scanner(System.in);
        boolean salir = false;

        //IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();
        while(!salir){
            try{
                mostrarMenu();
                salir = ejecutarOpciones(consola, servicioPeliculas);

            }catch(Exception e){
                System.out.println("Ocurrio un error. " + e.getMessage());
            }

            System.out.println();

        } //Fin While

    }

    private static void mostrarMenu(){
        System.out.println("*** Catálogo de películas ***");
        System.out.println("1. Agregar película");
        System.out.println("2. Listar películas");
        System.out.println("3. Buscar película");
        System.out.println("4. Salir");
        System.out.println("Elige una opción");
    }

    private static boolean ejecutarOpciones(Scanner consola, IServicioPeliculas servicioPeliculas){

        boolean salir = false;
        int opcion = Integer.parseInt(consola.nextLine());


        switch(opcion){
            case 1:
                System.out.println("Ingresa el nombre de la película a agregar");
                String nombrePelicula = consola.nextLine();
                Pelicula pelicula = new Pelicula(nombrePelicula);
                servicioPeliculas.agregarPelicula(pelicula);
                break;

            case 2:
                servicioPeliculas.listarPeliculas();
                break;

            case 3:
                System.out.println("Ingresa el nombre de la pelicula a buscar");
                String nombrePeliculaBuscar = consola.nextLine();
                Pelicula peliculaBuscar = new Pelicula(nombrePeliculaBuscar);
                servicioPeliculas.buscarPelicula(peliculaBuscar);
                break;

            case 4:
                System.out.println("Hasta luego ... ");
                salir = true;

            default:
                System.out.println("Opción no reconocida: " + opcion);
        }

        return salir;

    }
}