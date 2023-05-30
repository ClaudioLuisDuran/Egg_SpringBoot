/*
 * hora, minutos y segundos ingresado por el usuario
 */
package Principal;

import Entidades.Tiempo;
import Servicios.ServicioTiempo;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class MainTiempo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioTiempo  St = new ServicioTiempo();
        
        int h,m,s;
        
        do{
        System.out.print("Ingrese la hora:");
        h=leer.nextInt();  
        }while(St.validarHora(h)==false);
        
        do{
        System.out.print("Ingrese los minutos:");
        m=leer.nextInt();    
        }while(St.validarMinSec(m)==false);
        
        do{
         System.out.print("Ingrese los segundos:");
        s=leer.nextInt();   
        }while(St.validarMinSec(s)==false);
        
        Tiempo t = new Tiempo(h, m, s);
        St.imprimirHora(t);
        
    }
    
}
