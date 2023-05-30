/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ClaudioDuran
 */
public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Animal> listado = new ArrayList();
        //crear Animal
        Animal a = new Animal();
        System.out.println("Ingrese el nombre del Animal:");
        a.setNombre(leer.next());
        //crear gato
        System.out.println("Ingrese el sexo (macho/hembra)  y luego el nombre del Gato:");
        Animal b = new Gato(leer.next(), leer.next());
        //crear perro
        System.out.println("Ingrese el sexo (macho/hembra)  y luego el nombre del Perro:");
        Animal c = new Perro(leer.next(), leer.next());

        listado.add(a);
        listado.add(b);
        listado.add(c);
       
        for (Animal animal : listado) {
            System.out.println("Animal "+animal.getNombre()+"... ");
            animal.hacerRuido();
        }
        
    }
    
}
