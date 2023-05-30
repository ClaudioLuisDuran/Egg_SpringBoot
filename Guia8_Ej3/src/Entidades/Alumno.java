//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.

package Entidades;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    private ArrayList <Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.notas.add(nota1);
        this.notas.add(nota2);
        this.notas.add(nota3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setNotas(ArrayList notas) {
        this.notas = notas;
    }
    
    
    
}
