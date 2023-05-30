package Entidades;

import Enumeraciones.Areas;
import Enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class Profesor extends Persona {

    private Areas area;
    private Empleados datoEmpleado;

    public Profesor() {
    }

    public Profesor(Areas area, Empleados datoEmpleado, String nombre, String apellido, String DNI, EstadoCivil estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.area = area;
        this.datoEmpleado = datoEmpleado;
    }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public Empleados getDatoEmpleado() {
        return datoEmpleado;
    }

    public void setDatoEmpleado(Empleados datoEmpleado) {
        this.datoEmpleado = datoEmpleado;
    }

    public void reasignarArea() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Reasignación de Area");
        System.out.println("El area actual de Prof. " + this.getApellido() + " es " + this.getArea().getNombreArea() + ".");
        System.out.println("Ingrese la nueva Area donde será reasignado (");

        for (Areas Aux : Areas.values()) {
            System.out.print(Aux + ", ");
        }
        System.out.print("): ");

        String areaNueva;
        boolean existe = false;
        int cont = 0;
//        do {
        areaNueva = leer.next();
        for (Areas area2 : Areas.values()) {
            if (areaNueva.equalsIgnoreCase(area2.getNombreArea())) {
                this.setArea(area2);
                existe = true;
                break;
            }
        }
//        } while (!existe);
        System.out.println("El profesor fue reasignado a una nueva Área.");
        System.out.println("");
    }

    public void crearProfesor() {
        System.out.println("Ingresar nuevo Profesor");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearPersona();
        int cont =0;
        Empleados datos = new Empleados();
        datos = datos.crearEmpleado();
        this.setDatoEmpleado(datos);
        System.out.print("Area en la que se desempeña (");
        for (Areas areaAsignada : Areas.values()) {
            System.out.print(areaAsignada.getNombreArea() + " | ");
             cont++;
            if (cont == 3 || cont ==6){
                System.out.println("");
            }
        }
        System.out.print("): ");

        String areaok;
        areaok = leer.next();
        for (Areas areas : Areas.values()) {
            if (areaok.equalsIgnoreCase(areas.getNombreArea())) {
                this.setArea(areas);
                   System.out.println("");
                break;
            }
        }
     
    }
    
    
        public void mostrarProfesor(){
            System.out.println("Datos de Profesor");
       super.mostrarPersona();
        System.out.println("Area: "+this.getArea().getNombreArea());
            System.out.println("Año de ingreso: "+this.getDatoEmpleado().getAnioIngreso());
            System.out.println("Nº de despacho: "+this.getDatoEmpleado().getNroDespacho());
            System.out.println("");
    }
}
