/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Servicio.ServicioVector;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class MainVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioVector Sv = new ServicioVector();
        System.out.println("Ingrese la cantidad de posiciones del primer vector a crear");
        Integer[] Vec1 = new Integer[leer.nextInt()];
        Sv.crearVector(Vec1);
        Sv.mostrarVector(Vec1);
        System.out.println("Ingrese la cantidad de posiciones del primer vector a crear");
        
        double[] Vec2 = new double[leer.nextInt()];
        Sv.crearVector2(Vec2);
        Sv.mostrarVector2(Vec2);
        Sv.ordenarVector(Vec1);
        Sv.mostrarVector(Vec1);
        Sv.copiarYrellenar(Vec1, Vec2);
        Sv.mostrarVector2(Vec2);
    }
}
