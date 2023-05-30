/*
 *En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada.
 */
package Principal;

import Entidades.Cadena;
import Servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class MainCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCadena Sc = new ServicioCadena();
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       Cadena C1 = new Cadena();
       Cadena C2 = new Cadena();
        System.out.println("Ingrese una cadena de caracteres:");
        C1.setFrase(leer.next());
        C1.setLongitud(C1.getFrase().length());
        System.out.println("La cadena y su longitud (" + C1.getLongitud()+ ") han sido cargados.");
        System.out.println("");
        Sc.mostrarVocales(C1);
        Sc.invertirFrase(C1);
        System.out.println("Ingrese una letra para contar las veces que aparezca en la frase:");
        Sc.vecesRepetido(leer.next(), C1);
        System.out.println("Ahora ingrese una nueva cadena:");
        C2.setFrase(leer.next());
        C2.setLongitud(C2.getFrase().length());
        Sc.compararLongitud(C1, C2);
        Sc.unirFrases(C1, C2);
        
    }
    
}
