public class Persona {
    //atributos
    private static int numeroPersonas = 0;
    private int id;
    private String nombre;
    private String tel;
    private String email;

    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tel, String email){
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    //getters and setters
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTel(){
        return this.tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //Métodos

    @Override
    public String toString() {
        return
                "ID: " + getId() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Teléfono: " + getTel() + "\n" +
                "Email: " + getEmail() + "\n";
    }
}
