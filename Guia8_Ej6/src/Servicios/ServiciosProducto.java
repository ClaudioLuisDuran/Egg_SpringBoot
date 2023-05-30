package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class ServiciosProducto {

    static HashMap<String, Double> listaProductos = new HashMap();
    static Scanner leer;

    public void menu() {
        leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("");
            System.out.println("Sistema de catálogo de productos");
            System.out.println("MENÚ (ingrese su opción)");
            System.out.println("1. Cargar nuevos productos.\n"
                    + "2. Mostrar listado de productos en catálogo.\n"
                    + "3. Modificar precio de un producto.\n"
                    + "4. Borrar producto.\n"
                    + "5. Salir del sistema.");
            System.out.print("Opción >> ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    this.cargarProductos();
                    break;
                case 2:
                    this.mostrarProductos();
                    break;
                case 3:
                    this.modificarPrecio();
                    break;
                case 4:
                    this.borrarProducto();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestros sistemas.");
                    break;
                default:
                    System.out.println("La opción no existe.");
            }
        } while (opc != 5);
    }

    public void cargarProductos() {
        System.out.println("Cargar Productos. Ingrese * para no cargar más.");
        String opc = "%";
        do {
            leer = new Scanner(System.in).useDelimiter("\n");
            Producto p = this.crearProducto();
            if (!p.getNombre().equals("*")) {
                listaProductos.put(p.getNombre(), p.getPrecio());
            } else {
                opc = "*";
            }
        } while (!opc.equals("*"));
        System.out.println("Fin de la carga de productos.");
    }

    public Producto crearProducto() {
        leer = new Scanner(System.in).useDelimiter("\n");
        Producto p = new Producto();
        System.out.print("Nuevo producto:");
        String nombre = leer.next();
        p.setNombre(nombre);
        if (!nombre.equals("*")) {
            System.out.print("Precio de " + p.getNombre() + ": ");
            p.setPrecio(leer.nextDouble());
            listaProductos.put(p.getNombre(), p.getPrecio());
        }
        return p;
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos cargados");
        listaProductos.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t\t $" + entry.getValue());
        });
    }

    public void modificarPrecio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Modificar precio. Ingrese nombre del producto:");
        String nombre = leer.next();
        if (listaProductos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio de " + nombre + ": $");
            listaProductos.replace(nombre, leer.nextDouble());
            System.out.println("El producto ha sido modificado.");
            System.out.println("");
        } else {
            System.out.println("El producto " + nombre + " no se encuentra en la lista.");
        }
    }

    public void borrarProducto() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Borrar producto. Ingrese el producto a borrar: ");
        String prod = leer.next();
        if (listaProductos.containsKey(prod)) {
            listaProductos.remove(prod);
            System.out.println("El producto ha sido hallado y borrado de la lista.");
            System.out.println("");
        } else {
            System.out.println("El producto " + prod + " no ha sido encontrado en la lista.");
        }
    }
}
