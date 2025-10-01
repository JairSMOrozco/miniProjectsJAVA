import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);

        try{
            int opcionOperacion = 0;
            double resultado = 0;

            do{
                System.out.println("***** Aplicación Calculadora *****");
                System.out.println("1.- Suma");
                System.out.println("2.- Resta");
                System.out.println("3.- Multiplicación");
                System.out.println("4.- División");
                System.out.println();
                System.out.println("0.- Salir");

                System.out.println("Selecciona la operación a realizar");
                opcionOperacion = entradaScanner.nextInt();

                switch(opcionOperacion){
                    case 1:
                        Operaciones operacionSuma = new Operaciones();
                        resultado = operacionSuma.procesoSuma();
                        System.out.println("El resultado de la suma es : " + resultado);
                        if(!operacionSuma.hacerOtraOperacion()){
                            opcionOperacion = 0;
                        }
                        break;

                    case 2:
                        Operaciones operacionResta = new Operaciones();
                        resultado = operacionResta.procesoResta();
                        System.out.println("El resultado de la resta es : " + resultado);
                        if(!operacionResta.hacerOtraOperacion()){
                            opcionOperacion = 0;
                        }
                        break;
                    case 3:
                        Operaciones operacionMultiplicacion = new Operaciones();
                        resultado = operacionMultiplicacion.procesoMultiplicacion();
                        System.out.println("El resultado de la multiplicción es : " + resultado);
                        if(!operacionMultiplicacion.hacerOtraOperacion()){
                            opcionOperacion = 0;
                        }
                        break;
                    case 4:
                        Operaciones operacionDivision = new Operaciones();
                        resultado = operacionDivision.procesoDivision();
                        System.out.println("El resultado de la división es : " + resultado);
                        if(!operacionDivision.hacerOtraOperacion()){
                            opcionOperacion = 0;
                        }
                        break;
                    case 0:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Ingresa una opción válida");;
                }

            }while(opcionOperacion != 0);

            System.out.println("Hasta luego");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
