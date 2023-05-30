/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author Claudio Durán
 */
public class PrsonaMain {

    public static void main(String[] args) throws Exception {

        ServicioPersona Sp = new ServicioPersona();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        /*CREAR PERSONAS*/
        p1 = Sp.crearPersona(p1);
//        p2 = null;
        p2 = Sp.crearPersona(p2);
        p3 = Sp.crearPersona(p3);
        p4 = Sp.crearPersona(p4);

        System.out.println("Informe de masas corporales de cada persona:");
        System.out.println("");
        /*PERSONA 1*/
        Sp.calcularIMC(p1);
        switch (p1.getIMC()) {
            case 0:
                System.out.println("IMC de "+ p1.getNombre()+ " => " + p1.getIMC());
                System.out.println(p1.getNombre() + " está en peso ideal.");
                break;
            case -1:
                System.out.println("IMC de "+ p1.getNombre()+ " => " + p1.getIMC());
                System.out.println(p1.getNombre() + " está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("IMC de "+ p1.getNombre()+ " => " + p1.getIMC());
                System.out.println(p1.getNombre() + " está con sobrepeso.");
                break;
        }
try{
        if (Sp.esMayordeEdad(p1) == true) {
            System.out.println(p1.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p1.getNombre() + " es menor de edad.");
        }
           }catch (Exception a){
             System.out.println(a.getMessage());
         }

        /*PERSONA 2*/
        System.out.println("");
        Sp.calcularIMC(p2);
        switch (p2.getIMC()) {
            case 0:
                System.out.println("IMC de "+ p2.getNombre()+ " => " + p2.getIMC());
                System.out.println(p2.getNombre() + " está en peso ideal.");
                break;
            case -1:
                System.out.println("IMC de "+ p2.getNombre()+ " => " + p2.getIMC());
                System.out.println(p2.getNombre() + " está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("IMC de "+ p2.getNombre()+ " => " + p2.getIMC());
                System.out.println(p2.getNombre() + " está con sobrepeso.");
                break;
        }
try{
        if (Sp.esMayordeEdad(p2) == true) {
            System.out.println(p2.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p2.getNombre() + " es menor de edad.");
        }
            }catch (Exception a){
             System.out.println("La edad de la persona no está inicializada.");
         }

        /*PERSONA 3*/
        System.out.println("");
        Sp.calcularIMC(p3);
        switch (p3.getIMC()) {
            case 0:
                System.out.println("IMC de "+ p3.getNombre()+ " => " + p3.getIMC());
                System.out.println(p3.getNombre() + " está en peso ideal.");
                break;
            case -1:
                System.out.println("IMC de "+ p3.getNombre()+ " => " + p3.getIMC());
                System.out.println(p2.getNombre() + " está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("IMC de "+ p3.getNombre()+ " => " + p3.getIMC());
                System.out.println(p3.getNombre() + " está con sobrepeso.");
                break;
        }
        if (Sp.esMayordeEdad(p3) == true) {
            System.out.println(p3.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p3.getNombre() + " es menor de edad.");
        }

        /*PERSONA 4*/
        System.out.println("");
        Sp.calcularIMC(p4);
        switch (p4.getIMC()) {
            case 0:
                System.out.println("IMC de "+ p4.getNombre()+ " => " + p4.getIMC());
                System.out.println(p4.getNombre() + " está en peso ideal.");
                break;
            case -1:
                System.out.println("IMC de "+ p4.getNombre()+ " => " + p4.getIMC());
                System.out.println(p4.getNombre() + " está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("IMC de "+ p4.getNombre()+ " => " + p4.getIMC());
                System.out.println(p4.getNombre() + " está con sobrepeso.");
                break;
        }
        if (Sp.esMayordeEdad(p4) == true) {
            System.out.println(p4.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(p4.getNombre() + " es menor de edad.");
        }

        /*CALCULO DE % DE PESO*/
        int bajo = 0, ideal = 0, sobre = 0;
        System.out.println("");
        System.out.println("Estadística de pesos:");
        System.out.println("");
        for (int i = 1; i < 5; i++) {
            switch (i) {
                case 1:
                    switch (p1.getIMC()) {
                        case -1:
                            bajo++;
                            break;
                        case 0:
                            ideal++;
                            break;
                        case 1:
                            sobre++;
                            break;
                    }
                    break;
                case 2:
                    switch (p2.getIMC()) {
                        case -1:
                            bajo++;
                            break;
                        case 0:
                            ideal++;
                            break;
                        case 1:
                            sobre++;
                            break;
                    }
                    break;
                case 3:
                    switch (p3.getIMC()) {
                        case -1:
                            bajo++;
                            break;
                        case 0:
                            ideal++;
                            break;
                        case 1:
                            sobre++;
                            break;
                    }
                    break;
                case 4:
                    switch (p4.getIMC()) {
                        case -1:
                            bajo++;
                            break;
                        case 0:
                            ideal++;
                            break;
                        case 1:
                            sobre++;
                            break;
                    }
                    break;

            }

        }
        System.out.println("Personas por debajo de su peso ideal: " + ((bajo * 100) / 4) + " %.");
        System.out.println("Personas con peso ideal: " + ((ideal * 100) / 4) + " %.");
        System.out.println("Personas con sobrepeso: " + ((sobre * 100) / 4) + " %.");

        /*CALCULO DE % DE EDAD*/
        int menor = 0, mayor = 0;
        System.out.println("");
        System.out.println("Estadística de edades:");
        System.out.println("");
        for (int i = 1; i < 3; i++) {
            switch (i) {
                case 1:
                    if (p1.getEsmayor() == true) {
                        mayor++;
                    } else {
                        menor++;
                    }
                    break;
                case 2:
                    if (p2.getEsmayor() == true) {
                        mayor++;
                    } else {
                        menor++;
                    }
                    break;
                case 3:
                    if (p3.getEsmayor() == true) {
                        mayor++;
                    } else {
                        menor++;
                    }
                    break;
                case 4:
                    if (p4.getEsmayor() == true) {
                        mayor++;
                    } else {
                        menor++;
                    }
                    break;

            }

        }
        System.out.println("Personas mayores de edad: " + ((mayor * 100) / 4) + " %.");
        System.out.println("Personas menores de edad: " + ((menor * 100) / 4) + " %.");
        System.out.println("");
        System.out.println("Fin del informe.");

    }

}
