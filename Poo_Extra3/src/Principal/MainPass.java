
package Principal;

import Entidades.Pass;
import Servicios.ServicioMain;

/**
 * @author Claudio Durán
 */
public class MainPass {

    public static void main(String[] args) {
        ServicioMain Sp = new ServicioMain();
        Pass usuario = new Pass();
        usuario = Sp.Usuario();
        Sp.Menu(usuario);
        String nombreOK;
        
    }
    
}
