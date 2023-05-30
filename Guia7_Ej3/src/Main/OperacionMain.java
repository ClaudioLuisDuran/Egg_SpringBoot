/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Operacion;
import Servicios.OperacionServicios;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        OperacionServicios Os = new OperacionServicios();
        Operacion op1 = new Operacion();
        
        op1 = Os.crearOperacion(op1);
        
        System.out.println("Se ha creado su operación op1 con los siguientes atributos:");
        System.out.println("número1 => " + op1.getNumero1());
        System.out.println("número2 => " + op1.getNumero2());

        System.out.println("La suma de ambos atributos es -> " + op1.getNumero1() + " + " + op1.getNumero2() + " = " + Os.Sumar(op1));

        System.out.println("La resta de ambos atributos es -> " + op1.getNumero1() + " - " + op1.getNumero2() + " = " + Os.Restar(op1));

        System.out.println("El producto de ambos atributos es -> " + op1.getNumero1() + " * " + op1.getNumero2() + " = " + Os.Multiplicar(op1));

        if (Os.Dividir(op1) != 0) {
            System.out.println("La división de ambos atributos es -> " + op1.getNumero1() + " / " + op1.getNumero2() + " = " + Os.Dividir(op1));
        } else {
            System.out.println("La división por cero no es posible.");
        }

    }
}
