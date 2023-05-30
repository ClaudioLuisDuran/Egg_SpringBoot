/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
 
public class Ventana {
 
    public Ventana(){
     
            JFrame ventana = new JFrame();
            JPanel panel = new JPanel();
            JLabel etiqueta = new JLabel();
            
    //asigna valor a etiqueta
        etiqueta.setText("Hola mundo.");
        //agrega la etiqueta al panel
        panel.add(etiqueta);
        //agrega panel a la ventana
          ventana.add(panel);
          //ajusta el tamaño de la ventana al minimo necesario
          ventana.pack();
          ventana.setLocation(500, 500);
          //asigna valor de visibilidad de la ventana a Verdadero
          ventana.setVisible(true);
            }
    
  public static void main(String[] args) {        
        
        
        new Ventana();
        
        
        
}
}