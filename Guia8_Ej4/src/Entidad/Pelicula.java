/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
 */

package Entidad;

import java.util.Comparator;

/**
 * @author Claudio Durán
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = 0.0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
   
    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
   
    public static Comparator<Pelicula> compararDuracionMayor = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());

    public static Comparator<Pelicula> compararDuracionMenor = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());

    public static Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());

}
