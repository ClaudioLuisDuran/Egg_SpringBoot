/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Formas;

/**
 *
 * @author ClaudioDuran
 */
public interface calculoFormas {
    
    public final double PHI = 3.141592;
    
    public void calcularArea(Formas f);
    
    public void calcularPerimetro(Formas f);
    
}
