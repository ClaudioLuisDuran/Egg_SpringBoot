package Libro;

import java.util.Comparator;

public class Libro {

    private int numero;
    private String nombre;
    private String autor;
    private Integer pag;

    public Libro() {
    }

    public Libro(int numero, String nombre, String autor, Integer pag) {
        this.numero = numero;
        this.nombre = nombre;
        this.autor = autor;
        this.pag = pag;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    @Override
    public String toString() {
        return "Libro{" + "numero=" + numero + ", nombre=" + nombre + "\n"
                + " autor=" + autor + ", pag=" + pag + '}';
    }

    public static Comparator<Libro> compararNombre = (Libro l1, Libro l2) -> l1.getNombre().compareTo(l2.getNombre());

public static Comparator<Libro> compararPagina = (Libro l1, Libro l2) -> l1.getPag().compareTo(l2.getPag());

}
