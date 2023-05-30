package libreria.Servicios;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Autor;

/**
 *
 * @author ClaudioDuran
 */
public class AutorServicio {

    Scanner leer;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    //Creacion de autor
    public void crearAutor() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cargar nuevo AUTOR a la base de datos");
        System.out.println("Ingrese el nombre del autor");
        Autor autorNuevo = new Autor();
        autorNuevo.setNombre(leer.next());
        autorNuevo.setAlta(Boolean.TRUE);
        em.getTransaction().begin();
        em.persist(autorNuevo);
        em.getTransaction().commit();
    }

    //Consulta de todos los autores
    public void listarAutores() {

        Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        System.out.println("Lista de autores:");
        for (Autor autor : autores) {
            System.out.print(autor.getId() + ") " + autor.getNombre() + " / Estado: ");
            if (Objects.equals(autor.getAlta(), Boolean.TRUE)) {
                System.out.println("Activo.");
            } else {
                System.out.println("No activo.");
            }
        }
    }

    //Consulta de un autor
    public void bucarAutor() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el apellido del autor:");
        String nombre = leer.next();
       List <Autor> autor1 =  em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
        for (Autor autor : autor1) {
            System.out.println("ID: "+autor.getId() + ".  " + autor.getNombre());
               if (Objects.equals(autor.getAlta(), Boolean.TRUE)) {
            System.out.println("Estado: Activo.");
        } else {
            System.out.println("Estado: No activo.");
        }
         }
    }

    // Modificación de un autor
    public void modificarAltaBajaAutor() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre o parte del nombre del autor para modifcar su estado actual:");
        String nombre = leer.next();
               List <Autor> autor1 =  em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
        for (Autor autor : autor1) {
            System.out.println("ID: "+autor.getId() + ".  " + autor.getNombre());
               if (Objects.equals(autor.getAlta(), Boolean.TRUE)) {
            System.out.println("Estado: Activo.");
        } else {
            System.out.println("Estado: No activo.");
        }
         }
        System.out.println("Ingrese el ID del autor que desea modificar:");
        int id = leer.nextInt();        
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =:id").setParameter("id", id).getSingleResult();
        if (Objects.equals(autor.getAlta(), Boolean.TRUE)) {
            autor.setAlta(Boolean.FALSE);
        } else {
            autor.setAlta(Boolean.TRUE);
        }
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
        System.out.println("Ahora el autor " + autor.getNombre() + " tiene estado: " + autor.getAlta() + ".");
    }

    //Eliminacion de un autor
    public void eliminarAutor() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el apellido del autor a eliminar:");
        String nombre = leer.next();

        Autor autor1 = (Autor) em.createQuery("SELECT a "
                + "FROM Autor a "
                + "WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getSingleResult();
        
        em.getTransaction().begin();
        em.remove(autor1);
        em.getTransaction().commit();
        System.out.println("El autor pedido ha sido removido de la base de datos.");

    }

}
