package Entidades;

import java.util.Comparator;

public abstract class Hotel {

    private int habitaciones;

    private int camas;

    private int pisos;

    private Integer precioHab;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos, Integer precioHab) {
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHab = precioHab;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(int precioHab) {
        this.precioHab = precioHab;
    }
    
    public abstract void precioHotel();
    
    public abstract void mostrarHotel();
    
    public static Comparator <Hotel> compararPrecio = (Hotel h1, Hotel h2) -> {
    Integer p1 = h1.getPrecioHab();
    Integer p2 = h2.getPrecioHab();
    return (p1.compareTo(p2));
    };
    
}
