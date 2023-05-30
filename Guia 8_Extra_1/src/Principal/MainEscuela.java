package Principal;

import Entidades.Escuela;
import Servicios.ServiciosAlumno;
import Servicios.ServiciosCurso;
import Servicios.ServiciosEscuela;
import Servicios.ServiciosMaterias;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class MainEscuela {
        
    public static void main(String[] args) {
        Scanner leer;
        ServiciosAlumno Sa = new ServiciosAlumno();
        ServiciosCurso Sc = new ServiciosCurso();
        ServiciosMaterias Sm = new ServiciosMaterias();
        ServiciosEscuela Se = new ServiciosEscuela();
        leer = new Scanner(System.in).useDelimiter("\n");
        // Crear escuela
        Escuela escuela = new Escuela();
        Se.crearEscuela(escuela);
        Se.mostrarEscuela(escuela);
        
        //Llenar curso
        System.out.println("Que curso desea completar? (ej 4B)");
        String curso = leer.next();
        Sa.cargarAlumnonuevo(escuela, curso);
        System.out.println("Que curso desea listar? (ej 4B)");
        curso = leer.next();
        Sc.mostrarCursoYalumnos(escuela, curso);
        }     
    }


