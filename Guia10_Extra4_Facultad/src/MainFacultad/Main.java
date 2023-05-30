
package MainFacultad;

import Entidades.Celador;
import Entidades.Estudiante;
import Entidades.Profesor;

/**
 * @author ClaudioDuran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Celador c1 = new Celador();
        Estudiante e1 = new Estudiante();
        Profesor p1 = new Profesor();
       
      c1.crearCelador();
      c1.mostrarCelador();
      e1.crearEstudiante();
      e1.mostrarEstudiante();
      p1.crearProfesor();
      p1.mostrarProfesor();
      
      c1.cambiarEstadoCivil();
      e1.cambiarEstadoCivil();
      p1.cambiarEstadoCivil();
      
      c1.reasignarSeccion();
      e1.reasignarCurso();
      p1.reasignarArea();
      
      c1.mostrarCelador();
      e1.mostrarEstudiante();
      p1.mostrarProfesor();
      
      
     
        
        
        
    }
    
}
