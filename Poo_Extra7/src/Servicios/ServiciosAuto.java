
package Servicios;

import Entidad.Auto;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class ServiciosAuto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Auto llenarFicha(Auto a) {
        System.out.print("Ingrese su nombre: ");
        a.setNombre(leer.next());
        System.out.println("");
        System.out.print("Ingrese la marca de su automóvil: ");
        a.setMarca(leer.next());
        System.out.println("");
        System.out.print("Ingrese el año de su modelo: ");
        a.setModelo(leer.nextInt());
        System.out.println("");
        System.out.print("Ingrese el color de su automóvil: ");
        a.setColor(leer.next());
        System.out.println("Ingrese la fecha de vencimiento de su carnet de conducir: (dd/mm/aa)");
        a.setVencimiento(leer.next());
        return a;
    }

    public Auto modificarDueño(Auto a) {
        System.out.println("Modificación de titularidad del dominio.");
        System.out.print("Ingrese el nombre del nuevo titular:");
        a.setNombre(leer.next());
        System.out.println("El nuevo titular ha sido cargado.");
        return a;
    }

    public Auto cargarKms(Auto a) {
        System.out.println("Agregar viaje.");
        System.out.print("Kms. recorridos: ");
        a.setKms(a.getKms() + leer.nextInt());
        System.out.println("El nuevo kilometraje de su vehículo es " + a.getKms() + " Kms.");
        return a;
    }

    public boolean service(Auto a) {
        boolean retorno;
        if (a.getKms() >= 10000) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }
    
    
    public void mostrarFicha(Auto a){
        
        System.out.println("        Ficha de su automovil");
        System.out.println("        ----------------------------");
        System.out.println("        Modelo:" + a.getMarca() + ", año: "+a.getModelo()+".");
        System.out.println("        Color: "+a.getColor()+".");
        System.out.println("        Propietario: "+a.getNombre());
        System.out.println("        Vencimiento carnet: "+a.getVencimiento()+".");
        System.out.println("        Kilómetros recorridos: "+a.getKms()+" kms.");
        if (this.service(a)==true) {
            System.out.println("    >>>>>> Recuerde que debe realizar el Service de los 10.000 Kms<<<<<<<");
        }
        
    }
    
    
    public void menu(Auto a){
        int opcion;
        do{
        System.out.println("Administrar automóvil");
        System.out.println("Ingrese su opción.");
        System.out.println("1. Llenar ficha");
        System.out.println("2. Mostrar ficha");
        System.out.println("3. Cambiar propietario");
        System.out.println("4. Agregar recorrido");
        System.out.println("5. Salir.");
        
        opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    this.llenarFicha(a);
                    break;
                case 2:
                    this.mostrarFicha(a);
                   break;
                case 3:
                    this.modificarDueño(a);
                    break;
                case 4:
                    this.cargarKms(a);
                    break;
                case 5:
                    System.out.println("Muchas gracias por usar nuestro sistema. Lo esperamos!");
                    break;
                default:
                    System.out.println("La opción seleccionada no existe.");
            }
         }while(opcion!=5);
    }
    
    
}
