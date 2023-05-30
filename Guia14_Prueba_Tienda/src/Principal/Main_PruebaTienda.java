/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Fabricante;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ClaudioDuran
 */
public class Main_PruebaTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaPU");
        EntityManager em =  emf.createEntityManager();
       
        //Carga de datos en las tablas
//        try {
//            //Crear fabricantes
//            Fabricante fabricante1 = new Fabricante();
//            fabricante1.setId(UUID.randomUUID().toString());
//            fabricante1.setCodigo(1);
//            fabricante1.setNombre("Garbarino");
//            
//            em.getTransaction().begin();
//            em.persist(fabricante1);
//            em.getTransaction().commit();
//            
//            Fabricante fabricante2 = new Fabricante();
//            fabricante2.setId(UUID.randomUUID().toString());
//            fabricante2.setCodigo(2);
//            fabricante2.setNombre("Brother");
//            
//            em.getTransaction().begin();
//            em.persist(fabricante2);
//            em.getTransaction().commit();
//            
//            //Crear productos
//             Producto producto1 = new Producto();
//            producto1.setId(UUID.randomUUID().toString());
//            producto1.setCodigo(1);
//            producto1.setNombre("Monitor HD 33");
//            producto1.setPrecio(5000);
//            producto1.setFabricante(fabricante1);
//            
//            em.getTransaction().begin();
//            em.persist(producto1);
//            em.getTransaction().commit();
//            
//            Producto producto2 = new Producto();
//            producto2.setId(UUID.randomUUID().toString());
//            producto2.setCodigo(2);
//            producto2.setNombre("Mouse 330");
//            producto2.setPrecio(500);
//            producto2.setFabricante(fabricante2);
//            
//            em.getTransaction().begin();
//            em.persist(producto2);
//            em.getTransaction().commit();
//            
//            
//            
//            
//        } catch (Exception e) {
//            System.out.println("Error");
//        }

//// Buscar fabricante po criterio Codifo
//        int codigo = 12;
//         Fabricante fabricante1 = (Fabricante) em.createQuery("SELECT f "
//                 + "FROM Fabricante f "
//                 + "WHERE f.codigo = :codigo")
//                 .setParameter("codigo", codigo)
//                 .getSingleResult();
//         System.out.println(fabricante1.getNombre());
//   
//    // buscarx ID
//        Fabricante fabricante2 = em.find(Fabricante.class, fabricante1.getId());
//        System.out.println(fabricante1.getId() + "/ " + fabricante2.getNombre());
    
        //Listar fabricantes
//        Collection<Fabricante> fabricantes = em.createQuery("SELECT f"
//        + " FROM Fabricante f").getResultList();
//    
//        for (Fabricante fabricante : fabricantes) {
//            System.out.println(fabricante.getNombre());
//            System.out.println("Codigo: "+fabricante.getCodigo());
//        }
        
        
            // Borrar x ID de fabricante los duplicados 
       
//            Collection<Fabricante> fabricantes2 = em.createQuery("SELECT f "
//                 + "FROM Fabricante f "
//                 + "WHERE f.codigo = :codigo")
//                 .setParameter("codigo", 1)
//                 .getResultList();
//            int cont = 1;
//                    for (Fabricante fabricantex : fabricantes2) {
//            System.out.println(fabricantex.getNombre());
//            System.out.println("Codigo: "+fabricantex.getCodigo());
//
//                        if (cont <5) {
//                             em.getTransaction().begin();
//            em.remove(fabricantex);
//            em.getTransaction().commit();
//             cont++;
//                        }
//       }
                   

// Midificar un producto

    int codigo = 1;
         Producto producto1 = (Producto) em.createQuery("SELECT p "
                 + "FROM Producto p "
                 + "WHERE p.codigo =:codigo")
                 .setParameter("codigo", codigo)
                 .getSingleResult();
                 producto1.setNombre("Monitor HD 45''");
                 producto1.setPrecio(9990);
                  em.getTransaction().begin();
                    em.merge(producto1);
                     em.getTransaction().commit();
        

    }
}
