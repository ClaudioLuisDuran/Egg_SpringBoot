
package Entidades;
/**
 * @author Claudio Durán
 */
public class Triangulo {
    
    private int base;
    private int altura;
    private double area;
    private int perimetro;
    private double lado;

    public Triangulo() {
    }

    public Triangulo(int base, int altura, double area, int perimetro, double lado) {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    
    
}
