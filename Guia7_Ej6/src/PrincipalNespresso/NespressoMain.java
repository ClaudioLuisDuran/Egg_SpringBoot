/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalNespresso;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class NespressoMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera Caf1 = new Cafetera();
        CafeteraServicio Cs = new CafeteraServicio();
        int salir = 0;

        do {
            System.out.println("MENÚ NESPRESSO");
            System.out.println("-------------------------");
            System.out.println("       Opciones    ");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Agregar café");
            System.out.println("4. Vaciar cafetera");
            System.out.println("5. Salir.");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Cs.llenarCafetera(Caf1);
                    salir++;
                    break;
                case 2:
                    System.out.println("Ingrese la capacidad de la taza a llenar (en mililitros):");
                    Cs.servirTaza(leer.nextInt(), Caf1);
                    salir++;
                    break;
                case 3:
                    Cs.agregarCafe(Caf1);
                    salir++;
                    break;
                case 4:
                    Cs.vaciarCafetera(Caf1);
                    salir++;
                    break;
                case 5:
                    System.out.println("Gracias por usar Nespresso!");
                    salir = 0;
                    break;
                default:
                    System.out.println("La opción elegida no existe. No sea nabo....");
            }

        } while (salir > 0);

    }

}
