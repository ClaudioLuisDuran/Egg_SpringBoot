package Entidades;

import Enumeraciones.Areas;
import Enumeraciones.EstadoCivil;
import Enumeraciones.Sectores;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class Celador extends Persona {

    private Sectores sector;
    private Empleados datoEmpleado;

    public Celador() {
    }

    public Celador(Sectores sector, Empleados datoEmpleado, String nombre, String apellido, String DNI, EstadoCivil estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.sector = sector;
        this.datoEmpleado = datoEmpleado;
    }

    public Sectores getSector() {
        return sector;
    }

    public void setSector(Sectores sector) {
        this.sector = sector;
    }

    public Empleados getDatoEmpleado() {
        return datoEmpleado;
    }

    public void setDatoEmpleado(Empleados datoEmpleado) {
        this.datoEmpleado = datoEmpleado;
    }

    public void reasignarSeccion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Reasignación de Sección de trabajo");
        System.out.println("La sección actual del celador " + this.getApellido() + " es " + this.getSector() + ".");
        System.out.println("Ingrese la nueva Area donde será reasignado (");

        for (Sectores Name : Sectores.values()) {
            System.out.print(Name + ", ");
        }
        System.out.print("): ");

        String sectorNuevo = leer.next();
        for (Sectores sector2 : Sectores.values()) {
            if (sectorNuevo.equalsIgnoreCase(sector2.getNombreSector())) {
                this.setSector(sector);
                break;
            }
        }

        System.out.println("El celador fue reasignado a una nueva Sección de trabajo.");
        System.out.println("");
    }

    public void crearCelador() {
        System.out.println("Ingresar nuevo Celador");
        Scanner scanOk = new Scanner(System.in).useDelimiter("\n");
        super.crearPersona();
        Empleados datos = new Empleados();
        datos = datos.crearEmpleado();
        this.setDatoEmpleado(datos);
        int cont = 0;
        System.out.println("Ingrese la sección a la que se asignará: ");
        System.out.print("(");
        for (Sectores sectorOK : Sectores.values()) {
            System.out.print(sectorOK.getNombreSector()+" | ");
            cont++;
            if (cont == 3 || cont ==6){
                System.out.println("");
            }
        }
        System.out.println("): ");
        String sectorNuevo;

        sectorNuevo = scanOk.next();
        for (Sectores sector2 : Sectores.values()) {
            if (sectorNuevo.equalsIgnoreCase(sector2.getNombreSector())) {
                this.setSector(sector2);
                System.out.println("");
                break;
            }
        }
    }
    
        public void mostrarCelador(){
            System.out.println("Datos de Celador");
       super.mostrarPersona();
        System.out.println("Sector: "+this.getSector().getNombreSector());
        System.out.println("Año de ingreso: "+this.getDatoEmpleado().getAnioIngreso());
        System.out.println("Nº de despacho: "+this.getDatoEmpleado().getNroDespacho());
            System.out.println("");
    }
}
