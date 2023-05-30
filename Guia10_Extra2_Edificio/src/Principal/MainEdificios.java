package Principal;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicios.ServicioEdificioOficinas;
import Servicios.ServicioPolideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class MainEdificios {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioEdificioOficinas Se = new ServicioEdificioOficinas();
        ServicioPolideportivo Sp = new ServicioPolideportivo();
        ArrayList<Edificio> complejo = new ArrayList<>();
        
        System.out.println("");
        System.out.println("----- Bienvenidos al nuevo Complejo 'Las Gaviotas' -----'");
        System.out.print("¿Cuántos edificios de oficinas contiene el condominio?: ");
        int cantEdif = leer.nextInt();
        for (int i = 0; i < cantEdif; i++) {
            System.out.println("Carga de datos del Edificio " + (i + 1));
            EdificioDeOficinas e = Se.crearEdificio();
            complejo.add(e);
            System.out.println("Edificio "+(i+1)+": creado.");
        }
        
        System.out.println("");
        System.out.print("¿Cuántos Polideportivos tendrá el Complejo?: ");
        int cantPolis = leer.nextInt();
        for (int i = 0; i < cantPolis; i++) {
            System.out.println("Datos del Polideportivo " + (i + 1));
            Polideportivo p = Sp.crearPoli();
            complejo.add(p);
            System.out.println("Polideportivo "+(i+1)+": creado.");
        }
        
        System.out.println("");
        System.out.println("--------- Datos del Complejo 'Las Gaviotas' ---------");
        for (Edificio elem : complejo) {
            if (elem instanceof EdificioDeOficinas) {
                EdificioDeOficinas aux = (EdificioDeOficinas) elem;   
            Se.mostrarEdificio(aux);
            }else{
                if(elem instanceof Polideportivo){
                    Polideportivo aux = (Polideportivo) elem;
                    Sp.mostrarPolideportivo(aux);
                }
            }
        }
    }
}
