/*
 * En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. 

 */
package Principal;

import Entidades.MAtematica;
import Servicios.ServicioMatematicas;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class MainMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioMatematicas Sm = new ServicioMatematicas();
        MAtematica num = new MAtematica();
        num.setNum1((int) (Math.random()*101));
        num.setNum2((int) (Math.random()*101));
        Sm.devolverMayor(num);
        Sm.calcularPotencia(num);
        Sm.calcularRaiz(num);
    }
    
}
