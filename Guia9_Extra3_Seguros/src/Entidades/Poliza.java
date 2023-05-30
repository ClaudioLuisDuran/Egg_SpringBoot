/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.FormaPago;
import Enumeraciones.TipoCobertura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ClaudioDuran
 */
public class Poliza {
    
    private Vehiculo vAsegurado;
    private Cliente cAsegurado;
    private String nroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<Cuota> cuotas;
    private FormaPago formaPago;
    private int montoTotalAsegurado;
    private boolean granizo;
    private int montoGranizo;
    private TipoCobertura tipoCobertura;
    private boolean activa;

    public Poliza() {
    }

    public Poliza(Vehiculo vAsegurado, Cliente cAsegurado, String nroPoliza, Date fechaInicio, Date fechaFin, ArrayList<Cuota> cuotas, FormaPago formaPago, int montoTotalAsegurado, boolean granizo, int montoGranizo, TipoCobertura tipoCobertura, boolean activa) {
        this.vAsegurado = vAsegurado;
        this.cAsegurado = cAsegurado;
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.activa = activa;
    }



    public Vehiculo getvAsegurado() {
        return vAsegurado;
    }

    public void setvAsegurado(Vehiculo vAsegurado) {
        this.vAsegurado = vAsegurado;
    }

    public Cliente getcAsegurado() {
        return cAsegurado;
    }

    public void setcAsegurado(Cliente cAsegurado) {
        this.cAsegurado = cAsegurado;
    }

    public String getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(String nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }


    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
    
}
