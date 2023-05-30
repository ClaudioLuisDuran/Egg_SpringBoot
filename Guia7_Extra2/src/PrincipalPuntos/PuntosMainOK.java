/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalPuntos;

import Entidades.Puntos;
import Servicios.ServicioPuntos;

/**
 *
 * @author Claudio Durán
 */
public class PuntosMainOK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Puntos p1 = new Puntos();
       ServicioPuntos Sp = new ServicioPuntos();
       p1 = Sp.crearPuntos();
        System.out.println("La distancia entre los puntos (" + p1.getX1() + ","+p1.getY1()+ ") y ("+p1.getX2()+","+p1.getY2()+") es: "+ Sp.calcularDistancia(p1)+".");
    }
    
}
