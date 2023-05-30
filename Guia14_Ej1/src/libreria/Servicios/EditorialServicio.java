
package libreria.Servicios;

import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Editorial;

/**
 * @author ClaudioDuran
 */
public class EditorialServicio {
    
     Scanner leer;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    //Creacion de editorial
    public void crearEditorial() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cargar nueva EDITORIAL a la base de datos");
        System.out.println("Ingrese el nombre de la Editorial");
        Editorial editorialNueva = new Editorial();
        editorialNueva.setNombre(leer.next());
        editorialNueva.setAlta(Boolean.TRUE);
        em.getTransaction().begin();
        em.persist(editorialNueva);
        em.getTransaction().commit();
    }

    //Consulta de todas las editorial
    public void listarEditoriales() {

        Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
        System.out.println("Lista de Editoriales:");
        for (Editorial editorial : editoriales) {
            System.out.print(editorial.getId() + ") " + editorial.getNombre() + " / Estado: ");
            if (Objects.equals(editorial.getAlta(), Boolean.TRUE)) {
                System.out.println("Activo.");
            } else {
                System.out.println("No activo.");
            }
        }
    }

    //Consulta de una editorial
    public void bucarEditorial() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre o parte del nombre de la Editorial que desea consultar:");
        String nombre = leer.next();

        Editorial edit1 = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getSingleResult();
        System.out.print(edit1.getId() + ") Nombre: " + edit1.getNombre() + " / Estado: ");
        if (Objects.equals(edit1.getAlta(), Boolean.TRUE)) {
            System.out.println("Activo.");
        } else {
            System.out.println("No activo.");
        }
    }

    // Modificación de una editorial
    public void modificarAltaBajaEditorial() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre o parte del nombre de la Editorial para modifcar su estado actual:");
        String nombre = leer.next();
        Editorial edit1 = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getSingleResult();
        if (Objects.equals(edit1.getAlta(), Boolean.TRUE)) {
            edit1.setAlta(Boolean.FALSE);
        } else {
            edit1.setAlta(Boolean.TRUE);
        }
        em.getTransaction().begin();
        em.merge(edit1);
        em.getTransaction().commit();
        System.out.println("Ahora la Editorial " + edit1.getAlta() + " ha modificado su estado: " + edit1.getAlta() + ".");
    }

    //Eliminacion de una editorial
    public void eliminarEditorial() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre o parte del nombre de la Editorial a eliminar de la base de datos:");
        String nombre = leer.next();

        Editorial edit1 = (Editorial) em.createQuery("SELECT e "
                + "FROM Editorial e "
                + "WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getSingleResult();
        em.getTransaction().begin();
        em.remove(edit1);
        em.getTransaction().commit();
        System.out.println("La Editorial ha sido removida de la base de datos.");
    }  
}
