package Entidades;

import java.util.ArrayList;

/**
 * @author ClaudioDuran
 */
public class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int cantPersXofice;
    private ArrayList<Piso> pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersXofice, ArrayList<Piso> pisos, int ancho, int alto, int largo, String nombre) {
        super(ancho, alto, largo, nombre);
        this.numOficinas = numOficinas;
        this.cantPersXofice = cantPersXofice;
        this.pisos = pisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersXofice() {
        return cantPersXofice;
    }

    public void setCantPersXofice(int cantPersXofice) {
        this.cantPersXofice = cantPersXofice;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    @Override
    public void calcularSuperficie() {
        int superficie = this.getAncho() * this.getLargo() * this.getPisos().size();
        System.out.println("Superficie: " + superficie + " mts.2.");
    }

    @Override
    public void calcularVolumen() {
        int volumen = this.getAlto() * this.getAncho() * this.getLargo();
        System.out.println(" Volumen: " + volumen + " mts.3.");
    }

}
