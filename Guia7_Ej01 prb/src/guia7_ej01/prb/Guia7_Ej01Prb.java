/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ej01.prb;

import Servicios.PersonaService;
import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class Guia7_Ej01Prb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService Ps = new PersonaService();
        Persona alumno1 = Ps.crearPersona();
                
         System.out.println(alumno1.toString());
    }
     
    
}
