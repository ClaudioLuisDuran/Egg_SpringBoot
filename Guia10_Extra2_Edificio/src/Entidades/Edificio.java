
package Entidades;

/**
 * @author ClaudioDuran
 */
public abstract class Edificio {
    private int ancho, alto, largo;
    private String nombre;

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo, String nombre) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
}
