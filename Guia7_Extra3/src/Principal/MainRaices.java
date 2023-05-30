/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


import Entidades.Raices;
import Servicios.ServicioRaiz;

public class MainRaices {

    public static void main(String[] args) {
        ServicioRaiz Sr = new ServicioRaiz();
        Raices r1 = new Raices(0, 0, 0);
        System.out.println("El discriminante es: " + Sr.getDiscriminante(r1));
        System.out.print("¿Tiene raices? >>");
        if(Sr.tieneRaices(r1)==true){
            System.out.println(" Si tiene raices.");
        }else{
            System.out.println(" No tiene raices.");
        }
        Sr.obtenerRaices(r1);
    }
    
}