import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        int opcionElegida;
        String nombrePersona;
        String telefonoPersona;
        String emailPersona;


        do{
            System.out.println("**** Listado Personas ****");
            System.out.println("1.- Agregar");
            System.out.println("2.- Listar");
            System.out.println("3.- Salir");
            System.out.println("Proporciona la opción deseada");

            try{
                opcionElegida = entradaDatos.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Ingresa una opción numérica válida. No letras.");
                entradaDatos.nextLine();
                opcionElegida = 0;
                continue;
            }

                switch (opcionElegida){
                    case 1:
                        entradaDatos.nextLine();
                        System.out.println("Ingresa los datos de la persona a agregar");

                        System.out.print("Nombre: ");
                        nombrePersona = entradaDatos.nextLine();

                        System.out.print("Teléfono: ");
                        telefonoPersona = entradaDatos.nextLine();

                        System.out.print("Email: ");
                        emailPersona = entradaDatos.nextLine();

                        Persona persona = new Persona(nombrePersona,telefonoPersona,emailPersona);
                        personas.add(persona);
                        System.out.println("Se agregó a " + persona.getNombre() + " a la lista");
                        System.out.println("La lista tiene " + personas.size() +  " elementos");
                        System.out.println("Enter para continuar");
                        entradaDatos.nextLine();
                        break;
                    case 2:
                        if(personas.isEmpty()){
                            System.out.println("La lista está vacía");
                        }else{
                            for(Persona registro : personas){
                                System.out.println(registro);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Elige una opción entre 1 y 3");

                }

        }while (opcionElegida != 3);

    }
}