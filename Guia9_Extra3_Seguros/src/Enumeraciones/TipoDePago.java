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
public enum TipoDePago {
    
    EFECTIVO("Efectivo", 1), DEBITO("Debito", 2), CREDITO("Credito",3), TRANSFERENCIA("Transferencia", 4), RAPIFACIL("Rapipago/Pagofacil",5);
    
    private String nombreTipoPago;
    private int numeroTipoPago;

    private TipoDePago() {
    }

    private TipoDePago(String nombreTipoPago, int numeroTipoPago) {
        this.nombreTipoPago = nombreTipoPago;
        this.numeroTipoPago = numeroTipoPago;
    }

    public String getNombreTipoPago() {
        return nombreTipoPago;
    }

    public int getNumeroTipoPago() {
        return numeroTipoPago;
    }

    
}
