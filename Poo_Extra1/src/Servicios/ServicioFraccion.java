/*
 * Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver. 
 */
package Servicios;

import Entidades.Fraccion;

/**
 * @author Claudio Durán
 */
public class ServicioFraccion {

    public Fraccion sumaFracciones(Fraccion f1) {
        Fraccion resultado = new Fraccion();

        if (f1.getDenom1() == f1.getDenom2()) {
            resultado.setDenom1(f1.getDenom1());
            resultado.setNumer1(f1.getNumer1() + f1.getNumer2());
        } else {
            resultado.setNumer1((f1.getNumer1() * f1.getDenom2()) + (f1.getNumer2() * f1.getDenom1()));
            resultado.setDenom1(f1.getDenom1() * f1.getDenom2());
        }
        return resultado;
    }

    public Fraccion restaFracciones(Fraccion f1) {
        Fraccion resultado = new Fraccion();

        if (f1.getDenom1() == f1.getDenom2()) {
            resultado.setDenom1(f1.getDenom1());
            resultado.setNumer1(f1.getNumer1() - f1.getNumer2());
        } else {
            resultado.setNumer1((f1.getNumer1() * f1.getDenom2()) - (f1.getNumer2() * f1.getDenom1()));
            resultado.setDenom1(f1.getDenom1() * f1.getDenom2());
        }
        return resultado;
    }

    public Fraccion multiplicaFracciones(Fraccion f1) {
        Fraccion resultado = new Fraccion();

        resultado.setNumer1(f1.getNumer1() * f1.getNumer2());
        resultado.setDenom1(f1.getDenom1() * f1.getDenom2());

        return resultado;
    }

    public Fraccion divideFracciones(Fraccion f1) {
        Fraccion resultado = new Fraccion();

        resultado.setNumer1(f1.getNumer1() * f1.getDenom2());
        resultado.setDenom1(f1.getDenom1() * f1.getNumer2());

        return resultado;
    }
}
