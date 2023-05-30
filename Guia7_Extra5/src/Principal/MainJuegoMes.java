/*
 * Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class MainJuegoMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[] vectorMes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        System.out.println("Adivine el mes secreto");
        System.out.println("--------------------------------");
        String mesSecreto;
        mesSecreto = vectorMes[(int) (Math.random() * 12)];
        
        System.out.println("Ingrese el mes a descubir");
        int cont = 0;
        do {
            String mes = leer.next();
            if (mes.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Excelente! Has decubierto el mes secreto en " + (cont+1) + " intento/s.");
            } else {
                cont++;
                System.out.println("Lo siento. Has errado. Intenta de nuevo. (llevas " + cont + " intentos.)");
                if(cont > 3 && cont <5){
                System.out.println("Tu puedes!");
            }else if(cont >4 && cont<10){
                    System.out.println("¿Probaste estudiar PDC?...");
                    }else if (cont >9){
                    System.out.println("Supongo que en el amor todo joya....");
                    }
            }
        } while (cont > 0);
    }

}
