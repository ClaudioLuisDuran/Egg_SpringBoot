/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.TipoVehiculo;

/**
 *
 * @author ClaudioDuran
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String Motor;
    private String chasis;
    private String color;
    private TipoVehiculo tipo;
    private Cliente propietario;
    private Poliza poliza;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String Motor, String chasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.Motor = Motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public Vehiculo(Cliente propietario, Poliza poliza) {
        this.propietario = propietario;
        this.poliza = poliza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }
    
    
    
}
