
package Entidades;

import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class Empleados {
    
    private int anioIngreso;
    private int nroDespacho;

    public Empleados() {
    }

    public Empleados(int anioIngreso, int nroDespacho) {
        this.anioIngreso = anioIngreso;
        this.nroDespacho = nroDespacho;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }
    
    public void reasignarDespacho(){
        Scanner leerOK = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Reasignación de despacho");
        System.out.println("El despacho actual es el nº "+ this.getNroDespacho());
        System.out.println("Ingrese el nuevo número de despacho (o cero (0) para no cambiarlo):");
        int desp;
        do {
            desp = leerOK.nextInt();
            if (desp!=0) {
            if (desp !=this.getNroDespacho()) {
                this.setNroDespacho(desp);
                System.out.println("La reasignación de despacho fue exitosa.");
            }else{
                System.out.println("Ha ingresado el mismo número de despacho.\n "
                        + "Si ha decidido no cambiarlo ingrese el cero (0), sino ingrese el nº correcto.");
            }
             }else{
                System.out.println("No se ha reasignado nuevo despacho.");
            }
        } while (desp==this.getNroDespacho());
        System.out.println("");
    }
    
    public Empleados crearEmpleado(){
        Empleados e = new Empleados();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Año de ingreso a la Institución: ");
        e.setAnioIngreso(scan.nextInt());
        System.out.print("Nº de despacho que se le asigna: ");
        e.setNroDespacho(scan.nextInt());
        return e;
    }
    
    
}
