package Entidades;

/**
 * @author ClaudioDuran
 */
public class Piso {

    private int numeroPiso;
    private int oficinas;
    private int alturaPiso;

    public Piso() {
    }

    public Piso(int numeroPiso, int oficinas, int alturaPiso) {
        this.numeroPiso = numeroPiso;
        this.oficinas = oficinas;
        this.alturaPiso = 3;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getAlturaPiso() {
        return alturaPiso;
    }

    public void setAlturaPiso(int alturaPiso) {
        this.alturaPiso = alturaPiso;
    }

}
