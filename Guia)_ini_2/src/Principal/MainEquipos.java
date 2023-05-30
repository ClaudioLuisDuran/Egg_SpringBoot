/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Equipo;
import Servicios.ServicioEquipo;

/**
 *
 * @author Claudio Durán
 */
public class MainEquipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ServicioEquipo Se = new ServicioEquipo();
       Equipo e1 = new Equipo();
       Equipo e2 = new Equipo();
        System.out.println("Crear Equipo 1:");
        Se.crearEquipo(e1);
        System.out.println("Crear Equipo 2:");
        Se.crearEquipo(e2);
        System.out.println("Carga de jugadores Equipo 1:");
        Se.cargarJugadores(e1);
        System.out.println("Carga de jugadores Equipo 2:");
        Se.cargarJugadores(e2);
        System.out.println("Los equipos se conforman de la siguiente manera:");
        Se.mostrarEquipo(e1);
        Se.mostrarEquipo(e2);
    
    }
}
