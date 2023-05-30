package Principal;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 * @author ClaudioDuran
 */
public class MainElectro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Ejercicio 3 (Ejercicio 2 extendido)
        ArrayList<Electrodomestico> listado = new ArrayList();
        for (int i = 1; i <= 8; i++) {
            Lavadora lav;
            Televisor tv;
            switch (i) {
                case 1:
                    lav = new Lavadora(25, 1000, "Verde", 'A', 450);
                    lav.precioFinalLavadora(lav);
                    listado.add(lav);
                    break;
                case 2:
                    lav = new Lavadora(30, 1100, "Rojo", 'B', 500);
                    lav.precioFinalLavadora(lav);
                    listado.add(lav);
                    break;
                case 3:
                    lav = new Lavadora(35, 1200, "Negro", 'E', 550);
                    lav.precioFinalLavadora(lav);
                    listado.add(lav);
                    break;
                case 4:
                    lav = new Lavadora(45, 1400, "Gris", 'F', 250);
                    lav.precioFinalLavadora(lav);
                    listado.add(lav);
                    break;
                case 5:
                    tv = new Televisor(30, false, 800, "Negro", 'B', 15);
                    tv.precioFinalTV(tv);
                    listado.add(tv);
                    break;
                case 6:
                    tv = new Televisor(33, false, 1350, "Rosa", 'E', 17);
                    tv.precioFinalTV(tv);
                    listado.add(tv);
                    break;
                case 7:
                    tv = new Televisor(42, true, 1900, "Azul", 'A', 19);
                    tv.precioFinalTV(tv);
                    listado.add(tv);
                    break;
                case 8:
                    tv = new Televisor(55, true, 2500, "Negro", 'F', 21);
                    tv.precioFinalTV(tv);
                    listado.add(tv);
                    break;
            }
        }

        System.out.println("Electrodoméstico\tPrecio");
        int sumaTotal = 0;
        int i = 0;
        for (Electrodomestico electrodomestico : listado) {
            if (electrodomestico instanceof Lavadora) {
                i++;
                System.out.println(i + " Lavadora\t\t" + electrodomestico.getPrecio());
                sumaTotal = sumaTotal + electrodomestico.getPrecio();
            } else {
                i++;
                System.out.println(i + " Televisor\t\t" + electrodomestico.getPrecio());
                sumaTotal = sumaTotal + electrodomestico.getPrecio();
            }
        }
        System.out.println("  Total Precios\t\t" + sumaTotal);

        //// Ejercicio 2 (inicial)
        //   Lavadora lav = new Lavadora();
        //    Televisor tv = new Televisor();     
        //    lav = lav.crearLavadora();
        //    lav.precioFinalLavadora(lav);
        //    lav.mostrarLavadora(lav);
        //
        //
        //    tv = tv.crearTelevisor();
        //    tv.precioFinalTV(tv);
        //   tv.mostrarTV(tv);
    }
}
