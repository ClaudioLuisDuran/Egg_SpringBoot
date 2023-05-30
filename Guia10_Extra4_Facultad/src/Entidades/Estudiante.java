package Entidades;

import Enumeraciones.Cursos;
import Enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class Estudiante extends Persona {

    private Cursos curso;

    public Estudiante() {
    }

    public Estudiante(Cursos curso, String nombre, String apellido, String DNI, EstadoCivil estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.curso = curso;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public void reasignarCurso() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Reasignación de curso");
        System.out.println("El curso actual es " + this.getCurso() + ".");
        System.out.println("Ingrese el nuevo curso (");

        for (Cursos Curso : Cursos.values()) {
            System.out.print(Curso + ", ");
        }
        System.out.print("): ");

        String cursoNuevo;
        boolean existe = false;
        int cont = 0;
//        do {
        cursoNuevo = leer.next();
        for (Cursos Curso : Cursos.values()) {
            if (cursoNuevo.equalsIgnoreCase(Curso.getNombreCurso())) {
                this.setCurso(Curso);
                existe = true;
                break;
            }
        }
//        } while (!existe);
        System.out.println("El alumno fue reasignado de curso.");
        System.out.println("");
    }

    public void crearEstudiante() {
        System.out.println("Ingresar nuevo Estudiante");
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        super.crearPersona();
        int cont =0;
        System.out.print("Curso asignado (");
        for (Cursos Curso : Cursos.values()) {
            System.out.print(Curso.getNombreCurso() + " | ");
             cont++;
            if (cont == 3 || cont ==6){
                System.out.println("");
            }
        }
        System.out.println("): ");
        String cursoAsignado;
        cursoAsignado = scan.next();
        for (Cursos Curso : Cursos.values()) {
            if (cursoAsignado.equalsIgnoreCase(Curso.getNombreCurso())) {
                this.setCurso(Curso);
                      System.out.println("");
                break;
            }
        }
  
    }
    
    public void mostrarEstudiante(){
        System.out.println("Datos de estudiante");
       super.mostrarPersona();
        System.out.println("Curso: "+this.getCurso().getNombreCurso());
        System.out.println("");
    }

}
