/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author ClaudioDuran
 */
public class Cuota {
    private int numeroCuota;
    private int montoCuota;
    private boolean pagada;
    private Date vencimiento;

    public Cuota() {
    }

    public Cuota(int numeroCuota, int montoCuota, boolean pagada, Date vencimiento) {
        this.numeroCuota = numeroCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.vencimiento = vencimiento;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
    
    
}
