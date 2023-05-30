
package Tienda.servicios;

import Tienda.Persistencia.DAO;
import Tienda.Persistencia.ProductoDAO;
import Tienda.Persistencia.UsuarioDAO;
import Tienda.entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author ClaudioDuran
 */
public class ServiciosTienda {
    
    /*
 a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
    */
    
    private UsuarioDAO Udao;
    private DAO DAO;
    private final ProductoDAO Pd = new ProductoDAO();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void Menu() throws Exception{
        String opc;
        do{
            
      
        System.out.println("MENÚ TIENDA");
        System.out.println("a) Listar nombre de producto.\n"
                + "b) Listar nombre y precios de productos.\n"
                + "c) Listar productos entre $120 y $200.\n"
                + "d) Listar Portátiles.\n"
                + "e) Listar nombre y precio del más barato.\n"
                + "f) Agregar un nuevo producto.\n"
                + "g) Agregar un nuevo fabricante.\n"
                + "h) Actualizar datos de un producto.\n"
                + "X) Salir del sistema.");
        opc= toLowerCase(leer.next());
        
            switch (opc) {
                case "a":
                    this.listarNombreProductos();
                    break;
                    case "b":
                    this.listarProductos();
                    break;
                    case "c":
                    this.listarProductosPorPrecio();
                    break;
                    case "d":
                    this.listarPortatiles();
                    break;
                    case "e":
                    this.listarMAsBarato();
                    break;
                    case "f":
                    this.crearProducto();
                    break;
                    case "g":
                    
                    break;
                    case "h":
                    this.actualizarPrecioProducto();
                    break;
                default:
                    System.out.println("La opción ingresa no existe.");
            }
            if (opc.equalsIgnoreCase("x")) {
                System.out.println("Ha salido del sistema. Gracias.");
            }
          }while(!opc.equalsIgnoreCase("x"));
    }

    
    /*DA ERROR*/
    public void crearProducto() throws Exception{
        Producto producto = new Producto();
        System.out.println("Ingresar nuevo producto.");
        System.out.println("Ingrese el nombre del producto:");
        producto.setNombre(leer.next());
        System.out.println("Ingrese el precio del producto:");
        producto.setPrecio(leer.nextInt());
        System.out.println("Ingrese el Código del fabricante:");
       producto.setCodigoFabricante(leer.nextInt());
       Pd.guardarProducto(producto);

    }
    
    // Lista productos por Nombre, precio y codigo fabricante
    public void listarProductos() throws Exception{
    ArrayList <Producto> listado = new ArrayList();
      listado =  Pd.listarProductos();
        for (Producto producto : listado) {
            System.out.println(producto.getId_producto() + ".- "+producto.getNombre() + "  -  $" + producto.getPrecio() + " - Fabricante: " + producto.getCodigoFabricante() + ".");
        }
    }
    
        // Lista productos por Nombre
    public void listarNombreProductos() throws Exception{
    ArrayList <Producto> listado = new ArrayList();
      listado =  Pd.listarProductos();
        for (Producto producto : listado) {
            System.out.println(producto.getNombre() +".");
        }
    }
    
        // Lista productos cuyo precio esta entre 120 y 200
    public void listarProductosPorPrecio() throws Exception{
    ArrayList <Producto> listado = new ArrayList();
      listado =  Pd.listarRangoDePrecios();
        for (Producto producto : listado) {
            System.out.println(producto.getId_producto() + ".- "+producto.getNombre() + "  -  $" + producto.getPrecio() + " - Fabricante: " + producto.getCodigoFabricante() + ".");
        }
    }
    
           // Lista productos que se llamen Portatil
    public void listarPortatiles() throws Exception{
    ArrayList <Producto> listado = new ArrayList();
      listado =  Pd.listarTipoPortatil();
        for (Producto producto : listado) {
            System.out.println(producto.getId_producto() + ".- "+producto.getNombre() + "  -  $" + producto.getPrecio() + " - Fabricante: " + producto.getCodigoFabricante() + ".");
        }
    }
    
               // Lista producto mas barato
    public void listarMAsBarato() throws Exception{
    ArrayList <Producto> listado = new ArrayList();
      listado =  Pd.listarBarato();
        for (Producto producto : listado) {
            System.out.println(producto.getId_producto() + ".- "+producto.getNombre() + "  -  $" + producto.getPrecio() + " - Fabricante: " + producto.getCodigoFabricante() + ".");
        }
    }
    
    // Actualizar dato de producto
    public void actualizarPrecioProducto() throws Exception{
        // buscar product por nombres parecidos
        System.out.println("Actualización de precio");
        System.out.println("Ingrese el nombre o parte del nombre del producto que desea modificar:");
        String nombre = leer.next();
        
         ArrayList <Producto> listado = new ArrayList();
      listado =  Pd.listarPorNombre(nombre);
        for (Producto producto : listado) {
            System.out.println(producto.getId_producto() + ".- "+producto.getNombre() + "  -  $" + producto.getPrecio() + " - Fabricante: " + producto.getCodigoFabricante() + ".");
        }
        
        System.out.println("Ingrese el ID de producto que desea modificar el precio:");
        int ID = leer.nextInt();
        System.out.println("Ingrese el nuevo precio:");
        int precio = leer.nextInt();
        Pd.modificaProducto(ID, precio);
        
    }
    
    
    
}
