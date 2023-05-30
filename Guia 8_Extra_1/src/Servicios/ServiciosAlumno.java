/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import Entidades.Curso;
import Entidades.Escuela;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServiciosAlumno {

    Scanner leer;

    public Escuela cargarAlumnonuevo(Escuela e, String curso) {
        leer = new Scanner(System.in).useDelimiter("\n");
        
        Alumno nuevo = new Alumno();
        ArrayList nominaAlumnos = new ArrayList();
        
        nuevo.setCurso(curso);
       
//        Iterator<Curso> it = e.getCursos().iterator();
//        while (it.hasNext()) {
//            Curso aux = it.next();
//            if (aux.getCursoDivision().equals(curso)) {
//               nominaAlumnos = aux.getAlumnado();
//               break;
//            }
//        }
        boolean opc;
        String opcion;
        do{
     
        // Pedir datos del nuevo alumno
        System.out.println("Nuevo Alumno\n"
                + "Apellido/s: ");
        nuevo.setApellido(leer.next());
        System.out.println("Nombre/s:");
        nuevo.setNombres(leer.next());
        System.out.println("DNI:");
        nuevo.setDNI(leer.next());
        System.out.println("Fecha de nacimiento. \n"
                + "Año:");
        int anio = leer.nextInt();
        anio = anio-1900;
        System.out.println("Mes:");
        int mes = leer.nextInt();
        mes--;
        System.out.println("Dia:");
        int dia = leer.nextInt();
        Date fechaok = new Date();
        fechaok.setYear(anio);
        fechaok.setMonth(mes);
        fechaok.setDate(dia);
        nuevo.setFechaNac(fechaok);
        System.out.println("Nacionalidad:");
        nuevo.setNacionalidad(leer.next());

//Agregar alumno a su curso
       nominaAlumnos.add(nuevo);
            System.out.println("Desea agregar otro alumno? (S/N)");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("n")) {
                opc = false;
            }else{
                opc = true;
            }
   }while(opc != false);
 // Agrego curso a escuela      
        e.setCursos(nominaAlumnos);
        return e;
    }

}
