package Enumeraciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ClaudioDuran
 */
public enum TipoVehiculo {
    
    CAMIONETA("Camioneta",1), SEDAN("Sedan",2), UTILITARIO("Utilitario",3), DOBLETRACCION("4x4",4), CAMION("Camion",5), MOTO("Moto",6), CUATRICICLO("Cuatriciclo",7), UTV("Arenero",8);
    
    private String nombre;
    private int numeroTipo;

    private TipoVehiculo() {
    }

    private TipoVehiculo(String nombre, int numeroTipo) {
        this.nombre = nombre;
        this.numeroTipo = numeroTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTipo() {
        return numeroTipo;
    }
}
