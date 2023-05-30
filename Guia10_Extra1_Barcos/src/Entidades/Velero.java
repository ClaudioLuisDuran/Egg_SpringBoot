package Entidades;

/**
 * @author ClaudioDuran
 */
public final class Velero extends Barco {

    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, int eslora, int modelo) {
        super(matricula, eslora, modelo);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public void cargarBarco() {

        System.out.println("Datos de su Velero");
        System.out.print("Matricula: ");
        this.setMatricula(leer.next());
        System.out.print("Eslora (en mts.): ");
        this.setEslora(leer.nextInt());
        System.out.print("Modelo u año de fabrcación: ");
        this.setModelo(leer.nextInt());
        System.out.print("Nº de mástiles: ");
        this.setMastiles(leer.nextInt());
        this.mostrarBarco();
    }

    public int calcularPrecio(int dias, Velero b) {
        int modulo = dias * b.getEslora() * 10;
        int precioFinal = modulo + b.getMastiles();
        return precioFinal;
    }

    @Override
    public void mostrarBarco() {
        super.mostrarBarco();
        System.out.println("Mástiles: " + this.getMastiles());
    }
}
