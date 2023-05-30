/*
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package Principal;

import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.InputMismatchException;
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
        
        try{
            System.out.println("Ingrese una palabra:");
            String palabra = leer.next();
            
            System.out.println("Convertir a Integer...");
            Integer numero = parseInt(palabra);
            System.out.println(" >>> "+numero);
            
            System.out.println("Dividir por cero...");
            System.out.println("Ingrese un número:");
           int numero2 = leer.nextInt();
            int resultado = numero2 / 0;
            
            
        }catch (InputMismatchException a){
            System.out.println("Error......");
            System.out.println(a.fillInStackTrace());
    }
        catch(NumberFormatException b){
            System.out.println(" No es posible convertir una palabra a Integer...");  
            System.out.println(b.getMessage());
        
    } catch(ArithmeticException c){
            System.out.println("No es posible la división por cero...");
            System.out.println(Arrays.toString(c.getStackTrace()));
    }}


    
}
