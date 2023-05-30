
import Libro.Libro;
import Servicio.ServicioLibro;
import java.util.ArrayList;
import java.util.Iterator;


public class NewMain_conObjetos {

 
    public static void main(String[] args) {
       ServicioLibro Sl = new ServicioLibro();
               
       ArrayList <Libro> biblioteca = new ArrayList();
        biblioteca.add(Sl.crearLibro());
        biblioteca.add(Sl.crearLibro());
        biblioteca.sort(Libro.compararNombre);
        Iterator<Libro> it = biblioteca.iterator();
        biblioteca.forEach((libro) -> {
            System.out.println(libro.toString()); 
        });
        
        biblioteca.sort(Libro.compararPagina);
        Iterator<Libro> it2 = biblioteca.iterator();
        biblioteca.forEach((libro) -> {
            System.out.println(libro.toString()); 
        });
     }
}
