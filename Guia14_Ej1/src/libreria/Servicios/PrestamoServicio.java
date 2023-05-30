package libreria.Servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Cliente;
import libreria.Entidades.Libro;
import libreria.Entidades.Prestamo;

/**
 * @author ClaudioDuran
 */
public class PrestamoServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner leer;

    public void prestarLibro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Prestamo de libro.");
        System.out.println("Ingrese el apellido del cliente interesado: ");
        String apellido = leer.next();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.apellido LIKE :ape").setParameter("ape", "%" + apellido + "%").getResultList();
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + " - " + cliente.getNombre() + " " + cliente.getApellido() + ".");
        }
        System.out.println("Ahora, ingrese el ID del cliente:");
        int id = leer.nextInt();
        Cliente clienteOK = em.find(Cliente.class, id);
        System.out.println("Ingrese el nombre o parte del nombre del libro de su interés:");
        String nombre = leer.next();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nom").setParameter("nom", "%" + nombre + "%").getResultList();
        System.out.println("Ahora, ingrese el ID del libro correspondiente:");
        int idL = leer.nextInt();
        Libro libroOK = em.find(Libro.class, id);
        // Cargo prestamo
        Prestamo prestamo = new Prestamo();
        prestamo.setFechaPrestamo(LocalDate.now());
        prestamo.setCliente(clienteOK);
        prestamo.setLibro(libroOK);
        System.out.println("¿Cuantos dias tendrá el libro prestado?");
        int dias = leer.nextInt();
        prestamo.setFechaDevolucion(LocalDate.now().plusDays(dias));
        em.getTransaction().begin();
        em.persist(prestamo);
        em.getTransaction().commit();
        //Actualizo prestados y restantes del libro
        libroOK.setEjemplaresPrestados(libroOK.getEjemplaresPrestados() + 1);
        libroOK.setEjemplaresRestantes(libroOK.getEjemplaresRestantes() - 1);
        em.getTransaction().begin();
        em.merge(libroOK);
        em.getTransaction().commit();
    }

    public void consultaPrestamo() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("Consulta de préstamo\n"
                    + "1.- Consulta por libro.\n"
                    + "2.- Consulta por cliente.\n"
                    + "0.- Volver al Menú anterior.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    this.consultaPrestamoPorLibro();
                    break;
                case 2:
                    this.consultaPrestamoPorCliente();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 0);
    }

    public void consultaPrestamoPorCliente() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el apellido del cliente a consultar:");
        String apellido = leer.next();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.apellido LIKE :ape").setParameter("ape", "%" + apellido + "%").getResultList();
        if (prestamos.isEmpty()) {
            System.out.println("La búsqueda no ha arrojado ningún préstamo asociado al apellido ingresado.");
        } else {
            System.out.println("Resultado/s de la búsqueda:");
            for (Prestamo prest : prestamos) {
                System.out.println("Cliente: ID " + prest.getCliente().getId() + ". " + prest.getCliente().getNombre() + " " + prest.getCliente().getApellido() + ". DNI: " + prest.getCliente().getDNI() + ". Tel.: " + prest.getCliente().getTelefono() + ".");
                System.out.println("Libro: " + prest.getLibro().getTitulo() + ", de " + prest.getLibro().getAutor() + ". Fecha devol.: " + prest.getFechaDevolucion() + ".");
            }
        }
    }

    public void consultaPrestamoPorLibro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el título del libro a consultar:");
        String titulo = leer.next();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.libro.titulo LIKE :nom").setParameter("nom", "%" + titulo + "%").getResultList();
        if (prestamos.isEmpty()) {
            System.out.println("La búsqueda no ha arrojado ningún préstamo asociado al título ingresado.");
        } else {
            System.out.println("Resultado/s de la búsqueda:");
            for (Prestamo prest : prestamos) {
                System.out.println("Cliente: " + prest.getCliente().getNombre() + " " + prest.getCliente().getApellido() + ". DNI: " + prest.getCliente().getDNI() + ". Tel.: " + prest.getCliente().getTelefono() + ".");
                System.out.println("Libro: " + prest.getLibro().getTitulo() + ", de " + prest.getLibro().getAutor() + ". Fecha devol.: " + prest.getFechaDevolucion() + ".");
            }
        }
    }
    
    public void devolverPrestamo(){
         leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Devolución de libro.");
         System.out.print("Ingrese el apellido del cliente: ");
         String apellido = leer.next();
         System.out.print("Ingrese el título que devuelve: ");
         String titulo = leer.next();
        //revisar si cambiar el List por un objeto unitario
         List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.apellido LIKE :ape AND p.libro.titulo LIKE :nom")
                 .setParameter("ape", "%" + apellido + "%").setParameter("nom", "%" + titulo + "%").getResultList();
  if (prestamos.isEmpty()) {
            System.out.println("La búsqueda no ha arrojado ningún préstamo asociado al título ingresado.");
        } else {
            System.out.println("Resultado/s de la búsqueda:");
            for (Prestamo prest : prestamos) {
                System.out.println("Cliente: " + prest.getCliente().getNombre() + " " + prest.getCliente().getApellido() + ". DNI: " + prest.getCliente().getDNI() + ". Tel.: " + prest.getCliente().getTelefono() + ".");
                System.out.println("Libro: " + prest.getLibro().getTitulo() + ", de " + prest.getLibro().getAutor() + ". Fecha devol.: " + prest.getFechaDevolucion() + ".");
            }
        }
        
    }

}
