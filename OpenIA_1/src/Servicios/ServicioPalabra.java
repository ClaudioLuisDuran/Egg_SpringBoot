/*
 * Utilizando un ArrayList, escribe una función que tome una lista de strings y elimine todos los elementos que tengan una longitud impar.
 */
package Servicios;

import Entidades.Palabra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioPalabra {

    Scanner leer;
    ArrayList<Palabra> listadoPalabras = new ArrayList();

    public void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public void menu() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("MENÚ STRINGS\n"
                    + "1. Agregar Palabras al Listado\n"
                    + "2. Mostrar Listado de palabras\n"
                    + "3. Mostrar palabras pares\n"
                    + "4. Mostrar palabras impares\n"
                    + "5. Borrar palabras impares y mostrar lista.\n"
                    + "6. Salir del programa.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    this.crearLista();
                    break;
                case 2:
                    this.mostrarLista();

                    break;
                case 3:
                    this.mostrarPares();
                    break;
                case 4:
                    this.mostrarImpares();
                    break;
                case 5:
                    this.borrarImpares();
                    break;
                case 6:
                    System.out.println("Adiosito!!!");
                    break;
                default:
                    System.out.println("¿Donde vio la opción " + opc + "????... Paparulo....");
            }
        } while (opc != 6);
    }

    public void crearLista() {
        String opc;
        boolean x;
        leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("Ingrese una palabra:");
            Palabra palabra = new Palabra();
            palabra.setPalabra(leer.next());
            listadoPalabras.add(palabra);
            System.out.println("Quiere cargar otra palabra (S/N)");
            opc = leer.next();
            if (opc.equalsIgnoreCase("s")) {
                x = false;
            } else {
                x = true;
            }
        } while (x == false);
        this.clearScreen();
    }

    public void mostrarLista() {
        
        if (listadoPalabras.isEmpty()) {
            System.out.println("El listado esta vacío.");
        } else {
            for (Palabra elemento : listadoPalabras) {
                System.out.println("[ " + elemento.getPalabra() + " ]");
            }
        }
    }

    public void mostrarPares() {
        this.clearScreen();
        if (listadoPalabras.isEmpty()) {
            System.out.println("El listado esta vacío.");
        } else {
            for (Palabra elemento : listadoPalabras) {
                if (elemento.getPalabra().length() % 2 == 0) {
                    System.out.println("[ " + elemento.getPalabra() + " ]");
                }
            }
        }
    }

    public void mostrarImpares() {
        this.clearScreen();
        if (listadoPalabras.isEmpty()) {
            System.out.println("El listado esta vacío.");
        } else {
            for (Palabra elemento : listadoPalabras) {
                if (elemento.getPalabra().length() % 2 != 0) {
                    System.out.println("[ " + elemento.getPalabra() + " ]");
                }
            }
        }
    }

    public void borrarImpares() {
      
        Iterator<Palabra> it = listadoPalabras.iterator();
        while (it.hasNext()) {
            if (it.next().getPalabra().length() % 2 != 0) {
                it.remove();
            }
        }
        System.out.println("La lista actualizada:");
        this.mostrarLista();
    }

}
