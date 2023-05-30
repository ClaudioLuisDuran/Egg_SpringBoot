package Principal;

import java.util.Date;
import java.util.Scanner;

/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */

/**
 *
 * @author Claudio Durán
 */
public class MainDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dia, mes, anio;
        System.out.println("Ingrese el dia:");
        dia=leer.nextInt();
        System.out.println("Ingrese el mes:");
        mes=leer.nextInt();
        mes--;
        System.out.println("Ingrese el año:");
        anio=leer.nextInt();
        anio = anio-1900;
        Date fecha = new Date(anio,mes,dia);
        System.out.println("Fecha ingresada:" + fecha);
        Date fechaactual = new Date();
        System.out.println("Fecha actual:" + fechaactual);
        System.out.println("Entre ambas fechas hay " + (fechaactual.getYear() - fecha.getYear()) + " años.");
    }
    
}
