import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {
    Scanner entradaOperandos = new Scanner(System.in);
    Scanner entradaOtraOperacion = new Scanner(System.in);

    //Atributos
    double operando1 = 0;
    double operando2 = 0;
    double resultado = 0;
    int otraOperacion = 0;
    boolean numerosValidos = false;

    //Métodos
    public double procesoSuma(){
        do{
            try{
                System.out.println("Ingresa el primer número a sumar");
                operando1 = entradaOperandos.nextDouble();
                System.out.println("Ingresa el segundo número a sumar");
                operando2 = entradaOperandos.nextDouble();

                numerosValidos = true;

                resultado = operando1 + operando2;
                entradaOperandos.nextLine();

            }catch(InputMismatchException ime){
                System.out.println("Ingrese un valor válido");
                entradaOperandos.nextLine();
                numerosValidos = false;
            }

        }while(!numerosValidos);

        return resultado;

    }

    public double procesoResta(){
        do{
            try{
                System.out.println("Ingresa el primer número a restar");
                operando1 = entradaOperandos.nextDouble();
                System.out.println("Ingresa el segundo número a restar");
                operando2 = entradaOperandos.nextDouble();

                numerosValidos = true;

                resultado = operando1 - operando2;
                entradaOperandos.nextLine();

            }catch(InputMismatchException ime){
                System.out.println("Ingrese un valor válido");
                entradaOperandos.nextLine();
                numerosValidos = false;
            }

        }while(!numerosValidos);

        return resultado;

    }


    public double procesoMultiplicacion() {
        do{
            try{
                System.out.println("Ingresa el primer número a multiplicar");
                operando1 = entradaOperandos.nextDouble();
                System.out.println("Ingresa el segundo número a multiplicar");
                operando2 = entradaOperandos.nextDouble();

                numerosValidos = true;

                resultado = (operando1 * operando2);
                entradaOperandos.nextLine();

            }catch(InputMismatchException ime){
                System.out.println("Ingrese un valor válido");
                entradaOperandos.nextLine();
                numerosValidos = false;
            }

        }while(!numerosValidos);

        return resultado;
    }

    public double procesoDivision() {
        do{
            try{
                System.out.println("Ingresa el número a dividir(dividendo)");
                operando1 = entradaOperandos.nextDouble();
                System.out.println("Ingresa el numero que dividirá(divisor)");
                operando2 = entradaOperandos.nextDouble();

                numerosValidos = true;

                resultado = (operando1 / operando2);

                if(Double.isInfinite(resultado)){
                    System.out.println("No se puede dividir entre 0. Ingrese una cifra válida");
                    entradaOperandos.nextLine();
                    numerosValidos = false;
                }
                entradaOperandos.nextLine();

            }catch(InputMismatchException ime){
                System.out.println("Ingrese un valor válido");
                entradaOperandos.nextLine();
                numerosValidos = false;
            }

        }while(!numerosValidos);

        return resultado;
    }

    public boolean hacerOtraOperacion(){
        System.out.println("¿Desea hacer otra operación?");
        System.out.println("1.- Si");
        System.out.println("2.- No");

        otraOperacion = entradaOperandos.nextInt();

        if (otraOperacion == 1) {
            return true;
        }else {
            return false;
        }

    }
}
