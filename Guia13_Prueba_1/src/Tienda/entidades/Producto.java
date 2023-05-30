
package Tienda.entidades;

/**
 *
 * @author ClaudioDuran
 */
public class Producto {
    
   private int Id_producto;
    private String nombre;
    private double precio;
    private int codigoFabricante;

    public Producto() {
    }

    public Producto(int Id_producto, String nombre, double precio, int codigoFabricante) {
        this.Id_producto = Id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    public int getId_producto() {
        return Id_producto;
    }

    public void setId_producto(int Id_producto) {
        this.Id_producto = Id_producto;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }
    
    
    
}
