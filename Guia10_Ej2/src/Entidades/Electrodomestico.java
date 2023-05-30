package Entidades;

import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        char x;
        if (letra != 'A' || letra != 'a' || letra != 'B' || letra != 'b' || letra != 'C' || letra != 'c' || letra != 'E' || letra != 'e' || letra != 'F' || letra != 'f') {
            x = 'F';
        } else {
            x = letra;
        }
        return x;
    }

    public String comprobarColor(String color) {
        String c;
        if (!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris")) {
            c = "Blanco";
        } else {
            c = color;
        }
        return c;
    }

    public void crearElectrodomestico() {
        System.out.println("Crear nuevo electrodoméstico");
        System.out.print("Color (blanco, negro, rojo, azul, gris):");
        this.color = this.comprobarColor(leer.next());
        System.out.print("Consumo energético (A, B, C, D, E, F):");
        this.consumoEnergetico = this.comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.print("Peso:");
        this.peso = leer.nextInt();
        this.precio = 1000; // precio base
    }

    public int precioFinal(Electrodomestico e) {

        int precioFinal = e.precio;
        char consumo = e.getConsumoEnergetico();
        int pesoActual = e.getPeso();

        switch (consumo) {
            case 'A':
            case 'a':
                precioFinal = precioFinal + 1000;
                break;
            case 'B':
            case 'b':
                precioFinal = precioFinal + 800;
                break;
            case 'C':
            case 'c':
                precioFinal = precioFinal + 600;
                break;
            case 'D':
            case 'd':
                precioFinal = precioFinal + 500;
                break;
            case 'E':
            case 'e':
                precioFinal = precioFinal + 300;
                break;
            case 'F':
            case 'f':
                precioFinal = precioFinal + 100;
                break;
        }

        if (pesoActual <= 19) {
            precioFinal = precioFinal + 100;
        } else if (pesoActual > 19 && pesoActual <= 49) {
            precioFinal = precioFinal + 500;
        } else if (pesoActual > 49 && pesoActual <= 79) {
            precioFinal = precioFinal + 800;
        } else {
            precioFinal = precioFinal + 1000;
        }
//        e.setPrecio(precioFinal);
        return precioFinal;
    }

    public void mostrarElectrodomestico(Electrodomestico e) {

        System.out.println("Precio: " + e.getPrecio());
        System.out.println("Color: " + e.getColor());
        System.out.println("Consumo: " + e.getConsumoEnergetico());
        System.out.println("Peso: " + e.getPeso());

    }

}
