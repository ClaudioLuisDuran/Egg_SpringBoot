
package Entidades;

import Enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String DNI;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }


    public Persona(String nombre, String apellido, String DNI, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
    public void cambiarEstadoCivil(){
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elija el nuevo estado civil de "+this.apellido+": ");
     char opc;
        do{
        if (this.getEstadoCivil().getTipoEstado().equalsIgnoreCase("Soltero")) {
            System.out.println("C) Casado.");
            System.out.println("D) Divorciado.");
        }else if (this.getEstadoCivil().getTipoEstado().equalsIgnoreCase("Casado")) {
            System.out.println("S) Soltero.");
            System.out.println("D) Divorciado.");
        }else if (this.getEstadoCivil().getTipoEstado().equalsIgnoreCase("Divorciado")){
             System.out.println("C) Casado.");
             System.out.println("S) Soltero.");
        }else{
            System.out.println("La opción ingresada es incorrecta. Revise...");
        }
        opc = leer.next().charAt(0);
          }while(opc!='C'&&opc!='D'&&opc!='S'&&opc!='c'&&opc!='d'&&opc!='s');
        switch (opc) {
            case 'C':
                this.setEstadoCivil(EstadoCivil.CASADO);
                break;
             case 'D':
                this.setEstadoCivil(EstadoCivil.DIVORCIADO);
                break;
                 case 'S':
                this.setEstadoCivil(EstadoCivil.SOLTERO);
                break;
        }
        
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Carga de datos personales");
        System.out.print("Nombre: ");
        this.setNombre(leer.next());
        System.out.print("Apellido: ");
        this.setApellido(leer.next());
        System.out.print("DNI: ");
        this.setDNI(leer.next());
        String opc;
        System.out.println("Estado Civil (elija la opción):\n"
                + "     S) Soltero\n"
                + "     C) Casado\n"
                + "     D) Divorciado");
        do{
        opc = leer.next();
            switch (opc) {
                case "S":
                case "s":
                    this.setEstadoCivil(EstadoCivil.SOLTERO);
                    break;
                    
                 case "C":
                case "c":
                    this.setEstadoCivil(EstadoCivil.CASADO);
                    break;
                    
                    case "D":
                case "d":
                    this.setEstadoCivil(EstadoCivil.DIVORCIADO);
                    break;
                default:
                    System.out.println("La opción ingresada no existe. Revise...");
            }
        }while(!opc.equalsIgnoreCase("S")&&!opc.equalsIgnoreCase("C")&&!opc.equalsIgnoreCase("D"));
    }
    
    
    public void mostrarPersona(){
        
        System.out.println("Nombre completo: "+this.getApellido()+", "+this.getNombre()+".");
        System.out.println("DNI: "+this.getDNI());
        System.out.println("Estado civil: "+this.getEstadoCivil().getTipoEstado());
    }
    
    
}
