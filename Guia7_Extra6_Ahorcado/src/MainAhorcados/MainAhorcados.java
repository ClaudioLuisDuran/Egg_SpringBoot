/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAhorcados;

import Entidad.Ahorcado;
import Servicios.ServicioAhorcado;

/**
 * @author Claudio Durán
 */
public class MainAhorcados {

    public static void main(String[] args) {
        
        ServicioAhorcado Sa = new ServicioAhorcado();
        Ahorcado NuevoAhorcado = new Ahorcado();

        Sa.juego(NuevoAhorcado);
    }
}
