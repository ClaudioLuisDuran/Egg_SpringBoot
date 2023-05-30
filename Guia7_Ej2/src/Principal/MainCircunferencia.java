/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class MainCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CircunferenciaServicio Cs = new CircunferenciaServicio();

        Double radio;
        Circunferencia c1 = new Circunferencia();

        System.out.println("Ingrese el radio de la circunferencia a crear:");
        radio = leer.nextDouble();
        c1 = Cs.crearCircunferencia(radio);
        System.out.println("La circunferencia ha sido creada y tiene un radio de " + c1.getRadio());
        
        System.out.println("El área de circulo de radio " + c1.getRadio() + " es " + Cs.area(radio));
        
        System.out.println("Y el prímetro del mismo es " + Cs.perimetro(radio));
        
        System.out.println("Los parámetros de su objeto c1 son => " + c1.toString());
    }

}
