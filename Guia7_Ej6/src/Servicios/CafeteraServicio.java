package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera llenarCafetera(Cafetera caf) {

        System.out.println("Llenado automático de la cafetera");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese la capacidad máxima de la cafetera (en mililitros):");
        caf.setCapacidadMaxima(leer.nextInt());
        caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada a su máxima capacidad: " + caf.getCapacidadMaxima());

        return caf;
    }

    public void servirTaza(int taza, Cafetera caf) {

        System.out.println("Servido automático de taza");
        System.out.println("----------------------------------");
        System.out.println("Llenando taza...");
        if (caf.getCantidadActual() < taza) {
            System.out.println("La taza no se llenó completa porque en la cafetera solo había " + caf.getCantidadActual() + " mlts. de café.");
            System.out.println("No queda mas café en la cafetera.");
            caf.setCantidadActual(0);
        } else {
            System.out.println("La taza está llena.");
            caf.setCantidadActual(caf.getCantidadActual() - taza);
            System.out.println("En la cafetera quedan " + caf.getCantidadActual() + " mlts. de café disponible.");

        }

    }

    public void vaciarCafetera(Cafetera caf) {

        System.out.println("Sistema automático de vaciado de cafetera.");
        System.out.println("-------------------------------------------------------");
        System.out.println("Vaciando cafetera....");
        caf.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe(Cafetera caf) {

        System.out.println("Sistema para agregar café a la cafetera");
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("En su cafetera hay disponible " + (caf.getCapacidadMaxima() - caf.getCantidadActual()) + " mlts. para rellenar");
        int corregir = 0;
        do {
            System.out.println("Ingrese la cantidad a rellenar (en mililitros):");
            int relleno = leer.nextInt();
            if (relleno > (caf.getCapacidadMaxima() - caf.getCantidadActual())) {
                System.out.println("Cuidado, ha ingresado un valor mayor a la capacidad disponible. Corrija el valor.");
                corregir++;
            } else {
                caf.setCantidadActual(caf.getCantidadActual() + relleno);
                System.out.println("Relleno exitoso. La cafetera tiene " + caf.getCantidadActual() + " mlts. de café disponible.");
            }

        } while (corregir > 0);

    }
}
