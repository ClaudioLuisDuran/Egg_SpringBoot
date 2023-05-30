package Entidades;

import Enums.TipoPolideportivo;

/**
 * @author ClaudioDuran
 */
public class Polideportivo extends Edificio {

    private TipoPolideportivo tipo;

    public Polideportivo() {
    }

    public Polideportivo(TipoPolideportivo tipo) {
        this.tipo = tipo;
    }

    public Polideportivo(TipoPolideportivo tipo, int ancho, int alto, int largo, String nombre) {
        super(ancho, alto, largo, nombre);
        this.tipo = tipo;
    }

    public TipoPolideportivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoPolideportivo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calcularSuperficie() {
        int superficie = this.getAncho() * this.getLargo();
        System.out.println("Superficie: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        int volumen = this.getAlto() * this.getAncho() * this.getLargo();
        System.out.println(" Voumen: " + volumen);
    }
}
