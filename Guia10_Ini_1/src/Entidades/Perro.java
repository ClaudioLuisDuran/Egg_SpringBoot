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
      public class Perro extends Animal {
        private String sexo;

    public Perro() {
    }


    public Perro(String sexo, String nombre) {
        super(nombre);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    @Override
    public void hacerRuido(){
        System.out.println("Gato "+this.getNombre()+" dice 'Miau'");
    }
}
