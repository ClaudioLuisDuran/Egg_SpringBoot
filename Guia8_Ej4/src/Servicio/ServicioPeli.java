package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class ServicioPeli {

    Scanner leer;

    //Crear Pelicula y cargar
    public ArrayList<Pelicula> crearPeli(ArrayList<Pelicula> lista) {
        leer = new Scanner(System.in).useDelimiter("\n");
        String opc = "n";
        do {
            Pelicula nuevaPeli = new Pelicula();
            System.out.println("Nueva película");
            System.out.println("-------------------");
            System.out.print("Ingrese el título: ");
            nuevaPeli.setTitulo(leer.next());
            System.out.print("Ingrese Director: ");
            nuevaPeli.setDirector(leer.next());
            System.out.print("Ingrese duración (en horas: ej. 1,30): ");
            nuevaPeli.setDuracion(leer.nextDouble());
            lista.add(nuevaPeli);
            System.out.println("¿Desea agregar otra película a la lista? (S/N))");
            System.out.println("");
        } while (leer.next().equalsIgnoreCase("s"));
        return lista;
    }

    // Mostrar catálogo
    public void mostrarCatalogo(ArrayList<Pelicula> lista) {
        System.out.println("Título              \tDirector              \tDuración");
        lista.forEach((pelicula) -> {
            System.out.println(pelicula.getTitulo() + "              \t" + pelicula.getDirector() + "         \t" + pelicula.getDuracion());
        });
    }

    //Mostrar catalogo de mas de una hora
    public void mostrarCatalogo1hora(ArrayList<Pelicula> lista) {
        System.out.println("Título                   \tDirector                   \tDuración");
        lista.forEach((pelicula) -> {
            if (pelicula.getDuracion() >= 1) {
                System.out.println(pelicula.getTitulo() + "                   \t" + pelicula.getDirector() + "              \t" + pelicula.getDuracion());
            }

        });
    }

    //Borrar peli por titulo
    public void borrarPeli(ArrayList<Pelicula> lista) {
        Iterator<Pelicula> it = lista.iterator();
        String titulo;
        boolean flag = true;
        System.out.println("Ingrese el titulo de la pelicula que desea borrar de la lista:");
        titulo = leer.next();
        while (it.hasNext()) {
            if (it.next().getTitulo().equalsIgnoreCase(titulo)) {
                it.remove();
                System.out.println("El título " + titulo + " has sido borrado del catálogo.");
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("No se encuentra el título en el catálogo");
        }
    }
}
