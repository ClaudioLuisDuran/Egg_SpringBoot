/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Libro;
import Servicios.LibroServicio;

/**
 *
 * @author Claudio Durán
 */
public class MainLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro obra1 = new Libro();
        LibroServicio Ls = new LibroServicio();
        obra1 = Ls.CargarLibro();
        Ls.mostrarLibro(obra1);
        
    }

}
