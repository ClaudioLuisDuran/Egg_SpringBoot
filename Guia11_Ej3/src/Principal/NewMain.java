/*
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Principal;

import Entidad.DivisionNumero;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author ClaudioDuran
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Num 1: ");
        String num1 = leer.next();
        System.out.println("Num 2: ");
        String num2 = leer.next();
       int num1OK = parseInt(num1);
        int num2OK = parseInt(num2);
        DivisionNumero Dv = new DivisionNumero();
        Dv.setNum1(num1OK);
        Dv.setNum2(num2OK);
        Dv.dividir();
    }
    
}
