/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;

/**
 *
 * @author Claudio Durán
 */
public class CircunferenciaServicio {

    public Circunferencia crearCircunferencia(Double r) {

        Circunferencia circ = new Circunferencia(r);
        circ.setRadio(r);

        return circ;
    }

    public Double area(Double r) {

        Double Pi;
        Pi = Math.PI;
        Double area = Pi * r * r;

        return area;
    }

    public Double perimetro(Double r) {

        Double Pi;
        Pi = Math.PI;
        Double perimetro = 2 * Pi * r;

        return perimetro;
    }
    
}
