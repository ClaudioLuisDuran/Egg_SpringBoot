/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar
 */
package Entidad;
/**
 * @author Claudio Durán
 */
public class Ahorcado {
    
    private String[] vectorPalabra;
    private int encontradas;
    private int jugMax;

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }

    public Ahorcado() {
    }

    public Ahorcado(String[] vectorPalabra, int encontradas, int jugMax) {
        this.vectorPalabra = vectorPalabra;
        this.encontradas = encontradas;
        this.jugMax = jugMax;
    }
    
}
