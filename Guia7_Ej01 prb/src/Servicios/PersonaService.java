/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;

import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Claudio Durán
 */
public class PersonaService {

    public Persona crearPersona(){
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese el nombre de la persona:");
    String nombre = leer.next();
    System.out.println("Ingrese la edad de la persona:");
    int edad = leer.nextInt();
    System.out.println("Ingrese el dni de la persona:");
    int dni = leer.nextInt();
    System.out.println("Ingrese la fecha de nacimiento de la persona:");
    int anio = leer.nextInt();
    anio = anio;
    int mes = leer.nextInt();
    mes = mes;
    int d = leer.nextInt();
    
    Date nacimiento = new Date(anio,mes,d);
        
    return new Persona(nombre, edad, dni, nacimiento);
 
    }
    
    
    
 }