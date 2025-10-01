package mundoPC.modelo;

public class DispositivoEntrada {
    //atributos
    private String tipoDeEntrada;
    private String marca;

    //Constructores
    public DispositivoEntrada(String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    };

    //

    @Override
    public String toString() {
        return "Tipo de entrada: " + tipoDeEntrada + "\n" +
                "Marca: " + marca + "\n";
    }


}
