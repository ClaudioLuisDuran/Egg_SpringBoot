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
public final class Rectangulo extends Formas implements calculoFormas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int base;
    private int altura;
    
    public Rectangulo() {
    }
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(Formas c) {
        int area;
        area = this.getBase() * this.getAltura();
        System.out.println("El area del rectángulo es " + area);
    }
    
    @Override
    public void calcularPerimetro(Formas c) {
        int perimetro;
        perimetro = 2 * this.getBase() + 2 * this.getAltura();
        System.out.println("El perímetro del rectángulo es " + perimetro);
    }
    
    @Override
    public void ingresarDatos() {
        System.out.println("RECTANGULO");
        System.out.println("Ingrese la base del rectangulo:");
        this.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo:");
        this.setAltura(leer.nextInt());
    }
    
}
