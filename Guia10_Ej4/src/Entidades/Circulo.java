/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.calculoFormas;
import java.util.Scanner;

/**
 *
 * @author ClaudioDuran
 */
public final class Circulo extends Formas implements calculoFormas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea(Formas c) {
        double area;
        area = PHI * Math.pow(this.getRadio(), 2);
        System.out.println("Area del círculo: "+area);        
    }

    @Override
    public void calcularPerimetro(Formas c) {
        double perimetro;
                perimetro = PHI * 2 * this.getRadio();
                System.out.println("El perímetro del círculo es: "+perimetro);
    }

    @Override
    public void ingresarDatos() {
         System.out.println("CIRCULO");
        System.out.println("Ingrese el radio del circulo:");
        this.setRadio(leer.nextInt());
    }
    
    
}
