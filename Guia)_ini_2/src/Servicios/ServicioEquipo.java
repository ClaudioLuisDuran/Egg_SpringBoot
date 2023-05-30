
package Servicios;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class ServicioEquipo {

    Scanner leer;
    ServiciosJugador Sj = new ServiciosJugador();

    public Equipo crearEquipo(Equipo e) {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nombre del Equipo:");
        e.setNombre(leer.next());
        return e;
    }

    public Equipo cargarJugadores(Equipo e) {
        ArrayList equipo = new ArrayList();
        System.out.println("Ingrese los 5 jugadores del equipo " + e.getNombre() + ":");
        int cont = 0;
        do {
            equipo.add(Sj.crearJugador());
            cont++;
        } while (cont < 6);
        e.setJugadores(equipo);
        return e;
    }
    
    public void mostrarEquipo(Equipo e){
        
        System.out.println("Equipo: "+e.getNombre()+".");
        
        Iterator <Jugador> it = e.getJugadores().iterator();
        while(it.hasNext()){
            Jugador j = it.next();
            System.out.println(j.getNumero()+" - "+ j.getPosicion()+": "+ j.getApellido()+", "+j.getNombre()+".");
        }
        System.out.println("");
    }
}
