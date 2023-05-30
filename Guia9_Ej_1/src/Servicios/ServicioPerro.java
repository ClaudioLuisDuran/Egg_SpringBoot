package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerro {

    private Scanner leer;

    public Perro crearPerro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        Perro p = new Perro();
        System.out.println("Ingresar nuevo perrito:");
        System.out.println("Nombre: ");
        p.setNombre(leer.next());
        System.out.println("Raza:");
        p.setRaza(leer.next());
        System.out.println("Tamaño:");
        p.setTamanio(leer.next());
        System.out.println("Edad:");
        p.setEdad(leer.nextInt());
        return p;
    }

    public void mostrarPerro(ArrayList<Perro> p) {
        System.out.println("Mostrar listado de perritos.");
        if (p.isEmpty() == false) {
            Iterator<Perro> it = p.iterator();
            while (it.hasNext()) {
                Perro perro = it.next();
                System.out.println("Nombre: " + perro.getNombre());
                System.out.println("Raza: " + perro.getRaza());
                System.out.println("Edad: " + perro.getEdad());
                System.out.println("Tamaño: " + perro.getTamanio());
                if (perro.isAdoptado()==true) {
                    System.out.println("El perro "+perro.getNombre()+" ya está adoptado");
                }else{
                    System.out.println("El "+perro.getNombre()+" está disponible para adopción.");
                }
                System.out.println("---------------------------------");
            }
        } else {
            System.out.println("No hay datos en la base de perros.");
        }
    }

    public ArrayList<Persona> adoptarPerro(ArrayList<Persona> per, ArrayList<Perro> ps) {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Adopción de perrito.");
        System.out.println("Ingrese el DNI del cliente:");
        int dni = leer.nextInt();
        Iterator<Persona> it = per.iterator();
        while (it.hasNext()) {
            Persona persona = it.next();
            if (persona.getDNI() == dni) {

                System.out.println("Los perritos disponibles son:");
                int cont = 0;
                for (Perro p1 : ps) {
                    if (p1.isAdoptado() == false) {
                        System.out.println(p1.getNombre() + ", " + p1.getEdad() + " años, raza " + p1.getRaza() + ", tamaño " + p1.getTamanio() + ".");
                        cont++;
                    }
                }
                if (cont == 0) {
                    System.out.println("No hay perritos disponibles para adopción. Vuelve mañana.");
                } else {
                    //proceso de adpcion
                    System.out.println(persona.getNombre()+", de la lista mostrada, ingresa el nombre del perro a adoptar:");
                    String nombre = leer.next();
                    for (Perro p1 : ps) {
                        if (p1.getNombre().equalsIgnoreCase(nombre)) {
                            persona.setPerro(p1);
                            System.out.println("¡¡¡Felicitaciones "+persona.getNombre()+"!!! " + p1.getNombre() + " ya es de tu familia!!!");
                        } else {
                            System.out.println("O escribiste mal el nombre o el perro ya fue adptado.");
                        }
                    }
                }
            }else{
                System.out.println("No hay ningún cliente cargado con el DNI "+dni+".");
            }
        }
        return per;
    }
}
