
package Entidades;

import java.util.Scanner;
/**
 * @author ClaudioDuran
 */
public abstract class Barco {

    protected String matricula;
    protected int eslora;
    protected int modelo;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(String matricula, int eslora, int modelo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

public abstract void cargarBarco();
    
    public void mostrarBarco(){
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Eslora: "+this.getEslora());
        System.out.println("Modelo: "+this.getModelo());
    }
}
