/*
 * Utilizando un HashMap, 
escribe una función que tome una lista de strings 
y cuente cuántas veces aparece cada palabra. 
La función debe devolver un mapa que asocie cada palabra con su número de apariciones.r.
 */
package Servicios;

import Entidad.Palabra2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Claudio Durán
 */
public class ServicioPalabra2 {

    static Scanner leer;
    static HashMap<Integer, String> mapaDePalabras = new HashMap();

    public void Menu() {
        int opc;
        do {
            leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("MENU HASH DE PALABRAS\n"
                    + "1. Agregar palabras al Hash.\n"
                    + "2. Mostrar el contenido del Hash.\n"
                    + "3. Contar apariciones de cada palabra.\n"
                    + "4. Borrar palabra.\n"
                    + "5. Mostrar Hash por toString.\n"
                    + "6. Ordenar por TreeMap.\n"
                    + "7. Salir del menú.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    this.agregarPalabras();
                    break;
                case 2:
                    this.mostrarHash();
                    break;
                case 3:
                    this.contarPalabras();
                    break;
                case 4:
                    this.borrarPalabra();
                    break;
                case 5:
                    this.mostarHash();
                    break;
                case 6:
                    this.mostrarOrdenado();
                    break;
                case 7:
                    System.out.println("Adiosito!!!!!!!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opc != 7);

    }

    public void agregarPalabras() {

        System.out.println("Cargar palabras al HashMap.\n"
                + "Si no desea cargar mas ingrese '0'");
        int cont = mapaDePalabras.size();
        boolean op = true;

        do {
            Palabra2 nueva = new Palabra2();
            String palabra = leer.next();

            if (!palabra.equalsIgnoreCase("0")) {
                nueva.setIndice(cont);
                nueva.setPalabra(palabra);
                mapaDePalabras.put(nueva.getIndice(), nueva.getPalabra());
                cont++;
            } else {
                op = false;
            }
        } while (op == true);
    }

    public void mostrarHash() {

        for (HashMap.Entry<Integer, String> elemento : mapaDePalabras.entrySet()) {
            System.out.print("[" + elemento.getKey() + "] - " + elemento.getValue() + ".\n"
                    + "");
        }

    }

    public void contarPalabras() {
        String aux;
        ArrayList<String> encontradas = new ArrayList();
        for (String palabra : mapaDePalabras.values()) {
            aux = palabra;
            if (!encontradas.contains(aux)) {
                int cont = 0;
                for (String palabra2 : mapaDePalabras.values()) {
                    if (palabra2.equalsIgnoreCase(palabra)) {
                        cont++;
                        encontradas.add(aux);
                    }
                }
                System.out.print("Palabra > " + palabra + " < encontrada " + cont);

                if (cont > 1) {
                    System.out.print(" veces");
                } else {
                    System.out.print(" vez");
                }
                System.out.println("");
            }

        }
    }

    
    
    public void borrarPalabra() {
        System.out.println(" ¿Que palabra desea borrar?");
        String palabra = leer.next();
        int cont = mapaDePalabras.size();
            if (mapaDePalabras.containsValue(palabra)) {
                mapaDePalabras.values().removeAll(Arrays.asList(palabra));
                cont = cont - mapaDePalabras.size();
                System.out.println("La palabra > " + palabra + " < ha sido borrada "+ cont + " veces de la lista.");
            } else {
                System.out.println("La palabra > " + palabra + " <, no ha sido encontrada en la lista.");
        }
    }
    
    public void mostrarOrdenado(){
        
        TreeMap <Integer, String> hashOrdenado = new TreeMap();
        for (Integer clave : mapaDePalabras.keySet()) {
            String contenido = mapaDePalabras.get(clave);
            hashOrdenado.put(clave, contenido);
        }
        for (Map.Entry<Integer, String> object : hashOrdenado.entrySet()) {
            System.out.println("Nº "+object.getKey()+", "+object.getValue()+".");
        }
       }    
    
    public void mostarHash(){
        for (Map.Entry elemento : mapaDePalabras.entrySet()) {
            System.out.println(elemento.toString()); 
        }
    }
}
