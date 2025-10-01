package mundoPC.modelo;

public class Teclado extends DispositivoEntrada{
    //atributos
    private final int idTeclado;
    private static int contadorTeclado;

    //constructor
    public Teclado(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        this.idTeclado = ++contadorTeclado;
    }

    //toString

    @Override
    public String toString() {
        return "Teclado: " + "\n" +
                super.toString() +
                "idTeclado: " + idTeclado + "\n";
    }
}
