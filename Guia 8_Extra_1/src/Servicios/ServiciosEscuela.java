package Servicios;

import Entidades.Curso;
import Entidades.Escuela;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Claudio Durán
 */
public class ServiciosEscuela {

    static Scanner leer;

    public Escuela crearEscuela(Escuela e) {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre de la escuela:");
        e.setNombre(leer.next());
        ArrayList<Curso> cursos = new ArrayList();

// crea cursos automaticamente
        String cursoDivision;

        for (int i = 1; i < 11; i++) {
            Curso cursoNuevo = new Curso();
            switch (i) {
                case 1:
                    cursoDivision = "1A";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    Curso aux = cursoNuevo;
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(aux));
                    break;
                case 2:
                    cursoDivision = "1B";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 3:
                    cursoDivision = "2A";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 4:
                    cursoDivision = "2B";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 5:
                    cursoDivision = "3A";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 6:
                    cursoDivision = "3B";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 7:
                    cursoDivision = "4A";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 8:
                    cursoDivision = "4B";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 9:
                    cursoDivision = "5A";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
                case 10:
                    cursoDivision = "5B";
                    cursoNuevo.setId_curso(i);
                    cursoNuevo.setCursoDivision(cursoDivision);
                    cursoNuevo.setMaterias(ServiciosMaterias.crearMateriaPorCurso(cursoNuevo));
                    break;
            }
            cursos.add(cursoNuevo);
        }
        e.setCursos(cursos);
        return e;
    }

// Mostrar datos de la escuela
    public void mostrarEscuela(Escuela e) {
        System.out.println("Escuela: " + e.getNombre() + "\n"
                + "Cursos:");
        Iterator<Curso> it = e.getCursos().iterator();
        while (it.hasNext()) {
            Curso aux = it.next();
            System.out.print(" [" + aux.getCursoDivision() + "]");
            Iterator<String> it2 = aux.getMaterias().getMaterias().iterator();
            while (it2.hasNext()) {
                String aux2 = it2.next();
                System.out.print(" [" + aux2 + "]");
            }
            System.out.println("");
        }
    }

}
