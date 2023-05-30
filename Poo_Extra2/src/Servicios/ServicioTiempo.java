/*
 * y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package Servicios;

import Entidades.Tiempo;

/**
 * @author Claudio Durán
 */
public class ServicioTiempo {

    //imprimir la hora ingresada
    public void imprimirHora(Tiempo t) {
        int hora, minutos, segundos;
        System.out.println("La hora ingresada es: " + t.getHora() + ":" + t.getMinutos() + ":" + t.getSegundos() + ".");
    }

    //validar horas
    public boolean validarHora(int h) {
        boolean ok = false;
        if (h >= 0 && h <= 23) {
            ok = true;
        }else{
            System.out.println("El valor está fuera de rango (0-23).");
        }
        return ok;
    }
    
    //validar minutos o segundos
    public boolean validarMinSec(int m) {
        boolean ok = false;
        if (m >= 0 && m <= 59) {
            ok = true;
        }else{
            System.out.println("El valor está fuera de rango (0-59).");
        }
        return ok;
    }


}
