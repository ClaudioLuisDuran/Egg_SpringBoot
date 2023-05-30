package Entidades;

/**
 * @author ClaudioDuran
 */
public final class Yate extends BarcoMotor {

    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int potencia, String matricula, int eslora, int modelo) {
        super(potencia, matricula, eslora, modelo);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        System.out.print("Potencia (en CV): ");
        this.setPotencia(leer.nextInt());
        System.out.print("Nº de camarotes: ");
        this.setCamarotes(leer.nextInt());
        this.mostrarBarco();
    }

    public int calcularPrecio(int dias, Yate b) {
        int modulo = dias * b.getEslora() * 10;
        int precioFinal = modulo + b.getPotencia() + b.getCamarotes();
        return precioFinal;
    }

    @Override
    public void mostrarBarco() {
        System.out.println("Datos de Yate");
        super.mostrarBarco();
        System.out.println("Potencia: " + this.getPotencia());
        System.out.println("Camarotes: " + this.getCamarotes());
    }
}
