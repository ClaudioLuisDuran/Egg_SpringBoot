package Entidades;

public class AlojamientoEH {

    private boolean privado;

    private double superficie;

    public AlojamientoEH() {
    }

    public AlojamientoEH(boolean privado, double superficie) {
        this.privado = privado;
        this.superficie = superficie;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    
    
}
