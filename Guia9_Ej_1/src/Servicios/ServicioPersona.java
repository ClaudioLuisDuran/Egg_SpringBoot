package Servicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner leer;

    public Persona crearPersona() {
        leer = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona();

        System.out.println("Cargar cliente.");
        System.out.println("Nombre:");
        p.setNombre(leer.next());
        System.out.println("Apellido:");
        p.setApellido(leer.next());
        System.out.println("Edad:");
        p.setEdad(leer.nextInt());
        System.out.println("DNI:");
        p.setDNI(leer.nextInt());
        return p;
    }

    public void mostrarPersona(ArrayList<Persona> p) {
        System.out.println("Mostrar datos de clientes.");
        if (p.isEmpty() == false) {
            Iterator<Persona> it1 = p.iterator();
            while (it1.hasNext()) {
                Persona per = it1.next();
                System.out.println("Nombre: " + per.getNombre() + " " + per.getApellido() + ".");
                System.out.println("Edad: " + per.getEdad());
                System.out.println("DNI: " + per.getDNI());
                if (per.getPerro() == null) {
                    System.out.println("Perro: No tiene.");
                    System.out.println("");
                } else {
                    System.out.println("Perro: " + per.getPerro().getNombre() + ", " + per.getPerro().getRaza() + " de " + per.getPerro().getEdad() + " años.");
                }
            }
        } else {
            System.out.println("No hay datos en la base de clientes.");
        }

    }

}
