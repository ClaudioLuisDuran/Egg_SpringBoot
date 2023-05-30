package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado v) {
        String palabra;
        int largo;
        System.out.println("        AHORCADO");
        System.out.println("        -----------");
        System.out.println("Ingrese la palabra a adivinar:");
        palabra = leer.next();
        largo = palabra.length();
        String[] aux = new String[largo];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = palabra.substring(i, (i + 1));
        }
        v.setVectorPalabra(aux);
        System.out.println("Ingrese la cantidad máxima de jugadas permitidas:");
        v.setJugMax(leer.nextInt());
        v.setEncontradas(0);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void longitud(Ahorcado v) {
        System.out.println("        BIENVENIDO AL AHORCADO");
        System.out.println("        ------------------------------");
        System.out.println("La palabra que debe adivinar tiene " + v.getVectorPalabra().length + " letras.");
    }

    public void buscar(String letra, Ahorcado v) {
        int cont = 0;
        for (int i = 0; i < v.getVectorPalabra().length; i++) {
            if (letra.equalsIgnoreCase(v.getVectorPalabra()[i])) {
                System.out.println("La letra '" + letra + "' pertenece a la palabra.");
                i = v.getVectorPalabra().length;
            } else {
                cont++;
                if (cont == v.getVectorPalabra().length) {
                    System.out.println("La letra '" + letra + "' no pertenece a la palabra.");
                }
            }
        }
    }

    public boolean encontradas(String letra, Ahorcado v) {
        boolean encontrada = false;
        int cont = 0;
        for (int i = 0; i < v.getVectorPalabra().length; i++) {
            if (letra.equalsIgnoreCase(v.getVectorPalabra()[i])) {
                cont++;
                encontrada = true;
            }
        }
        System.out.println("Letras '" + letra + "' encontradas: " + cont);
        v.setEncontradas(v.getEncontradas() + cont);
        System.out.println(v.getEncontradas() + " letras encontradas!! Falta encontrar... " + (v.getVectorPalabra().length - v.getEncontradas()) + " letras!");
        return encontrada;
    }

    public void intentos(Ahorcado v) {
        v.setJugMax(v.getJugMax() - 1);
        System.out.println("Le quedan " + v.getJugMax() + " intentos.");
    }

    ////JUEGO
    
    public void juego(Ahorcado v) {
        this.crearJuego(v);
        String[] aux = new String[v.getVectorPalabra().length];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = "_";
        }
        this.longitud(v);
        do {

            System.out.println("-------------------");
            System.out.println("Ingrese una letra:");
            String letra = leer.next();
            this.buscar(letra, v);
            boolean esta = this.encontradas(letra, v);

            if (esta == true) {

                for (int i = 0; i < v.getVectorPalabra().length; i++) {
                    if (v.getVectorPalabra()[i].equalsIgnoreCase(letra)) {
                        aux[i] = letra;
                    }
                }
            }
            // mostrar aux
            for (int i = 0; i < aux.length; i++) {
                System.out.print("[ " + aux[i] + " ]");
            }
            System.out.println("");

            if (v.getEncontradas() != v.getVectorPalabra().length) {
                this.intentos(v);
            }
        } while (v.getJugMax() != 0 && v.getEncontradas() != v.getVectorPalabra().length);

        if (v.getEncontradas() == v.getVectorPalabra().length) {
            System.out.println("Felicitaciones!!! ");
            System.out.print("Descubrió la palabra '");
            for (int i = 0; i < v.getVectorPalabra().length; i++) {
                System.out.print(v.getVectorPalabra()[i]);
            }
            System.out.print("' y aún le quedaban " + (v.getJugMax() - 1) + " intentos.");
            System.out.println("");
        } else {
            System.out.println("Lo siento. No le quedan más intentos. La palabra era: ");
            for (int i = 0; i < v.getVectorPalabra().length; i++) {
                System.out.print(v.getVectorPalabra()[i]);
            }
            System.out.print(".");
            System.out.println("");
        }
        System.out.println("        --------------------------");
        System.out.println("        Gracias por jugar!!!!!");
        System.out.println("        --------------------------");
    }
}
