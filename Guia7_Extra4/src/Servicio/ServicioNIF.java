/*
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioNIF {

    public NIF crearNif(char[] v) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        NIF nuevo = new NIF();
        System.out.println("Ingrese el DNI de la persona:");
        nuevo.setDNI(leer.nextLong());
        /**
         * calcular el NIF
         */

        int resto = (int) nuevo.getDNI() % 23;

        for (int i = 0; i < v.length; i++) {
            if (resto == i) {
                nuevo.setLetra(v[i]);
                break;
            }
        }

        return nuevo;
    }
}
