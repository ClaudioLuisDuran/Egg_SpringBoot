package Principal;

import Entidades.Persona;
import Entidades.DNI;
import Enumeraciones.Sexo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudio Durán
 */
public class MainPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona();
        System.out.println("Ingrese nombre:");
        p.setNombre(leer.next());
        System.out.println("ingrese apellido:");
        p.setApellido(leer.next());
        System.out.println("Sexo? (V/M)");
        String sex = leer.next();
       
            if (sex.equalsIgnoreCase("v")){
                p.setSexo(Sexo.VARON);
            }else{
                    p.setSexo(Sexo.MUJER);
                    }
        
        DNI dni = new DNI();
        
        System.out.println("Ingrese tipo de documento (RUT/DNI/PASS)");
        dni.setSerie(leer.next());
        System.out.println("Ingrese el número de "+dni.getSerie()+":");
        dni.setNumero(leer.nextInt());
        p.setDni(dni);
        Persona clon = new Persona(p.getNombre(), p.getApellido(), dni);
        clon.setSexo(p.getSexo());
        System.out.println("");
        System.out.println("Persona cargada:");
        System.out.println(p.getApellido()+", "+p.getNombre()+". \n"
                + "Sexo: "+p.getSexo()+"\n"
                        + "Documento: "+p.getDni().getSerie()+" "+p.getDni().getNumero()+".");
        System.out.println("Datos del clon: ");
         System.out.println(clon.getApellido()+", "+clon.getNombre()+". \n"
                + "Sexo: "+clon.getSexo()+"\n"
                        + "Documento: "+clon.getDni().getSerie()+" "+clon.getDni().getNumero()+".");
    }
    
}
