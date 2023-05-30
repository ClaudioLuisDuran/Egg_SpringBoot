package Principal;

import Entidad.Pelicula;
import Servicio.ServicioPeli;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Claudio Durán
 */
public class MainPelis {

    public static void main(String[] args) {
        ServicioPeli Sp = new ServicioPeli();
        ArrayList<Pelicula> listaPelis = new ArrayList();
        Scanner leer;

        // Menu       
        int opc;
        do {
            leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Menú VIDEOCLUB");
            System.out.println("1 - Cargar peliculas\n"
                    + "2 - Mostrar catálogo\n"
                    + "3 - Ordenar catálogo por duración (M a m)\n"
                    + "4 - Ordenar catálogo por duración (m a M)\n"
                    + "5 - Ordenar catálogo por título\n"
                    + "6 - Ordenar catálogo por director\n"
                    + "7 - Mostrar películas de mas de una hora\n"
                    + "8 - Borrar película por título\n"
                    + "9 - Salid del sistema.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Sp.crearPeli(listaPelis);
                    break;
                case 2:
                    Sp.mostrarCatalogo(listaPelis);
                    break;
                case 3:
                    listaPelis.sort(Pelicula.compararDuracionMenor);
                    Sp.mostrarCatalogo(listaPelis);
                    break;
                case 4:
                    listaPelis.sort(Pelicula.compararDuracionMayor);
                    Sp.mostrarCatalogo(listaPelis);
                    break;
                case 5:                    
                    listaPelis.sort(Pelicula.compararTitulo);
                    Sp.mostrarCatalogo(listaPelis);
                    break;
                case 6:
                    listaPelis.sort(Pelicula.compararDirector);
                    Sp.mostrarCatalogo(listaPelis);
                    break;
                case 7:
                    Sp.mostrarCatalogo1hora(listaPelis);
                    break;
                case 8:
                    Sp.borrarPeli(listaPelis);
                    Sp.mostrarCatalogo(listaPelis);
                    break;
                case 9:
                    System.out.println("Adios. Gracias por confiar en nosotros!");
                    break;
                default:
                    System.out.println("La opción elegida no existe.");
            }
        } while (opc != 9);
    }
}