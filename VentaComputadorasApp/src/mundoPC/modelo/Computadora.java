package mundoPC.modelo;

public class Computadora {
    //atributos
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    //Constructor
    private Computadora(){
        this.idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //
    @Override
    public String toString() {
        return "Computadora: " + "\n" +
                "idComputadora: " + idComputadora + "\n" +
                "Nombre: " + nombre + "\n" +
                monitor +
                teclado +
                raton
                ;
    }
}
