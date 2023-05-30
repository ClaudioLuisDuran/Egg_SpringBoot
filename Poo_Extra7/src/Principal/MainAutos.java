
package Principal;

import Entidad.Auto;
import Servicios.ServiciosAuto;
/**
 * @author Claudio Durán
 */
public class MainAutos {

    public static void main(String[] args) {

        ServiciosAuto Sa = new ServiciosAuto();
        Auto auto = new Auto();
        Sa.menu(auto);

    }
}
