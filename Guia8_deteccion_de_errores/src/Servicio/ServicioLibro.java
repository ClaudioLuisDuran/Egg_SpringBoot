
package Servicio;

import Libro.Libro;
import java.util.Scanner;

public class ServicioLibro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro crearLibro(){
        
        System.out.println("Ingrese el número de libro:");
        int num = leer.nextInt();
        System.out.println("Ingrese el nombre de libro:");
        String nom = leer.next();
        System.out.println("Ingrese el autor de libro:");
        String autor = leer.next();
        System.out.println("Ingrese las páginas de libro:");
        int pags = leer.nextInt();
        
        Libro L = new Libro(num,nom,autor,pags);
        return L;
    }
    
}
