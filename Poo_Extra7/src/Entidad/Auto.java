/*
 Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),

 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author Claudio Durán
 */
public class Auto {
    
    private String nombre;
    private String vencimiento;
    private String color;
    private String marca;
    private int modelo;
    private int kms;

    public Auto() {
        this.kms = 7500;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public Auto(String nombre, String vencimiento, String color, String marca, int modelo, int kms) {
        this.nombre = nombre;
        this.vencimiento = vencimiento;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }
    
}
