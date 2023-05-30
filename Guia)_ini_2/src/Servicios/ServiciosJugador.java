/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServiciosJugador {
    Scanner leer;
    public Jugador crearJugador(){
        leer = new Scanner(System.in).useDelimiter("\n");
        Jugador jug = new Jugador();
        System.out.println("Ingrese Apellido del jugador:");
        jug.setApellido(leer.next());
        System.out.println("Ingrese el nombre:");
        jug.setNombre(leer.next());
        System.out.println("Ingrese posición de juego:");
        jug.setPosicion(leer.next());
        System.out.println("Ingrese número:");
        jug.setNumero(leer.nextInt());
        return jug;
    }
    
}
