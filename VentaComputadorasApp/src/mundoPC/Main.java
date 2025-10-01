package mundoPC;

import mundoPC.modelo.Computadora;
import mundoPC.modelo.Monitor;
import mundoPC.modelo.Raton;
import mundoPC.modelo.Teclado;
import mundoPC.servicio.Orden;

public class Main {
    public static void main(String[] args) {

        //Ratones
        Raton ratonLenovoBluetooth = new Raton("Bluetooth","Lenovo");
        Raton ratonLenovoAlambrico = new Raton("Alámbrico","Lenovo");
        Raton ratonDellBluetooth = new Raton("Bluetooth", "Dell");
        Raton ratonDellAlambrico = new Raton("Alámbrico","Dell");
        Raton ratonGenericoBluetooth = new Raton("Bluetooth","*****");
        Raton ratonGenericoAlambrico = new Raton("Alámbrico","*****");

        //Teclados
        Teclado tecladoLenovoBluetooth = new Teclado("Bluetooth","Lenovo");
        Teclado tecladoLenovoAlambrico = new Teclado("Alámbrico","Lenovo");
        Teclado tecladoHyperExBluetooth = new Teclado("Bluetooth","HyperEx");
        Teclado tecladoHyperExAlambrico = new Teclado("Alámbrico","HyperEx");
        Teclado tecladoGenericoBluetooth = new Teclado("Bluetooth","*****");
        Teclado tecladoGenericoAlambrico = new Teclado("Alámbrico","*****");


        //Monitores
        Monitor monitorLenovo24 = new Monitor("Lenovo", 24);
        Monitor monitorLenovo27 = new Monitor("Lenovo", 27);
        Monitor monitorDell24 = new Monitor("Lenovo", 27);
        Monitor monitorDell27 = new Monitor("Lenovo", 27);
        Monitor monitorSamsung24 = new Monitor("Lenovo", 27);
        Monitor monitorSamsung27 = new Monitor("Lenovo", 27);
        Monitor monitorAsus24 = new Monitor("Lenovo", 27);
        Monitor monitorAsus27 = new Monitor("Lenovo", 27);
        Monitor monitorBenq24 = new Monitor("Lenovo", 27);
        Monitor monitorBenq27 = new Monitor("Lenovo", 27);


        //Computadoras
        Computadora computadoraLenovoOficina = new Computadora("PC-Lenovo-Oficina", monitorLenovo24, tecladoLenovoBluetooth, ratonLenovoBluetooth);
        Computadora computadoraLenovoGamer = new Computadora("PC-Lenovo-Gamer", monitorLenovo27, tecladoLenovoAlambrico, ratonLenovoAlambrico);

        Computadora computadoraDellPro = new Computadora("PC-Dell-Pro", monitorDell24, tecladoHyperExBluetooth, ratonDellBluetooth);
        Computadora computadoraDellOffice = new Computadora("PC-Dell-Office", monitorDell27, tecladoGenericoAlambrico, ratonDellAlambrico);

        Computadora computadoraSamsungWork = new Computadora("PC-Samsung-Work", monitorSamsung24, tecladoLenovoBluetooth, ratonGenericoBluetooth);
        Computadora computadoraSamsungDesign = new Computadora("PC-Samsung-Design", monitorSamsung27, tecladoHyperExAlambrico, ratonDellBluetooth);

        Computadora computadoraAsusMini = new Computadora("PC-Asus-Mini", monitorAsus24, tecladoGenericoBluetooth, ratonLenovoAlambrico);
        Computadora computadoraAsusUltra = new Computadora("PC-Asus-Ultra", monitorAsus27, tecladoHyperExBluetooth, ratonGenericoBluetooth);

        Computadora computadoraBenqHome = new Computadora("PC-Benq-Home", monitorBenq24, tecladoGenericoAlambrico, ratonGenericoAlambrico);
        Computadora computadoraBenqCreator = new Computadora("PC-Benq-Creator", monitorBenq27, tecladoHyperExAlambrico, ratonDellAlambrico);

        Computadora computadoraGenericaOne = new Computadora("PC-Generica-One", monitorAsus24, tecladoLenovoAlambrico, ratonGenericoBluetooth);
        Computadora computadoraGenericaTwo = new Computadora("PC-Generica-Two", monitorSamsung24, tecladoGenericoBluetooth, ratonLenovoBluetooth);


        //Ordenes
        Orden orden501 = new Orden();
        Orden orden604 = new Orden();
        Orden orden610 = new Orden();
        Orden orden700 = new Orden();
        Orden orden701 = new Orden();

        orden501.agregarComputadora(computadoraAsusMini);
        orden501.agregarComputadora(computadoraGenericaTwo);

        orden501.mostrarOrden();
    }
}