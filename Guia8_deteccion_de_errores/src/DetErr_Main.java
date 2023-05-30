
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class DetErr_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Ejemplos de inicializaciones de distintos tipos
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> palabras = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();

// Ejemplo de lista
        ArrayList<Integer> numerosA = new ArrayList();
        for (int i = 5; i > 0; i--) {
            numerosA.add(i);
        }
        System.out.println("Ejemplo de ArrayList: " + numerosA);
        Collections.sort(numerosA);
        System.out.println("Ejemplo de ArrayList: " + numerosA);

        //Ejemplo de borrado de lista
        numerosA.remove(3);
        System.out.println("Ejemplo de borrado de elem 3 de ArrayList: " + numerosA);

        // Ejemplo de conjuntos Set
        HashSet<Integer> numerosB = new HashSet();
        for (int i = 10; i < 15; i++) {
            numerosB.add(i);
        }
        System.out.println("Ejemplo de HashSet: " + numerosB);

        //Ejemplo de borrado
        numerosB.remove(12);
        System.out.println("Ejemplo de borrar elem 12 de HashSet: " + numerosB);

        // Ejemplo de conjuntos LinketHashSet
        LinkedHashSet<Integer> numerosX = new LinkedHashSet();
        for (int i = 10; i < 15; i++) {
            numerosX.add(i);
        }
        System.out.println("Ejemplo de LinkedHashSet: " + numerosX);
     
        
        
        //Ejemplo de Mapas HashMap
        TreeMap<Integer, String> alumnos = new TreeMap();
        int dni;
        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                dni = (int) (Math.random() * 99);
            } else {
                dni = 17986479;
            }

            String nombre = " ";
            switch (i) {
                case 0:
                    nombre = "Constanza";
                    break;
                case 1:
                    nombre = "Luis";
                    break;
                case 2:
                    nombre = "Walter";
                    break;
                case 3:
                    nombre = "Axel";
                    break;
                case 4:
                    nombre = "Claudio";
            }
            alumnos.put(dni, nombre);
        }
        System.out.println("Ejemplo de TreeMap: " + alumnos);
        
       
        
//        TreeMap<Integer, String> alumnosNuevo = new TreeMap(alumnos);
//        
//        System.out.println("Ejemplo de HashMap: " + alumnosNuevo);

        // Ejemplo de borrado de Mapa
        alumnos.remove(17986479);
        System.out.println("Ejemplo de borrado de llave DNI en HashMap: " + alumnos);

        // Recorrer con ForEach
        // Recorro ArrayList
        System.out.println("Recorro ArrayList numerosA:");
        for (Integer numerosa : numerosA) {
            System.out.println(numerosa);
            System.out.println("");
        }
//Recorro conjunto set
        System.out.println("Recorro conjunto HashSet numerosB:");
        for (Integer numerosb : numerosB) {
            System.out.println(numerosb);
        }

        //Recorro Map
        System.out.println("Recorro HashMap alumnos");
        for (Map.Entry<Integer, String> alumnolistado : alumnos.entrySet()) {
            System.out.println("DNI: " + alumnolistado.getKey());
            System.out.println("Nombre: " + alumnolistado.getValue());
        }

        // ITERATOR. Deteccion de errores:
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }

    }
}
