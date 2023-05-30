

package Main;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author Claudio Durán
 */
public class MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Rectangulo rect1 = new Rectangulo();
        RectanguloServicio Rs = new RectanguloServicio();
        rect1 = Rs.CargarRectangulo();
        Rs.CalculaSuperficie(rect1);
        Rs.CalculaPerimetro(rect1);
        Rs.DibujarRectangulo(rect1);

    }
    
}
