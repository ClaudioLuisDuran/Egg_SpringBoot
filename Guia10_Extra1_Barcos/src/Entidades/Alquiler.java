package Entidades;

import java.time.LocalDate;

/**
 * @author ClaudioDuran
 */
public class Alquiler {

    private String nombre;
    private String DNI;
    private LocalDate fecha_ini;
    private LocalDate fecha_fin;
    private int posicion;
    private Barco barco;
    private int precio;

    public Alquiler() {
    }

    public Alquiler(String nombre, String DNI, LocalDate fecha_ini, LocalDate fecha_fin, int posicion, Barco barco, int precio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.posicion = posicion;
        this.barco = barco;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(LocalDate fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

}
