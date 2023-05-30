/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidad.Fecha;
import Servicio.ServicioFecha;

/**
 *
 * @author Claudio Durán
 */
public class FechaMainOK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioFecha Sf = new ServicioFecha();
        Fecha fecha = new Fecha();
        Sf.cargarFecha(fecha);
        Sf.diaPosterior(fecha);           

    }
    
    
}
