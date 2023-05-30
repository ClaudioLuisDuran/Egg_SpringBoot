package Principal;

import Entidades.Triangulo;
import Servicios.ServicioTriang;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class MainTriang {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioTriang St = new ServicioTriang();

        Triangulo[] Vt = new Triangulo[4];
        System.out.println("Triángulos Isósceles");
        System.out.println("________________");
        for (int i = 0; i < Vt.length; i++) {
            Vt[i] = new Triangulo();
            System.out.println("Triangulo Isósceles " + (i + 1) + ":");
            System.out.print("Ingrese la base:");
            int base = leer.nextInt();
            Vt[i].setBase(base);
            System.out.print("Ingrese la altura del Isósceles:");
            int altura = leer.nextInt();
            Vt[i].setAltura(altura);            
            Vt[i].setArea(St.areaTriang(Vt[i]));
            System.out.print("El área del Triángulo " + (i + 1) + " es: " + Vt[i].getArea() + ".");
            System.out.println("");
            Vt[i].setLado(St.ladoTriang(Vt[i]));
            System.out.print("El lado mayor es: " + Vt[i].getLado() + ".");
            System.out.println("");
            Vt[i].setPerimetro(St.perimTriang(Vt[i]));
            System.out.println("El perímetro del Triangulo " + (i + 1) + " es: " + Vt[i].getPerimetro() + ".");
            System.out.println("........................");
        }
        System.out.println("El Triángulo Isósceles con mayor área es el " + (St.mayorArea(Vt)+1) + ",");
        System.out.println("y es de " + Vt[St.mayorArea(Vt)].getArea() + ".");
    }

}
