/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author ClaudioDuran
 */
public enum TipoPolideportivo {
    
    TECHADO("Techado"),ABIERTO("Abierto");
    
    public String tipo;

    private TipoPolideportivo() {
    }

    private TipoPolideportivo(String tipo) {
        this.tipo = tipo;
    }
    
    public static TipoPolideportivo getTECHADO() {
        return TECHADO;
    }

    public static TipoPolideportivo getABIERTO() {
        return ABIERTO;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
}
