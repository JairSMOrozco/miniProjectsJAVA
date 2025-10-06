package dominio;

import java.util.Objects;

public class Pelicula {

    //atributos
    private String nombre;

    //constructores
    public Pelicula(){}

    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    //getters setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(nombre, pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    @Override
    public String toString() {
        return this.nombre + "\n";
    }
}
