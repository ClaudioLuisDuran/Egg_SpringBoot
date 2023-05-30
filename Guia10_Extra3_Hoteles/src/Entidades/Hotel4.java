package Entidades;

import java.util.Comparator;
import java.util.Scanner;

public class Hotel4 extends Hotel {

    private Gimnasio gimnasio;

    private String nombreResto;

    private int capaciddResto;

    public Hotel4() {
    }

    public Hotel4(Gimnasio gimnasio, String nombreResto, int capaciddResto, int habitaciones, int camas, int pisos, Integer precioHab) {
        super(habitaciones, camas, pisos, precioHab);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capaciddResto = capaciddResto;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapaciddResto() {
        return capaciddResto;
    }

    public void setCapaciddResto(int capaciddResto) {
        this.capaciddResto = capaciddResto;
    }

    @Override
    public void precioHotel() {
        int VAR;
        int VARGim;
        if (this.getCapaciddResto()<30) {
            VAR = 10;
        }else if(this.getCapaciddResto()>=30&&this.getCapaciddResto()<=50){
            VAR = 30;
        }else{
            VAR = 50;
        }
        
        if (this.getGimnasio().getTipo()=='A') {
            VARGim = 50;
        }else{
            VARGim = 30;
        }
        
        this.setPrecioHab(50+this.getCamas()+VAR+VARGim);
    }
    
    public void crearHotel(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        if (this instanceof Hotel5) {
            System.out.println("Carga de Hotel 5 estrellas");
        }else{
            System.out.println("Carga de Hotel 4 estrellas");
        }
        System.out.print("Ingrese el número total de habitaciones: ");
        this.setHabitaciones(leer.nextInt());
        System.out.print("Ingrese el número total de camas: ");
        this.setCamas(leer.nextInt());
        System.out.print("Ingrese el número de pisos del hotel: ");
        this.setPisos(leer.nextInt());
        System.out.print("Ingrese el tipo de Gimnasio que posee (A o B): ");
        String opc;
        do{
            Gimnasio g = new Gimnasio();
            opc = leer.next();
            if (opc.equalsIgnoreCase("A")) {
                g.setTipo('A');
                this.setGimnasio(g);
            }else if (opc.equalsIgnoreCase("B")){
                g.setTipo('B');
                this.setGimnasio(g);
            }else{
                System.out.print("La opción ingresada no es válida (A o B)");
            }
        }while(!opc.equalsIgnoreCase("A") && !opc.equalsIgnoreCase("A"));
        
        System.out.print("Ingrese el nombre del Restaurant: ");
        this.setNombreResto(leer.next());
        System.out.print("Ingrese capacidad del restaurant "+this.getNombreResto()+": ");
        this.setCapaciddResto(leer.nextInt());
          if (this instanceof Hotel4) {
        this.precioHotel();
         }
    }

    @Override
    public void mostrarHotel() {
        
        System.out.println(" **** Hotel 4 estrellas ****");
        System.out.println("      * Pisos: "+this.getPisos()+" pisos.");
        System.out.println("      * Habitaciones: "+this.getHabitaciones()+" habitaciones.");
        System.out.println("      * Total de camas: "+this.getCamas()+" camas.");
        System.out.println("      * Precio de la habitación: $"+this.getPrecioHab()+".-");
        System.out.println("      * Gimnasio tipo: "+this.getGimnasio().getTipo()+".");
        System.out.println("      * Restaurant "+this.getNombreResto()+".");
        System.out.println("      * Capacidad del restó: "+this.getCapaciddResto()+" pesonas.");
        System.out.println("********************************");
    }



}
