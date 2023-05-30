/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.Interface1;

/**
 *
 * @author ClaudioDuran
 */
class Impl implements Interface1 {
    
@Override
public  double perimetro(){
    double perim;
    double diam = 4;
    perim = PI + diam;
    return perim;
}

    @Override
   public void metInter1(){
        System.out.println("Ver que sapa....");
   }
   
   
   @Override
   public int sumar(){
       
       int a = 0,b = 0;
       int suma;
       suma = a + b;
        return suma;
   }
    
}
