/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author ClaudioDuran
 */
public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal perro1 = new Perro("Stich", "carne", 15, "Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy", "croquetas", 16, "Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "galletas", 7, "Siamés");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "pasto", 25, "Fino"); 
        caballo1.Alimentarse();
        
        
        
    }
    
}
