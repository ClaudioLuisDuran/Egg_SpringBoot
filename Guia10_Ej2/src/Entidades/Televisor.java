
package Entidades;

/*
 * @author ClaudioDuran
 */
public class Televisor extends Electrodomestico{
    
    private int resolucion;
    private boolean TDT;
    
    
 
    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int resolucion, boolean TDT, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
         return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
       

    
    public Televisor crearTelevisor(){
        
        Televisor tv = new Televisor();
        tv.crearElectrodomestico();
        System.out.println("Ingrese el tamaño en pulgadas:");
        String opc;
        tv.setResolucion(leer.nextInt());
         do{
        System.out.println("Tiene servicio de TDT? (S/N)");
        opc = leer.next();
       
            if (opc.equalsIgnoreCase("s")) {
                tv.setTDT(true);
            }else{
                tv.setTDT(false);
            }
        }while(!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n"));
        return tv;
    }
    

      public Televisor precioFinalTV(Televisor e){

            int precioNuev = e.precioFinal(e);
            
        if (this.getResolucion()>40) {
            precioNuev = precioNuev + (precioNuev * 30/100);
        }
        
        if (this.isTDT()==true) {
            precioNuev = precioNuev + 500;
        }
        e.setPrecio(precioNuev);
        return e;
    }
    
          public void mostrarTV(Televisor e){
        System.out.println("Datos de la TV: ");
          e.mostrarElectrodomestico(e);
          System.out.println("Tamaño de pantalla: "+e.getResolucion());
              System.out.print("¿Posee TDT?");
              if (e.isTDT()==true) {
                  System.out.println(" Si posee TDT.");
              }else{
                  System.out.println(" No posee TDT.");
              }
          
    }
  
    
}         
