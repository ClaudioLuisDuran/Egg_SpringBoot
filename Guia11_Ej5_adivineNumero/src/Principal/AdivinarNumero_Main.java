/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */

/*REVISAR.... NO ESTA TERMINADO*/
package Principal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ClaudioDuran
 */
public class AdivinarNumero_Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();
        int num1 = aleatorio.nextInt(500);
        System.out.println("El número invisible ya fue generado. Trate de adivinarlo:");
//        System.out.println(num1);
            int cont = 1; 
            boolean adivina=false;
        do {
            try {
        
              adivina = verifica(num1, cont);
            } catch (Exception a) {
                System.out.println(a.getMessage());
//                adivina = false;
//                int numX=0;
            }
            finally{
                cont++;
            }
        } while (!adivina);

    }
    
    public static boolean verifica(int escondido, int cont) throws Exception{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean aux=false;
        
                int numX = leer.nextInt();                   
                if (numX != escondido) {
                    System.out.println("No es el número escondido... (Lleva " + cont + " intentos.)");
                throw new Exception ("Error. Debe ingresar un número. Suma un intento en vano...("+cont+" intentos)");
                } else {
                    aux = true;
                    System.out.println("Felicitaciones! ");
                    System.out.println("Efectivamente, el número escondido era " + escondido + ",");
                    System.out.println("y lo adivinó en " + cont + " intentos.");
                    
                }
                return aux;
    }
}
