/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ClaudioDuran
 */
public class MainServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    AutorServicio As = new AutorServicio();
    EditorialServicio Es = new EditorialServicio();
    LibroServicio Ls = new LibroServicio();
    ClienteServicio Cs = new ClienteServicio();
    Scanner leer;

    public void MenuPrincipal() {
        leer = new Scanner(System.in).useDelimiter("\n");
        String opc;
        do {
            System.out.println("MENÚ PRINCIPAL BIBLIOTECA");
            System.out.println("A.- Opciones de AUTOR.\n"
                    + "B.- Opciones de EDITORIAL.\n"
                    + "C.- Opciones de LIBROS.\n"
                    + "D.- Opciones de CLIENTES.\n"
                    + ".................................\n"
                    + "X.- Salir del sistema.");
            System.out.print("Su opción >> ");
            opc = leer.next();

            switch (opc.toLowerCase()) {
                // Autores
                case "a":
                    this.subMenuAutores();
                    break;
                case "b":
                    this.subMenuEditoriales();
                    break;
                case "c":
                    this.subMenuLibros();
                    break;
                case "d":
                    this.submenuClientes();
                    break;
                case "x":
                    System.out.println("Ha salido correctamente. Gracias.");
                    break;
                default:
                    System.out.println("La opción ingresada no está disponible.");
            }

        } while (!opc.equalsIgnoreCase("x"));
    }

    public void subMenuAutores() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("* SUB MENÚ AUTORES *");
            System.out.println("1.- Cargar autor.\n"
                    + "2.- Listar autores.\n"
                    + "3.- Buscar autor.\n"
                    + "4.- Modificar estado de autor.\n"
                    + "5.- Borrar autor.\n"
                    + ".................................\n"
                    + "0.- Volver al Manú Principal.");
            System.out.print("Su opción >> ");
            opc = leer.nextInt();

            switch (opc) {
                // Autores
                case 1:
                    As.crearAutor();
                    break;
                case 2:
                    As.listarAutores();
                    break;
                case 3:
                    As.bucarAutor();
                    break;
                case 4:
                    As.modificarAltaBajaAutor();
                    break;
                case 5:
                    As.eliminarAutor();
                    break;

                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("La opción ingresada no está disponible.");
            }
        } while (opc != 0);

    }

    public void subMenuEditoriales() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opc;

        do {
            System.out.println("SUB MENÚ EDITORIALES * \n"
                    + "1.- Cargar nueva Editorial.\n"
                    + "2.- Listar Editoriales\n"
                    + "3.- Buscar datos de una Editorial.\n"
                    + "4.- Modificar Editorial.\n"
                    + "5.- Borrar Editorial.\n"
                    + ".................................\n"
                    + "0.-  Volver al Manú Principal.");
            System.out.print("Su opción >> ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    Es.crearEditorial();
                    break;
                case 2:
                    Es.listarEditoriales();
                    break;
                case 3:
                    Es.bucarEditorial();
                    break;
                case 4:
                    Es.modificarAltaBajaEditorial();
                    break;
                case 5:
                    Es.eliminarEditorial();
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("La opción ingresada no está disponible.");
            }

        } while (opc != 0);

    }

    public void subMenuLibros() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("* SUB MENÚ LIBROS *");
            System.out.println("1.- Cargar nuevo libro.\n"
                    + "2.- Listar Libros.\n"
                    + "3.- Modificar datos de un libro\n"
                    + "4.- Buscar datos de un libro.\n"
                    + "5.- Borrar un libro de la bbdd.\n"
                    + "0.-  Volver al Manú Principal.");
            System.out.print("Su opción >> ");
            opc = leer.nextInt();
            switch (opc) {

                case 1:
                    Ls.crearLibro();
                    break;
                case 2:
                    Ls.listarLibro();
                    break;
                case 3:
                    Ls.modificarLibro();
                    break;
                case 4:
                    Ls.submenuBusquedaLibros();
                    break;
                case 5:
                    Ls.eliminarLibro();
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("La opción ingresada no está disponible.");
            }

        } while (opc != 0);

    }

    public void submenuClientes() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("* SUB MENÚ CLIENTES *");
            System.out.println("1.- Cargar nuevo cliente.\n"
                    + "2.- Listar clientes.\n"
                    + "3.- Modificar datos de un cliente\n"
                    + "4.- Buscar datos de un cliente.\n"
                    + "5.- Borrar un cliente de la bbdd.\n"
                    + "0.-  Volver al Manú Principal.");
            System.out.print("Su opción >> ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Cs.crearCliente();
                    break;
                case 2:
                    Cs.listarClientes();
                    break;
                case 3:
                    Cs.modificacionCliente();
                    break;
                case 4:
                    Cs.consultaCliente();
                    break;
                case 5:
                    Cs.eliminarCliente();
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("La opción seleccionada no existe.");
            }
        } while (opc != 0);
    }
}
