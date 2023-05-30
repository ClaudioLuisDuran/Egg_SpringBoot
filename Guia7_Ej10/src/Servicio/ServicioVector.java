/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Claudio Durán
 */
public class ServicioVector {

    public void crearVector(Integer[] v) {

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);

        }
            
            }    

    public void crearVector2(double[] v2) {

        for (int i = 0; i < v2.length; i++) {
           v2[i] = Math.random() * 10;
        }

    }

    public void mostrarVector(Integer[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.println("");
    }

    public void ordenarVector(Integer[] v) {

        Arrays.sort(v, Collections.reverseOrder());

    }

    public void mostrarVector2(double[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.println("");
    }

    public void copiarYrellenar(Integer[] v, double[] v2) {

        for (int j = 0; j < v2.length; j++) {
            if (j >= 0 && j < 10) {
                v2[j] = v[j];
            } else {
                v2[j] = .5;
            }
        }

    }

}
