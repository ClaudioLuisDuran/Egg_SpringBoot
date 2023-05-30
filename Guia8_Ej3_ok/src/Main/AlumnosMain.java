
package Main;
import Entidades.Alumno;
import ServicioOK.ServicioAlumno;
import java.util.ArrayList;
/**
  * @author Claudio Durán
 */
public class AlumnosMain {

    public static void main(String[] args) {

      ServicioAlumno sa = new ServicioAlumno();
      ArrayList <Alumno> ListadoAlumnos = new ArrayList(sa.creaAlumnos());
      System.out.println(sa.notaFinal(ListadoAlumnos));
    }
}
