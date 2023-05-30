package Servicios;

import Entidades.Alumno;
import Entidades.Curso;
import Entidades.Escuela;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class ServiciosCurso {

    Scanner leer;

    //Mostrar Curso solo
    public void mostrarCursoSolo(ArrayList c) {

        Iterator<Curso> it = c.iterator();
        while (it.hasNext()) {
            Curso aux = it.next();
            System.out.print(" [" + aux.getCursoDivision() + "] Materias: " + aux.getMaterias());
        }
        System.out.println("");
    }

//    //Mostrar Curso y sus alumnos
//    public void mostrarCursoYalumnos(Escuela e) {
//        leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Que curso desea listar? (ej 3A)");
//        String curso = leer.next();
//        Iterator<Curso> it = e.getCursos().iterator();
//        while (it.hasNext()) {
//            Curso aux = it.next();
//            String aux2 =aux.getCursoDivision();
//            if (aux2.equalsIgnoreCase(curso)) {
//                Iterator <Alumno> it2 = aux.getAlumnado().iterator();
//                while (it2.hasNext()) {
//                    String aux3 = it2.next().getApellido();
//                    System.out.println("> " + aux2);
//                }
//            }
//        }
//    }
    
    
        //Mostrar Curso y sus alumnos
    public void mostrarCursoYalumnos(Escuela e, String curso) {

        for (Curso curso1 : e.getCursos()) {
            if (e.getCursos().equals(curso)) {
                Iterator <Alumno> it2 = (Iterator <Alumno>) c.getAlumnado();
                Alumno aux3 = it2.next();
                System.out.println(aux3.getApellido()+", "+aux3.getNombres()+".");
                
            }
        }
       

                }
                }

    
    
    
//
//    // Mostrar materias de un curso
//    public void mostrarMaterias(Curso c) {
//
//        Iterator<String> it = c.getMaterias().getMaterias().iterator();
//        while (it.hasNext()) {
//            String aux = it.next();
//            System.out.println(aux + ", ");
//        }
//
//    }


