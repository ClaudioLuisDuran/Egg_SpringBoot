/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:

a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes

 */
package Entidades;

public class Cuenta {
    
    private int CuentaNro;
    private String Apellido;
    private long DNI;
    private int Saldo;

    public Cuenta() {
    }

    public Cuenta(int CuentaNro, String Apellido, long DNI, int Saldo) {
        this.CuentaNro = CuentaNro;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Saldo = Saldo;
    }

    public int getCuentaNro() {
        return CuentaNro;
    }

    public String getApellido() {
        return Apellido;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setCuentaNro(int CuentaNro) {
        this.CuentaNro = CuentaNro;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "CuentaNro=" + CuentaNro + ", Apellido=" + Apellido + ", DNI=" + DNI + ", Saldo=" + Saldo + '}';
    }
    
    
    
}
