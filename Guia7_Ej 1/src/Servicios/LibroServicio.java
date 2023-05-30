/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro CargarLibro() {

        System.out.println("Ingrese el ISBN de la obra: ");
        String  ISBN = leer.next(); 
        System.out.println("Ingrese el título de la obra: ");
        String  titulo = leer.next(); 
        System.out.println("Ingrese el autor de la obra: ");
        String  autor = leer.next(); 
        System.out.println("Ingrese el número de páginas de la obra: ");
        Integer  paginas = leer.nextInt(); 
        return new Libro(ISBN, titulo, autor, paginas);
    
    }

    public void mostrarLibro(Libro obra){
        
        Libro ob = new Libro();
        ob = obra;
        System.out.println("Los datos ingresados son los siguientes:");
        System.out.println("ISBN = " + obra.getISBN() + "\n"
                + "titulo: " + obra.getTitulo() + "\n"
                + "Autor: " + obra.getAutor() + "\n"
                + "Número de páginas: " + obra.getPaginas());
        
    }

}
