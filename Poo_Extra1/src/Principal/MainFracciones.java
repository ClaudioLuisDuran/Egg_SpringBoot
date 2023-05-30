package Principal;

import Entidades.Fraccion;
import Servicios.ServicioFraccion;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class MainFracciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Fraccion f1 = new Fraccion();
        Fraccion resultado = new Fraccion();
        ServicioFraccion Sf = new ServicioFraccion();
        System.out.println("Calculadora de fracciones");
        System.out.print("Ingrese el numerador de la primera fracción: ");
        f1.setNumer1(leer.nextInt());
        System.out.print("Ingrese el denominador de la primera fracción: ");
        f1.setDenom1(leer.nextInt());
        System.out.print("Ingrese el numerador de la primera fracción: ");
        f1.setNumer2(leer.nextInt());
        System.out.print("Ingrese el denominador de la primera fracción: ");
        f1.setDenom2(leer.nextInt());
        System.out.println("");
        resultado = Sf.sumaFracciones(f1);
        System.out.println("La suma de " + f1.getNumer1() + "/" + f1.getDenom1() + " + " + f1.getNumer2() + "/" + f1.getDenom2() + " = " + resultado.getNumer1() + "/" + resultado.getDenom1() + ".");

        resultado = Sf.restaFracciones(f1);
        System.out.println("La resta de " + f1.getNumer1() + "/" + f1.getDenom1() + " - " + f1.getNumer2() + "/" + f1.getDenom2() + " = " + resultado.getNumer1() + "/" + resultado.getDenom1() + ".");
        
        resultado = Sf.multiplicaFracciones(f1);
        System.out.println("La multiplicación de " + f1.getNumer1() + "/" + f1.getDenom1() + " * " + f1.getNumer2() + "/" + f1.getDenom2() + " = " + resultado.getNumer1() + "/" + resultado.getDenom1() + ".");

        resultado = Sf.divideFracciones(f1);
        System.out.println("La división de (" + f1.getNumer1() + "/" + f1.getDenom1() + ") / (" + f1.getNumer2() + "/" + f1.getDenom2() + ") = " + resultado.getNumer1() + "/" + resultado.getDenom1() + ".");

    }

}


