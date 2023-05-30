/*
 *



h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta CrearCuenta() {

        System.out.println("Ingrese el número de cuenta a asignar al cliente:");
        int cuenta = leer.nextInt();
        System.out.println("Ingrese Apellido y Nombre del cliente:");
        String apellido = leer.next();
        System.out.println("Ingrese el DNI del cliente:");
        long DNI = leer.nextLong();
        System.out.println("Ingrese el Saldo Inicial de la cuenta:");
        int saldo = leer.nextInt();
        Cuenta Nc = new Cuenta(cuenta, apellido, DNI, saldo);
        return Nc;
    }

    public void Ingresar(Cuenta c) {
        System.out.println("Ingresar depósito: ");
        c.setSaldo(c.getSaldo() + leer.nextInt());
    }

    public void Retirar(Cuenta c) {

        int cont = 0;
        do {
            System.out.println("Ingresar retiro: ");
            int retirar = leer.nextInt();

            if (c.getSaldo() < retirar) {
                System.out.println("No tiene saldo suficiente.");
                System.out.println("Saldo actual: " + c.getSaldo());
                cont = cont + 1;
            } else {

                c.setSaldo(c.getSaldo() - retirar);
                cont = 0;
            }
        } while (cont > 0);

    }

    public void Rapido(Cuenta c) {

        int cont = 0;
        do {
            System.out.println("Ingresar monto de Extracción rápida (hasta 20% de saldo): ");
            int retirar = leer.nextInt();

            if (retirar > c.getSaldo() * .2) {
                System.out.println("El monto es mayor que el 20% de su saldo.");
                System.out.println("Saldo actual: " + c.getSaldo());
                System.out.println("Monto máx disponible para Extracción rápida: " + c.getSaldo() * .2);
                cont = cont + 1;
            } else {

                c.setSaldo(c.getSaldo() - retirar);
                cont = 0;
            }
        } while (cont > 0);

    }

    public void ConsultarSaldo(Cuenta c) {
        System.out.println("El saldo de la cuenta " + c.getCuentaNro() + " es de $" + c.getSaldo() + ".");
    }

    public void ConsultarDatos(Cuenta c) {
        System.out.println("Datos de la Cuenta Nº " + c.getCuentaNro() + ":");
        System.out.println("Titular: " + c.getApellido());
        System.out.println("DNI: " + c.getDNI());
        System.out.println("Saldo actualizado: " + c.getSaldo());
    }
    
    
    
    
}
