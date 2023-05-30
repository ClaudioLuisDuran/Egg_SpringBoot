
package Tienda.Persistencia;

import Tienda.entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author ClaudioDuran
 */
public class ProductoDAO extends DAO {
    
        public void guardarProducto(Producto producto) throws Exception{
        
        try {
            if (producto == null) {
                throw new Exception("Debe tener un producto para ingresar...");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
            + "VALUES('"+producto.getNombre()+" ',' "+producto.getPrecio()+ " ',' "+producto.getCodigoFabricante()+" ');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
        
        
               public void modificaProducto(int ID, int precio) throws Exception{
        
        try {
            String sql = "UPDATE producto SET precio = " + precio + " WHERE codigo =  " + ID +";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    } 
               
               
                       public void eliminarProducto(String nombre) throws Exception{
        
        try {
            String sql = "DELETE FROM producto WHERE nombre = ' " + nombre + " '; ";
               insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
               
                   public Producto buscarProductoPorNombre(String nombre) throws Exception{
        
        try {
            String sql = "SELECT * FROM producto WHERE nombre = '"+nombre+"';";
            consultarBase(sql);
            Producto producto = null;
            while(resultado.next()){
                producto = new Producto();
//                producto.setCodigo(resultado.getInt(1));
                        producto.setNombre(resultado.getNString(2));
                        producto.setPrecio(resultado.getInt(3));
                        producto.setCodigoFabricante(resultado.getInt(4));
            }   
            desconectarBase();
            return producto;  
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
                   
                   public ArrayList<Producto> listarProductos() throws Exception{
        try {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            Producto producto = null;
            ArrayList <Producto> productos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                        producto.setId_producto(resultado.getInt(1));
                        producto.setNombre(resultado.getString(2));
                        producto.setPrecio(resultado.getInt(3));
                        producto.setCodigoFabricante(resultado.getInt(4));
                        productos.add(producto);
            }   
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema.");
        }
    }    
                   
public ArrayList<Producto> listarRangoDePrecios() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE precio >120 AND precio < 200;";
            consultarBase(sql);
            Producto producto = null;
            ArrayList <Producto> productos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                        producto.setId_producto(resultado.getInt(1));
                        producto.setNombre(resultado.getString(2));
                        producto.setPrecio(resultado.getInt(3));
                        producto.setCodigoFabricante(resultado.getInt(4));
                        productos.add(producto);
            }   
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema.");
        }
         }

        public ArrayList<Producto> listarTipoPortatil() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%';";
            consultarBase(sql);
            Producto producto = null;
            ArrayList <Producto> productos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                        producto.setId_producto(resultado.getInt(1));
                        producto.setNombre(resultado.getString(2));
                        producto.setPrecio(resultado.getInt(3));
                        producto.setCodigoFabricante(resultado.getInt(4));
                        productos.add(producto);
            }   
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema.");
        }
         }
        
              public ArrayList<Producto> listarBarato() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE precio = (SELECT MIN(precio) FROM producto);";
            consultarBase(sql);
            Producto producto = null;
            ArrayList <Producto> productos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                        producto.setId_producto(resultado.getInt(1));
                        producto.setNombre(resultado.getString(2));
                        producto.setPrecio(resultado.getInt(3));
                        producto.setCodigoFabricante(resultado.getInt(4));
                        productos.add(producto);
            }   
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema.");
        }
        
    }                       
                   
              public ArrayList<Producto> listarPorNombre(String nombre) throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%"+nombre+"%';";
            consultarBase(sql);
            Producto producto = null;
            ArrayList <Producto> productos = new ArrayList();
            while(resultado.next()){
                producto = new Producto();
                        producto.setId_producto(resultado.getInt(1));
                        producto.setNombre(resultado.getString(2));
                        producto.setPrecio(resultado.getInt(3));
                        producto.setCodigoFabricante(resultado.getInt(4));
                        productos.add(producto);
            }   
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema.");
        }
         }      
                   
}
