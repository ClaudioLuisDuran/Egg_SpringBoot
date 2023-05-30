/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Claudio Durán
 */
public class Escuela {
    private String nombre;
    private ArrayList <Curso> cursos;

    public Escuela() {
    }

    public Escuela(String nombre, ArrayList<Curso> cursos) {
        this.nombre = nombre;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Escuela{" + "nombre=" + nombre + ", cursos=" + cursos + '}';
    }


    
    
}
