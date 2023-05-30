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
public final class Gato extends Animal{
    
    public Gato() {
    }

        public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
        

     
    @Override
    public void Alimentarse() {
        System.out.println("El gato "+this.nombre+", de la raza "+this.raza+" y de "+this.getEdad()+" años de edad, se alimenta con "+this.getAlimento()+".");
    }
    
}
