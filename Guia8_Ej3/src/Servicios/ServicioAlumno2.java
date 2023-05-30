// Ejercicio 3 GUIA 8 Colecciones
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno2 {
    Scanner leer;
    
    ///*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
    
    public ArrayList<Alumno> creaAlumnos(){
        ArrayList <Alumno> lista = new ArrayList();
        Alumno nuevoAlumno = new Alumno();
        String opc;
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("AGREGAR ALUMNO");
        do{
            System.out.println("Ingrese nombre del alumno:");
            
            nuevoAlumno.setNombre(leer.next()); 
            System.out.println("Ingrese la nota 1:");
            nuevoAlumno.getNotas().add(leer.nextInt());
            System.out.println("Ingrese la nota 2:");
            nuevoAlumno.getNotas().add(leer.nextInt());
            System.out.println("Ingrese la nota 3:");
            nuevoAlumno.getNotas().add(leer.nextInt());
            lista.add(nuevoAlumno);
            
            System.out.println("¿Desea agregar otro alumno? (S/N)");
            opc = leer.next();
        }while (opc.equalsIgnoreCase("s"));
        return lista;
    }
    
    //Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
//package Servicios;
///**
    
    private Double notaFinal(ArrayList<Alumno> Lista){
        Double notaFinal = 0.0;
        Double sumaNotas = 0.0;
        Double cantNotas = 0.0;
        System.out.println("CALCULO DE NOTA FINAL");
                
        System.out.println("Ingrese el nombre del alumno a calcular:");
        String alumno = leer.next();
        
        Iterator <Alumno> itA = Lista.iterator();
         while (itA.hasNext()) {
             if (itA.next().getNombre().equalsIgnoreCase(alumno)) {
                 
            Iterator <Integer> it2 = itA.next().getNotas().iterator();
            while (it2.hasNext()) {
                         sumaNotas = sumaNotas + it2.next();
                        cantNotas ++;
        }
              notaFinal = sumaNotas / cantNotas;
             }else{
                 System.out.println("El alumno no se encuentra.");
             }
        }

           return notaFinal;
        }

    }
