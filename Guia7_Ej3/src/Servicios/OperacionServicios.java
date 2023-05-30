/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;


/**
 *
 * @author Claudio Durán
 */
public class OperacionServicios {

    public Operacion crearOperacion(Operacion op) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer número a atribuir a la nueva operación:");
        op.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número a atribuir a la nueva operación:");
        op.setNumero2(leer.nextInt());
        
        return op;
    }

    public int Sumar(Operacion op) {
       
        int suma;
        suma = op.getNumero1() + op.getNumero2();

        return suma;
    }

    public int Restar(Operacion op) {
        
        int resta;
        resta = op.getNumero1() - op.getNumero2();

        return resta;
    }

    public int Multiplicar(Operacion op) {
       
        int multi;
        multi = op.getNumero1() * op.getNumero2();

        return multi;
    }

    public Double Dividir(Operacion op) {
        
        Double div;

        if (op.getNumero2() != 0) {
            double n1 = (double) op.getNumero1();
            double n2 = (double) op.getNumero2();
            div = (n1 / n2);
        } else {
            div = 0.0;
        }

        return div;
    }

}
