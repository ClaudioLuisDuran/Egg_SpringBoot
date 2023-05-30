package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(Persona p) {
        p = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad:");
        p.setEdad(leer.nextInt());
        boolean ok;
        do {
            System.out.println("Ingrese el sexo (H-M-O)");
            String sex = leer.next();
            if (sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("O")) {
                p.setSexo(sex);
                ok = true;
                break;
            } else {
                System.out.println("El caracter ingresado no es válido (H, M, O)");
                ok = false;
            }
        } while (ok == false);

        System.out.println("Ingrese el peso en kgs (ej: 50,9)");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en mts. (ej. 1,65)");
        p.setAltura(leer.nextDouble());

        return p;
    }

    public void calcularIMC(Persona p) {

        /* int IMC = (int) (p.getPeso() / Math.pow((double) p.getAltura(), 2));*/
        int IMC = (int) (p.getPeso() / (int) Math.pow(p.getAltura(), 2));
        if (IMC < 20) {
            p.setIMC(-1);
        } else if (IMC >= 20 && IMC <= 25) {
            p.setIMC(0);
        } else {
            p.setIMC(1);
        }
    }

    public boolean esMayordeEdad(Persona p)  throws Exception{
        boolean es;
     
        if (p.getEdad() >= 18) {
            es = true;
            p.setEsmayor(es);
             
        } else if(p.getEdad() < 18){
            es = false;
            p.setEsmayor(es);
         
        }else{
             throw new Exception ("La edad no está inicializada");
        }
        
        return es;
    }

}
