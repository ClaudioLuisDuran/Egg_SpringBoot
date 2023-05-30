/*
 * Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package Servicios;

import Entidades.Triangulo;

/**
 * @author Claudio Durán
 */
public class ServicioTriang {

    public double areaTriang(Triangulo t){
        double resultado;
        resultado = (t.getBase() * t.getAltura()) / 2;
        return resultado;
    }

    public double ladoTriang(Triangulo t){
        double resultado;
        resultado = Math.sqrt(Math.pow((t.getBase() / 2), 2) + Math.pow(t.getAltura(), 2));
        return resultado;
    }

    public int perimTriang(Triangulo t){
        int resultado;
        resultado = ((int) (2*t.getLado()))+t.getBase();
        return resultado;
    }
    
 public int mayorArea(Triangulo[] Vt){
     int retorno=-1;
     double mayor = 0;
     for (int i = 0; i < 4; i++) {
         if(Vt[i].getArea()>mayor){
             mayor = Vt[i].getArea();
             retorno = i;
         }
     }
     return retorno;
 }
}
