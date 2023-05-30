/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ClaudioDuran
 */
public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
      
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


    public Lavadora crearLavadora(){
        
        Lavadora lav = new Lavadora();
        lav.crearElectrodomestico();
        
        System.out.println("Cuantos kgs. de carga tiene?");
        lav.setCarga(leer.nextInt());
          
        return lav;
    }
    

    public Lavadora precioFinalLavadora(Lavadora e){

//       int precioNuev = e.precioFinal(e);
int precioNuev = super.precioFinal(e);
        if (e.getCarga()>30) {
            e.setPrecio(precioNuev+super.precioFinal(e)+500);
        }
        
         return e;
    }
    

      public void mostrarLavadora(Lavadora e){
        System.out.println("Datos de la Lavadora: ");
          e.mostrarElectrodomestico(e);
          System.out.println("Carga: "+e.getCarga());
          
    }
  
}
