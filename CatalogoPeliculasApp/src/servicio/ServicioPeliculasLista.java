package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas{
    //atributos
    private final List<Pelicula> peliculas;

    //Constructor
    public ServicioPeliculasLista() {
        this.peliculas = new ArrayList<>();
    }

    //Métodos
    @Override
    public void listarPeliculas() {
        System.out.println("Lista de películas");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getNombre());
        }
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agregó la película " + pelicula.getNombre() + " al listado.");
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        //Regresa el índice de la película encontrada en la lista
        int index = peliculas.indexOf(pelicula);

        if(index == -1){
            System.out.println("La película " + pelicula.getNombre() + " no fue encontrada en el listado.");

        }else{
            System.out.println("Película " + pelicula.getNombre() + " encontrada en la posición " + (index + 1) + " de la lista");
        }


    }
}
