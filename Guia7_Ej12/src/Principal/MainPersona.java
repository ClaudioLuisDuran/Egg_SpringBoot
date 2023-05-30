
package Principal;

import Entidad.Persona;
import Servicios.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class MainPersona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       Persona P1 = new Persona();
       ServicioPersona Sp = new ServicioPersona();
        P1 = Sp.crearPersona();
        System.out.println("Ingrese una edad probable para comparar:");
        int edad2 = leer.nextInt();
        Sp.mostrarPersona(P1);
       int edadP =  Sp.calcularEdad(P1);
       if(Sp.menorQue(edad2, edadP) == true){
           System.out.println(P1.getNombre() + " es mayor que la edad probable ingresada.");
       } else {
           System.out.println(P1.getNombre() + " es menor que la edad probable ingresada.");
       }
    
        
    }
    
}
