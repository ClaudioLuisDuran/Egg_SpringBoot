
package Entidades;

/**
 * @author ClaudioDuran
 */
public class BarcoMotor extends Barco {
    
    protected int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String matricula, int eslora, int modelo) {
        super(matricula, eslora, modelo);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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
       this.mostrarBarco();
    }

    public int calcularPrecio(int dias, BarcoMotor b) {
        int modulo = dias * b.getEslora() * 10;        
        int precioFinal = modulo + b.getPotencia();
        return precioFinal;
    }

        @Override
    public void mostrarBarco() {
        System.out.println("Datos de Yate");
        super.mostrarBarco();
        System.out.println("Potencia: " + this.getPotencia());
     
    }
}
