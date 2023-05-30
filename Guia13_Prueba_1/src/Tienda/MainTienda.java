package Tienda;

import Tienda.servicios.ServiciosTienda;

/**
 * @author ClaudioDuran
 */
public class MainTienda {

    public static void main(String[] args) throws Exception {

        ServiciosTienda St = new ServiciosTienda();
        St.Menu();
    }
}
