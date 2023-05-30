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
public enum FormaPago {
    
    ANUAL("Anual",1), SEMESTRAL("Semestral",2), TRIMESTRAL("Trimestral",3), MENSUAL("Mensual",4);
    
    private String nombre;
    private int tnumeroTipo;

    private FormaPago() {
    }

    private FormaPago(String nombre, int tnumeroTipo) {
        this.nombre = nombre;
        this.tnumeroTipo = tnumeroTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTnumeroTipo() {
        return tnumeroTipo;
    }

}
