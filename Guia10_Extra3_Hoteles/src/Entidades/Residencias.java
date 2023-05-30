package Entidades;

import java.util.Scanner;

public final class Residencias extends AlojamientoEH {

    private int habitaciones;

    private boolean descuentos;

    private boolean campoDeportes;

    public Residencias() {
    }

    public Residencias(int habitaciones, boolean descuentos, boolean campoDeportes, boolean privado, Double superficie) {
        super(privado, superficie);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDeportes = campoDeportes;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportes() {
        return campoDeportes;
    }

    public void setCampoDeportes(boolean campoDeportes) {
        this.campoDeportes = campoDeportes;
    }
    
     public void crearResidencias(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Carga de nuevo complejo de residencias vacacionales");
        System.out.println("El complejo ¿es privado (1) o abierto a todo público (2)?");
        int opc=leer.nextInt();
        do{
            switch (opc) {
                case 1:
                    this.setPrivado(true);
                    break;
                case 2:
                    this.setPrivado(false);
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta (1 o 2)");
                    break;
            }
        }while(opc!=1&&opc!=2);
        System.out.print("Ingrese la superficie total del complejo de residencias en kms.2: ");
        this.setSuperficie(leer.nextDouble());
        System.out.print("Ingrese la cantidad máxima de habitaciones que posee: ");
        this.setHabitaciones(leer.nextInt());
       
        System.out.print("El complejo ¿Tiene descuentos para Gremios o Sindicatos? (S/N): ");
        boolean ok;
        String opc2;
        do{
            opc2=leer.next();
            if (opc2.equalsIgnoreCase("S")) {
                this.setDescuentos(true);
                ok= true;
            }else if(opc2.equalsIgnoreCase("N")){
                this.setDescuentos(false);
                ok = true;
            }else{
                System.out.println("La opción ingresada es icnorrecta (S/N)");
                ok = false;
            }
        }while(!ok);
        
                System.out.print("El complejo ¿Posee campo de deportes? (S/N): ");
     
        do{
            opc2=leer.next();
             if (opc2.equalsIgnoreCase("S")) {
            this.setCampoDeportes(true);
                ok= true;
            }else if(opc2.equalsIgnoreCase("N")){
                this.setCampoDeportes(false);
                ok = true;
            }else{
                System.out.println("La opción ingresada es icnorrecta (S/N)");
                ok = false;
            }
        }while(!ok);
    }
   
    
    public void mostrarCamping(){
        System.out.println("----- Complejo de Residencias Vacacionales ------");
        System.out.println("       * Acceso: ");
        if (this.isPrivado()==true) {
            System.out.print("Privado (Sólo para socios o acompañando a socio).");
        }else{
            System.out.print("Abierto al público en general.");
        }
        System.out.println("       * Superficie total del complejo: "+this.getSuperficie()+" Kms2.");
        System.out.println("       * Cantidad de habitaciones disponibles: "+this.getHabitaciones()+" habitaciones.");
        if (this.isDescuentos()==true) {
            System.out.println("       * Descuentos especiales para gremios o Sindicatos..");
        }else{
            System.out.println("       * No posee promociones para Gremios o Sindicatos.");
        }
                if (this.isCampoDeportes()==true) {
            System.out.println("       * Posee Campo de Deportes para distintas actividades.");
        }else{
            System.out.println("       * No posee Campo de Deportes.");
        }
    }
    
}
