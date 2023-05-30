
package Servicios;

import Entidades.Polideportivo;
import Enums.TipoPolideportivo;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class ServicioPolideportivo {
    
    Scanner leer;
    public Polideportivo crearPoli(){
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cargar nuevo Polideportivo al Condominio");
        Polideportivo p = new Polideportivo();
        System.out.print("Nombre del Polideportivo: ");
        p.setNombre(leer.next());
        System.out.print("Tipo de polideportivo (Techado o Abierto)");
        boolean ok=true;
        do{
            String tipo=leer.next();
            if (tipo.equalsIgnoreCase(TipoPolideportivo.getABIERTO().getTipo())) {
                p.setTipo(TipoPolideportivo.ABIERTO);
            }else if(tipo.equalsIgnoreCase((String)TipoPolideportivo.getTECHADO().getTipo())){
                p.setTipo(TipoPolideportivo.TECHADO);
            }else{
                System.out.println("El tipo ingresado no es correcto. Intente de nuevo.");
                ok=false;
                }
        }while(!ok);
         // Ancho, largo y alto
        System.out.println("Ingrese el ancho del edificio en metros:");
        p.setAncho(leer.nextInt());
        System.out.println("Ingrese el largo del edificio en metros:");
        p.setLargo(leer.nextInt());
        System.out.println("Ingrese la altura del polideportivo en metros:");
        p.setAlto(leer.nextInt());
        return p;
    }

    // Mostrar datos de Polideportivo
     public void mostrarPolideportivo(Polideportivo p){
         System.out.println("------------------------------------------------------------------------");
         System.out.println("Polideportivo "+p.getNombre()+".");
            System.out.println("Dimensiones:\n"
                + "                  Ancho: "+p.getAncho()+" mts.\n"
                + "                  Largo: "+p.getLargo()+" mts.\n"
                + "                  Altura total: "+p.getAlto()+" mts.");
            System.out.println("Tipo de estadio: "+p.getTipo().getTipo());
          System.out.println("------------------------------------------------------------------------");
      }
    
}
