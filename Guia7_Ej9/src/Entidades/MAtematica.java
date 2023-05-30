/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. 
La clase deber tener un
constructor vacío, parametrizado y get y set. 


 */
package Entidades;

/**
 *
 * @author Claudio Durán
 */
public class MAtematica {
    private int num1;
    private int num2;

    public MAtematica() {
    }

    public MAtematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
