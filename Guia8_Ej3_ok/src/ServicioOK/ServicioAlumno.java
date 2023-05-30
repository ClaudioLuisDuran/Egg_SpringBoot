package ServicioOK;


import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {
    Scanner leer;

    
    public ArrayList<Alumno> creaAlumnos(){
        ArrayList <Alumno> lista = new ArrayList();
        Alumno nuevoAlumno = new Alumno();
        ArrayList <Integer> notasnuevas = new ArrayList();
        String opc;
        
        leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("AGREGAR ALUMNO");
        do{
            System.out.println("Ingrese nombre del alumno:");
            
            nuevoAlumno.setNombre(leer.next()); 
            System.out.println("Ingrese la nota 1:");
            notasnuevas.add(leer.nextInt());
            System.out.println("Ingrese la nota 2:");
            notasnuevas.add(leer.nextInt());
            System.out.println("Ingrese la nota 3:");
            notasnuevas.add(leer.nextInt());
            nuevoAlumno.setNotas(notasnuevas);
           lista.add(nuevoAlumno);
            
            System.out.println("¿Desea agregar otro alumno? (S/N)");
            opc = leer.next();
        }while (opc.equalsIgnoreCase("s"));
        return lista;
    }
    
    public Double notaFinal (ArrayList<Alumno> Lista){
        Double notaFinal = 0.0;
        Double sumaNotas = 0.0;
        Double cantNotas = 0.0;
        System.out.println("CALCULO DE NOTA FINAL");
                
        System.out.println("Ingrese el nombre del alumno a calcular:");
        String alumno = leer.next();
        
        Iterator <Alumno> itA = Lista.iterator();
        while(itA.hasNext()){
        Alumno a = itA.next();
             if (a.getNombre().equalsIgnoreCase(alumno)) {
     
            Iterator <Integer> it2 = a.getNotas().iterator();
            while (it2.hasNext()) {
                         sumaNotas = sumaNotas + it2.next();
                        cantNotas ++;
        }
              notaFinal = sumaNotas / cantNotas;
             }
                 }
        
             return notaFinal;
        }
           
        }

