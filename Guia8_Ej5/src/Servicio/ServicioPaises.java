
package Servicio;

import Entidad.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioPaises {

    HashSet<Paises> listaPaises = new HashSet();
    Scanner leer;
    
//Menu
    public void Menu() {
        System.out.println("PAISES DEL MUNDO");
        leer = new Scanner(System.in).useDelimiter("\n");
        Integer opc;
        do {
            System.out.println("1. Cargar paises\n"
                    + "2. Mostrar paises alfabéticamente\n"
                    + "3. Borrar un pais\n"
                    + "4. Salir");
            System.out.println("x");
            opc = leer.nextInt();
            System.out.println("xx");
            switch (opc) {
                case 1:
                    cargarPaises();
                    break;
                case 2:
                    ordenaAlfabeticamente();
                    break;
                case 3:
                    borrarPais();
                    break;
                default:
                    System.out.println("la opción " + opc + " no existe. Elija correctamente.");
            }
        } while (opc != 4);

    }

    // Cargar Paises.
    public void cargarPaises() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CARGAR PAISES");
        do {
            System.out.println("Nombre del país:");
            Paises pais = new Paises(leer.next());
            listaPaises.add(pais);
            System.out.println("Desea cargar otro pais? (S/N)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    //Ordenar Paises alfabeticamente  
    public void ordenaAlfabeticamente() {
        System.out.println("PAISES CARGADOS");
        System.out.println(listaPaises);
        //convierto la HashList en ArrayList para poder ordenarlo
        ArrayList<Paises> arrayPaises = new ArrayList(listaPaises);
        arrayPaises.sort(Paises.comparar);
        arrayPaises.forEach((nombres) -> {
            System.out.println(nombres.getNombre());
        });
    }

    // Borrar un pais
    public void borrarPais() {
        String flag = "";
        leer = new Scanner(System.in).useDelimiter("\n");
        Iterator<Paises> it = listaPaises.iterator();
        System.out.println("BORRAR PAIS");
        System.out.println("Ingrese el país que desea borrar:");
        String pais = leer.next();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(pais)) {
                it.remove();
                System.out.println(pais + " ha sido borrado exitosamente.");
                this.ordenaAlfabeticamente();
            }else{
                flag = "x";
            }
        }
        if (flag.equals("x")) {
            System.out.println("El país ingresado ("+pais+") no está en la lista.");
        }
        
    }
}
