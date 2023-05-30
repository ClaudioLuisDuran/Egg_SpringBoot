
package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Claudio Durán
 */
public class Alumno {
    private int id_alumno;
    private String apellido;
    private String nombres;
    private Date fechaNac;
    private String nacionalidad;
    private String DNI;
    private String curso;
    private ArrayList<Integer> notasAlumno;

    public Alumno() {
    }

    public Alumno(int id_alumno, String apellido, String nombres, Date fechaNac, String nacionalidad, String DNI, String curso, ArrayList<Integer> notasAlumno) {
        this.id_alumno = id_alumno;
        this.apellido = apellido;
        this.nombres = nombres;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.DNI = DNI;
        this.curso = curso;
        this.notasAlumno = notasAlumno;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Integer> getNotasAlumno() {
        return notasAlumno;
    }

    public void setNotasAlumno(ArrayList<Integer> notasAlumno) {
        this.notasAlumno = notasAlumno;
    }

  
    
}
