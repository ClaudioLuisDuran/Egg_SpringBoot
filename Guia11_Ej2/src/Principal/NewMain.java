/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author ClaudioDuran
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int [] Lista = new int [5];
        
        for (int i = 0; i < 5; i++) {
            Lista[i] = i;
        }
        
       try{
           for (int i = 0; i < 10; i++) {
               System.out.println("Pos "+i+" : ["+Lista[i]+"]");
           }
           
       }catch (ArrayIndexOutOfBoundsException a){
           System.out.println("Esa posición no existe en la lista.");
       }
        
        
        
    }
    
}
