/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidad.NIF;
import Servicio.ServicioNIF;

/**
 *
 * @author Claudio Durán
 */
public class MainNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioNIF Snif = new ServicioNIF();
        NIF NuevoDNI = new NIF();

        char[] vector = new char[23];
        for (int i = 0; i < vector.length; i++) {
            switch (i) {
                case 0:
                    vector[i] = 'T';
                    break;
                case 1:
                    vector[i] = 'R';
                    break;
                case 2:
                    vector[i] = 'W';
                    break;
                case 3:
                    vector[i] = 'A';
                    break;
                case 4:
                    vector[i] = 'G';
                    break;
                case 5:
                    vector[i] = 'M';
                    break;
                case 6:
                    vector[i] = 'Y';
                    break;
                case 7:
                    vector[i] = 'F';
                    break;
                case 8:
                    vector[i] = 'P';
                    break;
                case 9:
                    vector[i] = 'D';
                    break;
                case 10:
                    vector[i] = 'X';
                    break;
                case 11:
                    vector[i] = 'B';
                    break;
                case 12:
                    vector[i] = 'N';
                    break;
                case 13:
                    vector[i] = 'J';
                    break;
                case 14:
                    vector[i] = 'Z';
                    break;
                case 15:
                    vector[i] = 'S';
                    break;
                case 16:
                    vector[i] = 'Q';
                    break;
                case 17:
                    vector[i] = 'V';
                    break;
                case 18:
                    vector[i] = 'H';
                    break;
                case 19:
                    vector[i] = 'L';
                    break;
                case 20:
                    vector[i] = 'C';
                    break;
                case 21:
                    vector[i] = 'K';
                    break;
                case 22:
                    vector[i] = 'E';
                    break;
            }
        }
        NuevoDNI = Snif.crearNif(vector);
        System.out.println("El NIF del DNI ingresado es: ");
        System.out.print(NuevoDNI.getDNI() + "-" + NuevoDNI.getLetra());
        System.out.println("");
    }
}
