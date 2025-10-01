package mundoPC.modelo;

public class Monitor {
    //atributos
    private final int idMonitor;
    private String marca;
    private double tamannio;
    private static int contadorMonitores;

    //constructor
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamannio){
        this();
        this.marca = marca;
        this.tamannio = tamannio;
    }

    //toString

    @Override
    public String toString() {
        return "Monitor: " + "\n" +
                "Marca: " + marca + "\n" +
                "Tamaño: " + tamannio + " pulgadas" + "\n" +
                "idMonitor: " + idMonitor + "\n"
                ;
    }
}
