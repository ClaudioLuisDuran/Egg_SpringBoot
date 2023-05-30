package Entidades;

import java.util.Scanner;

public class Camping extends AlojamientoEH {

    private int carpasMax;

    private int sanitarios;

    private boolean Restaurant;

    public Camping() {
    }

    public Camping(int carpasMax, int sanitarios, boolean Restaurant, boolean privado, Double superficie) {
        super(privado, superficie);
        this.carpasMax = carpasMax;
        this.sanitarios = sanitarios;
        this.Restaurant = Restaurant;
    }

    public int getCarpasMax() {
        return carpasMax;
    }

    public void setCarpasMax(int carpasMax) {
        this.carpasMax = carpasMax;
    }

    public int getSanitarios() {
        return sanitarios;
    }

    public void setSanitarios(int sanitarios) {
        this.sanitarios = sanitarios;
    }

    public boolean isRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(boolean Restaurant) {
        this.Restaurant = Restaurant;
    }
    
    public void crearCamping(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Carga de nuevo Camping");
        System.out.println("El camping ¿es privado (1) o abierto a todo público (2)?");
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
        System.out.print("Ingrese la superficie total del Camping en kms.2: ");
        this.setSuperficie(leer.nextDouble());
        System.out.print("Ingrese la capacidad máxima de carpas que admite: ");
        this.setCarpasMax(leer.nextInt());
        System.out.print("Ingrese la cantidad de baños instalados que posee: ");
        this.setSanitarios(leer.nextInt());
        System.out.print("El camping ¿Posee Restaurant? (S/N): ");
        boolean ok;
        String opc2;
        do{
            opc2=leer.next();
            if (opc2.equalsIgnoreCase("S")) {
                this.setRestaurant(true);
                ok= true;
            }else if(opc2.equalsIgnoreCase("N")){
                this.setRestaurant(false);
                ok = true;
            }else{
                System.out.println("La opción ingresada es icnorrecta (S/N)");
                ok = false;
            }
        }while(!ok);
    }
   
    
    public void mostrarCamping(){
        System.out.println("----- Camping ------");
        System.out.println("       * Acceso: ");
        if (this.isPrivado()==true) {
            System.out.print("Privado (Sólo para socios o acompañando a socio).");
        }else{
            System.out.print("Abierto al público en general.");
        }
        System.out.println("       * Superficie total del parque: "+this.getSuperficie()+" Kms2.");
        System.out.println("       * Capacidad máxima de carpas instaladas: "+this.getCarpasMax()+" carpas.");
        System.out.println("       * Posee "+this.getSanitarios()+" baños completos instalados, con duchas.");
        System.out.println("       * Servicio de Restaurante: ");
        if (this.isRestaurant()==true) {
            System.out.print("Posee un restó abierto al público.");
        }else{
            System.out.print("No posee.");
        }
    }
}
