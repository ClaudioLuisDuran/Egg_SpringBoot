/*
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        this.a = leer.nextInt();
        System.out.print("Ingrese el valor de b: ");
        this.b = leer.nextInt();
        System.out.print("Ingrese el valor de c: ");
        this.c = leer.nextInt();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}
