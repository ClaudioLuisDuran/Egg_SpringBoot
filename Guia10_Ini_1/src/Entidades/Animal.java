/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ClaudioDuran
 */
public class Animal {
    protected String nombre;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void hacerRuido(){
        System.out.println("Animal "+this.nombre+" dice 'Hola'");
    }

}
