/*
 * Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioPuntos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Puntos crearPuntos() {
        Puntos p = new Puntos();
        System.out.println("Crear puntos");
        System.out.println("------------------");
        System.out.println("Ingrese las coordenadas de ambos puntos.");
        System.out.print("X1 ->");
        p.setX1(leer.nextInt());
        System.out.print("Y1 ->");
        p.setY1(leer.nextInt());
        System.out.print("X2 ->");
        p.setX2(leer.nextInt());
        System.out.print("Y2 ->");
        p.setY2(leer.nextInt());
        return p;
    }
public double calcularDistancia(Puntos p){
    double distancia;
    distancia = Math.sqrt(Math.pow((p.getX2()-p.getX1()),2)+Math.pow((p.getY2()-p.getY1()),2));    
    return distancia;
}
}
