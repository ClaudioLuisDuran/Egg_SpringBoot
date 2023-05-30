/*
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción).  */
package Entidades;
/**
 * @author Claudio Durán
 */
public class Fraccion {
    
    private int denom1, denom2;
    private int numer1, numer2;

    public Fraccion() {
    }

    public Fraccion(int denom1, int denom2, int numer1, int numer2) {
        this.denom1 = denom1;
        this.denom2 = denom2;
        this.numer1 = numer1;
        this.numer2 = numer2;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int denom1) {
        this.denom1 = denom1;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int denom2) {
        this.denom2 = denom2;
    }

    public int getNumer1() {
        return numer1;
    }

    public void setNumer1(int numer1) {
        this.numer1 = numer1;
    }

    public int getNumer2() {
        return numer2;
    }

    public void setNumer2(int numer2) {
        this.numer2 = numer2;
    }
    
    
    
}
