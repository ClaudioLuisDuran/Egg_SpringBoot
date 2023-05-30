/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeraciones;

/**
 *
 * @author ClaudioDuran
 */
public enum TipoCobertura {
    
    A ("Seguros de responsabilidad civil",1), B ("Terceros robo incendio y destruccion total",2), C("Terceros robo incendio total y o parcial y destruccion total",3), D("Todo riesgo",4);
    
    private String nombreCobertura;
    private int numeroTipoCobertura;

    private TipoCobertura() {
    }

    private TipoCobertura(String nombreCobertura, int numeroTipoCobertura) {
        this.nombreCobertura = nombreCobertura;
        this.numeroTipoCobertura = numeroTipoCobertura;
    }

    public String getNombreCobertura() {
        return nombreCobertura;
    }

    public int getNumeroTipoCobertura() {
        return numeroTipoCobertura;
    }


}
