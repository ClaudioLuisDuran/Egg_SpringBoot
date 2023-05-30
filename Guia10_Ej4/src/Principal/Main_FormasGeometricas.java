/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author ClaudioDuran
 */
public class Main_FormasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();

        circulo.ingresarDatos();
        circulo.calcularArea(circulo);
        circulo.calcularPerimetro(circulo);
        System.out.println("");
        rectangulo.ingresarDatos();
        rectangulo.calcularPerimetro(rectangulo);
        rectangulo.calcularArea(rectangulo);

    }

}
