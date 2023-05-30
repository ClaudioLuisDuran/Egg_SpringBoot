/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencias;
import java.util.ArrayList;

/**
 *
 * @author ClaudioDuran
 */
public class MainHoteles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Hotel> listado = new ArrayList<>();
        
        Hotel4 h4a=new Hotel4();
        h4a.crearHotel();
        listado.add(h4a);
        h4a.mostrarHotel();
        Hotel4 h4b=new Hotel4();
        h4b.crearHotel();
        listado.add(h4b);
        h4b.mostrarHotel();
        
        Hotel5 h5a = new Hotel5();
        h5a.crearHotel();
        listado.add(h5a);
        h5a.mostrarHotel();
        Hotel5 h5b = new Hotel5();
        h5b.crearHotel();
        listado.add(h5b);
        h5b.mostrarHotel();
        
        
        listado.sort(Hotel.compararPrecio);
        for (Hotel hotel : listado) {
                hotel.mostrarHotel();           
        }
        
        Camping c1 = new Camping();
        Residencias r1 = new Residencias();
        c1.crearCamping();
        c1.mostrarCamping();
        r1.crearResidencias();
        r1.mostrarCamping();
        
        
        
    }
    
}
