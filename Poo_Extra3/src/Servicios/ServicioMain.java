package Servicios;

import Entidades.Pass;
import java.util.Scanner;


/**
 * @author Claudio Durán
 */
public class ServicioMain {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pass Usuario() {
        Pass u = new Pass("1234567890", "Peter Otul", 2314567);
        return u;
    }

    public Pass crearPass(Pass u) {
        System.out.println("Ingrese su contraseña (10 caracteres: números y letras): ");
        String cont;
        do {
            cont = leer.next();
            
            if (cont.length() != 10) {
                
                System.out.println("Contraseña incorrecta (10 caracteres, números y letras");
            }
        } while (cont.length() != 10);
        u.setPass(cont);
        System.out.println(" ----------");
        System.out.println("La contraseña ha sido ingresada correctamente.");
         System.out.println(" ----------");
        return u;
    }

    public void analizaPass(Pass u) {
        int contZ = 0;
        int contA = 0;
        for (int i = 0; i < u.getPass().length(); i++) {
            if (u.getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                contZ++;
            } else if (u.getPass().substring(i, i + 1).equalsIgnoreCase("a")) {
                contA++;
            }
        }
        if (contA < 2 && contZ > 0) {
             System.out.println(" ----------");
            System.out.println("Su contraseña es de nivel MEDIO.");
             System.out.println(" ----------");
        } else if (contA > 1 && contZ > 0) {
             System.out.println(" ----------");
            System.out.println("Su contraseña es de nivel ALTO.");
             System.out.println(" ----------");
        } else {
             System.out.println(" ----------");
            System.out.println("Su contraseña es de nivel BAJO. Recomendamos actualizarla.");
             System.out.println(" ----------");
        }
    }

    public void cambiarNombre(Pass u) {
         System.out.println(" ----------");
        System.out.println("Para cambiar datos debe introducir su contraseña:");
        if (u.getPass().contentEquals(leer.next())) {
            // cambiar dato
            System.out.println("Contraseña correcta.");
            System.out.println("Ingrese el nombre completo:");
            u.setNombre(leer.next());
            System.out.println("Nombre actualizado.");
             System.out.println(" ----------");
        } else {
            System.out.println("Contraseña incorrecta.");
             System.out.println(" ----------");
        }
    }

    public void cambiarDNI(Pass u) {
         System.out.println(" ----------");
        System.out.println("Para cambiar datos debe introducir su contraseña:");
        if (u.getPass().contentEquals(leer.next())) {
            // cambiar dato
            System.out.println("Contraseña correcta.");
            System.out.println("Ingrese el DNI:");
            u.setDni(leer.nextInt());
            System.out.println("DNI actualizado.");
             System.out.println(" ----------");
        } else {
            System.out.println("Contraseña incorrecta.");
             System.out.println(" ----------");
        }
    }

    public void mostrarUsuario(Pass u) {
        System.out.println(u.toString());
    }

    public void Menu(Pass u) {
        int opcion = 0;
        do {
            System.out.println("   MENÚ DE OPCIONES");
            System.out.println("1: Ingrese contraseña.");
            System.out.println("2: Averigue el NIVEL de su contraseña.");
            System.out.println("3: Modifique su contraseña actual.");
            System.out.println("4. Modifique el nombre de usuario.");
            System.out.println("5. Modifique el DNI de usuario.");
            System.out.println("6. Mostrar usuario.");
            System.out.println("7. Salir del sistema.");
            System.out.print("Su opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    this.crearPass(u);
                    break;
                case 2:
                    this.analizaPass(u);
                    break;
                case 3:
                    this.crearPass(u);
                    break;
                case 4:
                    this.cambiarNombre(u);
                    break;
                case 5:
                    this.cambiarDNI(u);
                    break;
                case 6:
                    this.mostrarUsuario(u);
                    break;
                case 7:
                    System.out.println("Muchas gracias por usar el sistema. Adios!");
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta.");
            }
        } while (opcion != 7);
    }
}
