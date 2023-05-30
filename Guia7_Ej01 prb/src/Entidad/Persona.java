/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Claudio Durán
 */
public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private Date nacimiento;

    public Persona(String nombre, int edad, int dni, Date nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.nacimiento = nacimiento;
        
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", nacimiento=" + nacimiento + '}';
    }
    
    
    

}
