
package Tienda.entidades;

/**
 *
 * @author ClaudioDuran
 */
public class Fabricante {
    
    private int codigoFabricante;
    private String nombreFabricante;

    public Fabricante() {
    }

    public Fabricante(int codigoFabricante, String nombreFabricante) {
        this.codigoFabricante = codigoFabricante;
        this.nombreFabricante = nombreFabricante;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    
    
    
}
