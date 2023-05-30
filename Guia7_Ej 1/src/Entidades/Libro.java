/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Claudio Durán
 */
public class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    
    
}
