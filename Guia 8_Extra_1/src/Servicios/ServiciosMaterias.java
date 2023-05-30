package Servicios;

import Entidades.Curso;
import Entidades.Materias;
import java.util.ArrayList;

/**
 * @author Claudio Durán
 */
public class ServiciosMaterias {

    public static Materias crearMateriaPorCurso(Curso c) {
        
        ArrayList<String> materias = new ArrayList();
        
        if (c.getCursoDivision().equals("1A") || c.getCursoDivision().equals("1B")) {
            materias.add("Formacion Etica I");
            materias.add("Historia I");
            materias.add("Fisica I");
            materias.add("Geografia I");
            materias.add("Matematicas I");
            materias.add("Artes visuales");
            materias.add("Musica I");
            materias.add("Gimnasia I");
            materias.add("Taller I");
          
        }
        if (c.getCursoDivision().equals("2A") || c.getCursoDivision().equals("2B")) {
            materias.add("Formacion Etica II");
            materias.add("Historia II");
            materias.add("Fisica II");
            materias.add("Geografia II");
            materias.add("Matematicas II");
            materias.add("Biología");
            materias.add("Musica II");
            materias.add("Teatro");
            materias.add("Gimnasia II");
            materias.add("Taller II");
           
        }
        if (c.getCursoDivision().equals("3A") || c.getCursoDivision().equals("3B")) {
            materias.add("Formacion Cristiana");
            materias.add("Historia III");
            materias.add("Química");
            materias.add("Economía I");
            materias.add("Matematicas III");
            materias.add("Informática I");
            materias.add("Comunicación I");
            materias.add("Gimnasia III");
            materias.add("Taller de Radio");
        
        }

        if (c.getCursoDivision().equals("4A") || c.getCursoDivision().equals("4B")) {
            materias.add("Antropología Cristiana");
            materias.add("Trabajo y Sociedad");
            materias.add("Derecho I");
            materias.add("Economía II");
            materias.add("Algebra");
            materias.add("Informática II");
            materias.add("Comunicación II");
            materias.add("Gimnasia IV");
            materias.add("Taller de Televisión");
   
        }
        
        if (c.getCursoDivision().equals("5A") || c.getCursoDivision().equals("5B")) {
            materias.add("Doctrina social y laboral");
            materias.add("Formacion para el trabajo");
            materias.add("Derecho II");
            materias.add("Practica laboral");
            materias.add("Análisis matemático");
            materias.add("Informática III");
            materias.add("Comunicación III");
            materias.add("Gimnasia V");
            materias.add("Taller ESI");
        
        }
        Materias m = new Materias(materias);
        c.setMaterias(m);
        return c.getMaterias();
    }
}
