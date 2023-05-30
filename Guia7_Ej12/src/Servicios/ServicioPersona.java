/*
 * Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.

• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("Ingrese el nombre completo de la persona:");
        p.setNombre(leer.next());
        System.out.println("Ingrese el dia de nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento:");
        int mes = leer.nextInt();
        mes --;
        System.out.println("Ingrese el año de nacimiento:");
        int anio = leer.nextInt();
        anio = anio-1900;
        Date nac = new Date(anio,mes,dia);
        p.setNacimiento(nac);
        return p;
        }
    
    public int calcularEdad(Persona p){
        int edad;
       int anioNac = p.getNacimiento().getYear();
       Date fechaActual = new Date();
        int anioActual = fechaActual.getYear();
        edad = anioActual-anioNac;
        System.out.println("La edad de " +  p.getNombre() + " es " + edad + " años.");
        return edad;
    }
    
    public boolean menorQue(int edad2, int edadP){
        boolean resultado;
        
        if(edad2 < edadP){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Naciiento: " + p.getNacimiento());
    }
    
    }
    
