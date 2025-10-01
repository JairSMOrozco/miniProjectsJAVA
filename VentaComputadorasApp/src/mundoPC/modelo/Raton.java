package mundoPC.modelo;

public class Raton extends DispositivoEntrada{
    //atributos
    private final int idRaton;
    private static int contadorRatones;

    //Constructor
    public Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Ratón: " + "\n" +
                super.toString() +
                "idRaton: " + idRaton + "\n";
    }
}
