/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Claudio Durán
 */
public class Circunferencia {
    
    private Double radio;

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}
