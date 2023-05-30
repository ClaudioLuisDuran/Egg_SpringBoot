package libreria.Servicios;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;

/**
 * @author ClaudioDuran
 */
public class LibroServicio {

    Scanner leer;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    AutorServicio As = new AutorServicio();
    EditorialServicio Es = new EditorialServicio();

    //Creacion de libro
    public void crearLibro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cargar nuevo LIBRO a la base de datos");
        System.out.println("Ingrese el título del libro");
        Libro libroNuevo = new Libro();
        libroNuevo.setTitulo(leer.next());
        System.out.println("Ingrese el año de publicación:");
        libroNuevo.setAnio(leer.nextInt());
        System.out.println("ISBN");
        libroNuevo.setIsbn(leer.nextLong());
        System.out.println("Ingrese la cantidad de ejemplares en existencia:");
        libroNuevo.setEjemplares(leer.nextInt());
        libroNuevo.setEjemplaresPrestados(0);
        libroNuevo.setEjemplaresRestantes(libroNuevo.getEjemplares());
        libroNuevo.setAlta(Boolean.TRUE);

        //Listar autores
        As.listarAutores();
        //cargar autor
        System.out.println("Elija el autor por su ID:");
        int ID = leer.nextInt();
        Autor autorElejido = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =:id")
                .setParameter("id", ID)
                .getSingleResult();
        libroNuevo.setAutor(autorElejido);

        //Listar editoriales
        Es.listarEditoriales();
        //cargar autor
        System.out.println("Elija la Editorial correspondiente por su ID:");
        int IDed = leer.nextInt();
        Editorial editorialElejida = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id =:id")
                .setParameter("id", IDed)
                .getSingleResult();
        libroNuevo.setEditorial(editorialElejida);

        em.getTransaction().begin();
        em.persist(libroNuevo);
        em.getTransaction().commit();
    }

    //Consulta de todos los libros
    public void listarLibro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();

        System.out.println("Lista de Libros:");
        for (Libro libro : libros) {
            System.out.println(libro.getId() + ") " + libro.getTitulo() + "(" + libro.getAnio() + ")" + " - " + libro.getAutor().getNombre() + ".");
            System.out.print("Ejemplares: " + libro.getEjemplares() + "(Prestados: " + libro.getEjemplaresPrestados() + ")" + " - ISBN:" + libro.getIsbn() + " / Estado: ");
            if (Objects.equals(libro.getAlta(), Boolean.TRUE)) {
                System.out.println("Activo.");
            } else {
                System.out.println("No activo.");
            }
        }
        System.out.println("Presione enter para volver al menú.");
        String Z = leer.nextLine();
    }

    //Modificación de un libro buscando por parte de un nombre
    public void modificarLibro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el título o parte del título que desea consultar:");
        String titulo = leer.next();

        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", "%" + titulo + "%").getResultList();

        for (int i = 0; i < libros.size(); i++) {
            System.out.println("ID: " + libros.get(i).getId() + " - " + libros.get(i).getTitulo() + ", " + libros.get(i).getAutor().getNombre() + ".");
        }

        System.out.println("Ingrese el ID del libro a modificar:");
        int id = leer.nextInt();
        Libro libro1 = em.find(Libro.class, id);
        System.out.print(libro1.getId() + ") Nombre: " + libro1.getTitulo() + " / Estado: ");
        int opc;
        do {
            System.out.println("¿Que dato desea modificar?");
            System.out.println("1.- Título. (" + libro1.getTitulo() + ")\n"
                    + "2.- Año. (" + libro1.getAnio() + ")\n"
                    + "3.- Autor. (" + libro1.getAutor().getNombre() + ")\n"
                    + "4.- ISBN. (" + libro1.getIsbn() + ")\n"
                    + "5.- Editorial. (" + libro1.getEditorial().getNombre() + ")\n"
                    + "6.- Ejemplares. (" + libro1.getEjemplares() + ")\n"
                    + "7.- Prestados. (" + libro1.getEjemplaresPrestados() + ")\n"
                    + "8.- Restantes. (" + libro1.getEjemplaresRestantes() + ")\n"
                    + "9.- Estado. (" + libro1.getAlta() + ")\n"
                    + "0.- Salid del submenú.");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese la modificación del título:");
                    libro1.setTitulo(leer.next());
                    break;
                case 2:
                    System.out.println("Ingrese la modificación del Año:");
                    libro1.setAnio(leer.nextInt());
                    break;
                case 4:
                    System.out.println("Ingrese el ISBN correspondiente:");
                    libro1.setIsbn(leer.nextLong());
                    break;
                case 6:
                    System.out.println("Ingrese la nueva cantidad de ejemplares:");
                    libro1.setEjemplares(leer.nextInt());
                    libro1.setEjemplaresRestantes(libro1.getEjemplares() - libro1.getEjemplaresPrestados());
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad de prestados que corresponda:");
                    libro1.setEjemplaresPrestados(leer.nextInt());
                    libro1.setEjemplaresRestantes(libro1.getEjemplares() - libro1.getEjemplaresPrestados());
                    break;
                case 8:
                    System.out.println("Ingrese la cantidad correcta de restantes:");
                    libro1.setEjemplaresRestantes(leer.nextInt());
                    libro1.setEjemplares(libro1.getEjemplaresPrestados() + libro1.getEjemplaresRestantes());
                    break;
                case 9:
                    if (Objects.equals(libro1.getAlta(), Boolean.TRUE)) {
                        libro1.setAlta(Boolean.FALSE);
                    } else {
                        libro1.setAlta(Boolean.TRUE);
                    }
                    System.out.println("Ahora el Libro " + libro1.getTitulo() + " ha modificado su estado a: " + libro1.getAlta() + ".");
                    break;
                case 3:
                    //Listar autores
                    System.out.println("Revise el ID del autor correspondiente.");
                    As.listarAutores();
                    //cargar autor
                    System.out.println("Ingrese el nuevo autor por su ID:");
                    int ID = leer.nextInt();
                    Autor autorElejido = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =:id")
                            .setParameter("id", ID)
                            .getSingleResult();
                    libro1.setAutor(autorElejido);
                case 5:
                    //Listar Editoriales
                    System.out.println("Revise el ID de la Editorial correspondiente.");
                    Es.listarEditoriales();
                    //cargar autor
                    System.out.println("Ingrese la Editorial correspondiente por su ID:");
                    int IDed = leer.nextInt();
                    Editorial editorialElejida = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id =:id")
                            .setParameter("id", IDed)
                            .getSingleResult();
                    libro1.setEditorial(editorialElejida);
                case 0:
                    System.out.println("Ha salido del submenú de modificación de datos de libros.");
                    System.out.println("Presione ENTER para volver al menú principal.");
                    leer.nextLine();
                default:
                    System.out.println("La opción ingresada no existe en este submenú.");
            }
            em.getTransaction().begin();
            em.merge(libro1);
            em.getTransaction().commit();
        } while (opc != 0);
    }
    
    //Submenu busquedas de libros
    public void submenuBusquedaLibros(){
       leer = new Scanner(System.in).useDelimiter("\n");
       int opc;
       do{
           System.out.println("Submenú de búsquedas de Libros:\n"
                   + "1.- Buscar libro/s por título.\n"
                   + "2.- Buscar libro/s por ISBN.\n"
                   + "3.- Buscar libro/s por Autor.\n"
                   + "4.- Buscar libro/s por Editorial.\n"
                   + "0.- Volver al Menú Principal.");
           opc = leer.nextInt();
           switch (opc) {
               case 1:
                   this.buscarLibroPorNombre();
                   break;
                 case 2:
                   this.buscarLibroPorISBN();
                   break;
                   case 3:
                   this.buscarLibroPorAutor();
                   break;
                   case 4:
                   this.buscarLibroPorEditorial();
                   break; 
               default:
                   System.out.println("Volviendo al menú principal....");
           }
    }while(opc!=0);
  }

    // Buscar un libro por nombre y mostrar sus datos
    public void buscarLibroPorNombre() {
        try {
            leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el titulo o parte del título del libro a buscar:");
            String titulo = leer.next();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                    .setParameter("titulo", "%" + titulo + "%").getResultList();

            for (int i = 0; i < libros.size(); i++) {
                System.out.println("ID: " + libros.get(i).getId() + " - " + libros.get(i).getTitulo() + ", " + libros.get(i).getAutor().getNombre() + ".");
                System.out.println("Total ejemplares: " + libros.get(i).getEjemplares() + "(Prestados: " + libros.get(i).getEjemplaresPrestados() + ")");
            }
        } catch (Exception e) {
            System.out.println("La búsqueda no arrojó ningún resultado.");
        }
        System.out.println("Presione Enter para continuar.");
        leer.nextLine();
        leer.nextLine();
    }

        // Buscar un libro por nombre y mostrar sus datos
    public void buscarLibroPorISBN() {
        try {
            leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el ISBN del libro a buscar:");
            Long isbn = leer.nextLong();
//            Libro libro = em.find(Libro.class, isbn);
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn =:isbn").setParameter("isbn", isbn).getSingleResult();
            System.out.println("Resultado de la búsqueda:");
                System.out.println("ID: " + libro.getId() + " - " + libro.getTitulo() + ", " + libro.getAutor().getNombre() + ".");
                System.out.println("Total ejemplares: " + libro.getEjemplares() + "(Prestados: " + libro.getEjemplaresPrestados() + ")");
        } catch (Exception e) {
            System.out.println("La búsqueda no arrojó ningún resultado.");
        }
        System.out.println("Presione Enter para continuar.");
        leer.nextLine();
        leer.nextLine();
    }
    
    // Buscar libro por nombre de autor
    public void buscarLibroPorAutor(){
    try{
        // buscamos por parte del nombre del autor
        System.out.println("Ingrese el nombre o parte del nombre del autor que desea consultar:");
        String nombre = leer.next();
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :NOMBRE").setParameter("NOMBRE", "%"+nombre+ "%").getResultList();
        if (libros.isEmpty()) {
            System.out.println("No se han encontrado libros que coincidan con la búsqueda de '"+nombre+"'.");
        }
        System.out.println("Lista de Libros encontrados para la búsqueda de '"+nombre+"'.");
        for (Libro libro : libros) {
            System.out.println(libro.getAutor().getNombre() + ", "+libro.getTitulo()+".");
        }
    }catch(Exception e){
        System.out.println("Error de consulta.");
    }
}
    
    
        // Buscar libro por nombre de editorial
    public void buscarLibroPorEditorial(){
    try{
        // buscamos por parte del nombre del autor
        System.out.println("Ingrese el nombre o parte del nombre de la editorial que desea consultar:");
        String nombre = leer.next();
        Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :NOMBRE").setParameter("NOMBRE", "%"+nombre+ "%").getResultList();
        if (libros.isEmpty()) {
            System.out.println("No se han encontrado libros que coincidan con la búsqueda de '"+nombre+"'.");
        }
        System.out.println("Lista de Libros encontrados para la búsqueda de '"+nombre+"'.");
        for (Libro libro : libros) {
            System.out.println(libro.getEditorial().getNombre() + ", "+libro.getTitulo()+".");
        }
    }catch(Exception e){
        System.out.println("Error de consulta.");
    }
}
    
    
    //Eliminacion de un libro buscandolo por su nombre
    public void eliminarLibro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        try {
            leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el titulo o parte del título del libro a eliminar de la base de datos:");
            String titulo = leer.next();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                    .setParameter("titulo", "%" + titulo + "%").getResultList();

            for (int i = 0; i < libros.size(); i++) {
                System.out.println("ID: " + libros.get(i).getId() + " - " + libros.get(i).getTitulo() + ", " + libros.get(i).getAutor().getNombre() + ".");
                System.out.println("Total ejemplares: " + libros.get(i).getEjemplares() + "(Prestados: " + libros.get(i).getEjemplaresPrestados() + ")");
                //borrar por ID

                System.out.println("Ingrese el ID del título que desea borrar:");
                int id = leer.nextInt();
                Libro libro1 = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.id =:ID")
                        .setParameter("ID", id)
                        .getSingleResult();
                String eliminado = libro1.getTitulo();
                em.getTransaction().begin();
                em.remove(libro1);
                em.getTransaction().commit();
                System.out.println("El libro " + eliminado + "  ha sido removido de la base de datos.");
            }
        } catch (Exception e) {
            System.out.println("La búsqueda no arrojó ningún resultado.");
        }
        System.out.println("Presione Enter para continuar.");
        leer.nextLine();
        leer.nextLine();
    }

}
