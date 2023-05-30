package Entidades;

import java.util.ArrayList;

/**
 *
 * @author ClaudioDuran
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private String email;
    private String domicilio;
    private String telefono;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Poliza> polizas;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String DNI, String email, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente(ArrayList<Vehiculo> vehiculos, ArrayList<Poliza> polizas) {
        this.vehiculos = vehiculos;
        this.polizas = polizas;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", email=" + email + ", domicilio=" + domicilio + ", telefono=" + telefono + ", vehiculos=" + vehiculos + ", polizas=" + polizas + '}';
    }
    
    
    
}
