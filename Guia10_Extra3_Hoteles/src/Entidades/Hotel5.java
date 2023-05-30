package Entidades;

import java.util.Comparator;
import java.util.Scanner;

public final class Hotel5 extends Hotel4 {

    private int salonesConf;

    private int suites;

    private int limosinas;

    public Hotel5() {
    }

    public Hotel5(int salonesConf, int suites, int limosinas, Gimnasio gimnasio, String nombreResto, int capaciddResto, int habitaciones, int camas, int pisos, int precioHab) {
        super(gimnasio, nombreResto, capaciddResto, habitaciones, camas, pisos, precioHab);
        this.salonesConf = salonesConf;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public int getSalonesConf() {
        return salonesConf;
    }

    public void setSalonesConf(int salonesConf) {
        this.salonesConf = salonesConf;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
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
        
        this.setPrecioHab(50+this.getCamas()+VAR+VARGim+(15*this.limosinas));
    }
    
    
    @Override
     public void crearHotel(){
         System.out.println("");
         super.crearHotel();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Carga de Hotel 4 estrellas");
//        System.out.print("Ingrese el número total de habitaciones: ");
//        this.setHabitaciones(leer.nextInt());
//        System.out.print("Ingrese el número total de camas: ");
//        this.setCamas(leer.nextInt());
//        System.out.print("Ingrese el número de pisos del hotel: ");
//        this.setPisos(leer.nextInt());
//        System.out.print("Ingrese el tipo de Gimnasio que posee (A o B): ");
//        String opc;
//        do{
//            Gimnasio g = new Gimnasio();
//            opc = leer.next();
//            if (opc.equalsIgnoreCase("A")) {
//                g.setTipo(opc.charAt(0));
//                this.setGimnasio(g);
//            }else if (opc.equalsIgnoreCase("B")){
//                g.setTipo(opc.charAt(0));
//                this.setGimnasio(g);
//            }else{
//                System.out.print("La opción ingresada no es válida (A o B)");
//            }
//        }while(!opc.equalsIgnoreCase("A") && !opc.equalsIgnoreCase("A"));
//        
//        System.out.print("Ingrese el nombre del Restaurant: ");
//        this.setNombreResto(leer.next());
//        System.out.print("Ingrese capacidad del restaurant "+this.getNombreResto()+": ");
        System.out.println("Ingrese la cantidad de Salones para Conferencias: ");
        this.setSalonesConf(leer.nextInt());
        System.out.print("Ingrese el número Suites: ");
        this.setSuites(leer.nextInt());
        System.out.print("Ingrese el número de Limosinas disponibles: ");
        this.setLimosinas(leer.nextInt());
        this.precioHotel();
    }

    @Override
    public void mostrarHotel() {
        
        System.out.println(" ***** Hotel 5 estrellas *****");
        System.out.println("      * Pisos: "+this.getPisos()+" pisos.");
        System.out.println("      * Habitaciones: "+this.getHabitaciones()+" habitaciones.");
        System.out.println("      * Total de camas: "+this.getCamas()+" camas.");
        System.out.println("      * Precio de la habitación: $"+this.getPrecioHab()+".-");
        System.out.println("      * Gimnasio tipo: "+this.getGimnasio().getTipo()+".");
        System.out.println("      * Restaurant "+this.getNombreResto()+".");
        System.out.println("      * Capacidad del restó: "+this.getCapaciddResto()+" pesonas.");
        System.out.println("      * Salones de Conferencias: "+this.getSalonesConf()+" salones.");
        System.out.println("      * Número de Suites: "+this.getSuites()+" suites.");
        System.out.println("      * Número de Limosinas disponibles: "+this.getLimosinas()+" limosinas.");
        System.out.println("********************************");
    }
    
    public static Comparator <Hotel5> compararPrecio = (Hotel5 h1, Hotel5 h2) -> {
    Integer p1 = h1.getPrecioHab();
    Integer p2 = h2.getPrecioHab();
    return (p1.compareTo(p2));
    };
    
    }
    
    
    

