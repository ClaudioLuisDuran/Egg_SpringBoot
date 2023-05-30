package Principal;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServicioPerro;
import Servicios.ServicioPersona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ClaudioDuran
 */
public class MainPerroPersona {

    public static void main(String[] args) {

        System.out.println("MENÚ CASITA PERRUNA");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        ServicioPersona Sh = new ServicioPersona();
        ServicioPerro Sp = new ServicioPerro();
        ArrayList<Persona> clientes = new ArrayList();
        ArrayList<Perro> mascotas = new ArrayList();

        do {
            System.out.println("1. Cargar nuevo cliente.");
            System.out.println("2. Cargar nuevo perrito para adopción.");
            System.out.println("3. Mostrar Clientes.");
            System.out.println("4. Mostrar Perritos.");
            System.out.println("5. Adoptar perrito.");
            System.out.println("6. Salir del sistema.");
            System.out.println("OPCION: ");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    clientes.add(Sh.crearPersona());
                    break;
                case 2:
                    mascotas.add(Sp.crearPerro());
                    break;
                case 3:
                    Sh.mostrarPersona(clientes);
                    break;
                case 4:
                    Sp.mostrarPerro(mascotas);
                    break;
                case 5:
                    clientes = Sp.adoptarPerro(clientes, mascotas);
                    break;
                case 6:
                    System.out.println("Gracias por visitarnos!");
                    break;
                default:
                    System.out.println("La opción ingresada no existe.");
            }
        } while (opc != 6);
    }
}
