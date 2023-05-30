/*
 * Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.

c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.MAtematica;

/**
 *
 * @author Claudio Durán
 */
public class ServicioMatematicas {

    public void devolverMayor(MAtematica num) {
        if (num.getNum1() > num.getNum2()) {
            System.out.println("El número " + num.getNum1() + " es mayor que el número " + num.getNum2());
        } else if (num.getNum1() < num.getNum2()) {
            System.out.println("El número " + num.getNum2() + " es mayor que el número " + num.getNum1());
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    public void calcularPotencia(MAtematica num) {
        if (num.getNum1() >= num.getNum2()) {
            System.out.println("La potencia de " + num.getNum1() + " elevado a " + num.getNum2() + " es:");
            System.out.println(Math.pow(num.getNum1(), num.getNum2()));
        } else if (num.getNum1() < num.getNum2()) {
            System.out.println("La potencia de " + num.getNum2() + " elevado a " + num.getNum1() + " es:");
            System.out.println(Math.pow(num.getNum2(), num.getNum1()));
        }
    }
    
    public void calcularRaiz(MAtematica num){
        int num1 = Math.abs(num.getNum1());
        int num2 = Math.abs(num.getNum2());
        int ok;
        if(num1 <= num2){
            ok= num1;
        }else{
            ok = num2;
        }
        System.out.println("La raiz cuadrada de " + ok + " es: " + Math.sqrt(ok));
    }
    
    
}
