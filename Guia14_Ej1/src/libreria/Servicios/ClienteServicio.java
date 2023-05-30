/*
 * Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar clientes (consulta, creación, modificación y eliminación).
 */
package libreria.Servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Cliente;

/**
 * @author ClaudioDuran
 */
public class ClienteServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner leer;

    public void crearCliente() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cargar nuevo cliente. Ingrese los siguientes datos.");
        System.out.print("Nombre/s: ");
        String nombre = leer.next();
        System.out.print("Apellido/s: ");
        String apellido = leer.next();
        System.out.print("DN: ");
        Long DNI = leer.nextLong();
        System.out.print("Teléfono: ");
        String tel = leer.next();
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDNI(DNI);
        cliente.setTelefono(tel);
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
    }

    public void consultaCliente() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el apellido del cliente a consultar:");
        String apellido = leer.next();

        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :ape").setParameter("ape", "%" + apellido + "%").getResultList();
        if (clientes.isEmpty()) {
            System.out.println("La búsqueda no ha arrojado ningún resultado.");
        } else {
            System.out.println("Resultado/s de la búsqueda:");
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ". DNI: " + cliente.getDNI() + ". Tel.: " + cliente.getTelefono() + ".");
            }
        }
        System.out.println("Presione ENTER para volver al Menú anterior.");
        String z = leer.nextLine();
    }

    public void modificacionCliente() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el apellido del cliente a modificar:");
        String apellido = leer.next();      
         List <Cliente> clientes =  em.createQuery("SELECT c FROM Cliente c WHERE c.apellido LIKE :ape")
                .setParameter("ape", "%" + apellido + "%")
                .getResultList();
         System.out.println(clientes.size());

        if (clientes.isEmpty()) {
            System.out.println("La búsqueda no ha arrojado ningún resultado.");
        } else if (clientes.size() == 1) {

            for (Cliente cliente : clientes) {
                // llamar a submenu de modificacion pasando ID
                this.modificaClienteXid(cliente.getId());
            }
        } else {
            System.out.println("Resultados de la búsqueda:");
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ". ID: " + cliente.getId() + ".");
                
            }
            System.out.println("Ingrese el ID del cliente que necesita modificar:");
                int id = leer.nextInt();
                // llamar a submenu de modificacion pasando ID
                this.modificaClienteXid(id);
        }
    }

    public void modificaClienteXid(int id) {
        Cliente cliente = em.find(Cliente.class, id);
        int opc;
        do {
            System.out.println("Submenú Modificación de datos.\n"
                    + "1.- Modificar nombre/s. (" + cliente.getNombre() + ")\n"
                    + "2.- Modificar apellido/s. (" + cliente.getApellido() + ")\n"
                    + "3.- Modificar DNI. (" + cliente.getDNI() + ")\n"
                    + "4.- Modificar teléfono. (" + cliente.getTelefono() + ")\n"
                    + "5.- Abandonar este submenú.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese nombre/s: ");
                    cliente.setNombre(leer.next());
                    break;
                case 2:
                    System.out.print("Ingrese apellido/s: ");
                    cliente.setApellido(leer.next());
                    break;
                case 3:
                    System.out.print("Ingrese DNI: ");
                    cliente.setDNI(leer.nextLong());
                    break;
                case 4:
                    System.out.print("Ingrese teléfono: ");
                    cliente.setTelefono(leer.next());
                    break;
                default:
                    System.out.println("La opción ingresada no existe.");
            }
        } while (opc != 5);
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
    }

    public void eliminarCliente() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el apellido del cliente a eliminar de la base de datos:");
        String apellido = leer.next();

        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.apellido LIKE :ape").setParameter("ape", "%" + apellido + "%").getResultList();

        if (clientes.isEmpty()) {
            System.out.println("La búsqueda no ha arrojado ningún resultado.");
        } else if (clientes.size() == 1) {
            for (Cliente cliente : clientes) {
                em.getTransaction().begin();
                em.remove(cliente);
                em.getTransaction().commit();
            }
        } else {
            System.out.println("Resultados de la búsqueda:");
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ". ID: " + cliente.getId() + ".");
            }
           System.out.println("Ingrese el ID del cliente que necesita eliminar:");
                int id = leer.nextInt();
                Cliente clienteX = em.find(Cliente.class, id);
                em.getTransaction().begin();
                em.remove(clienteX);
                em.getTransaction().commit();
        }
    }

    public void listarClientes() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Lista de clientes de la base datos:");
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();

        if (clientes.isEmpty()) {
            System.out.println("La base de datos esta vacía.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ". DNI: " + cliente.getDNI() + ". Tel.: " + cliente.getTelefono() + ".");
            }
        }
        System.out.println("Presione ENTER para volver al Menú anterior.");
        String z = leer.nextLine();
    }
}
