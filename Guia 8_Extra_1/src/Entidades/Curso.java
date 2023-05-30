
package Entidades;

import java.util.ArrayList;

/**
 * @author Claudio Durán
 */
public class Curso {
    private int id_curso;
    private String cursoDivision;
    private int cantAlumnos;
    private Materias materias;
    private ArrayList <Alumno> alumnado;    

    public Curso() {
    }

    public Curso(int id_curso, String cursoDivision, int cantAlumnos, Materias materias, ArrayList<Alumno> alumnado) {
        this.id_curso = id_curso;
        this.cursoDivision = cursoDivision;
        this.cantAlumnos = cantAlumnos;
        this.materias = materias;
        this.alumnado = alumnado;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getCursoDivision() {
        return cursoDivision;
    }

    public void setCursoDivision(String cursoDivision) {
        this.cursoDivision = cursoDivision;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public ArrayList<Alumno> getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(ArrayList<Alumno> alumnado) {
        this.alumnado = alumnado;
    }

   
    
}
