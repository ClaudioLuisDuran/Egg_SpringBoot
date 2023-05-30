/*
 Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.

f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author Claudio Durán
 */
public class ServicioCadena {

    public void mostrarVocales(Cadena c) {

        System.out.println("La cadena contiene las siguientes vocales:");
        int a = 0, e = 0, ii = 0, o = 0, u = 0;
        String frase = c.getFrase();
        for (int i = 0; i < c.getLongitud(); i++) {
            switch (frase.substring(i, (i + 1)).toUpperCase()) {
                case "A":
                    a++;
                    break;
                case "E":
                    e++;
                    break;
                case "I":
                    ii++;
                    break;
                case "O":
                    o++;
                    break;
                case "U":
                    u++;
                    break;
            }
        }
        System.out.println(a + " vocales a.");
        System.out.println(e + " vocales e.");
        System.out.println(ii + " vocales i.");
        System.out.println(o + " vocales o.");
        System.out.println(u + " vocales u.");
    }

    public void invertirFrase(Cadena c) {

        System.out.println("");
        System.out.println("La frase invertida es:");
        for (int i = c.getLongitud(); i > 0; i--) {
            System.out.print(c.getFrase().substring((i - 1), i));
        }
        System.out.println("");
    }

    public void vecesRepetido(String letra, Cadena c) {
        String frase = c.getFrase();
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + cont + " veces.");
    }

    public void compararLongitud(Cadena c, Cadena d) {

        if (c.getLongitud() > d.getLongitud()) {
            System.out.println("La cadena inicial es mas larga que la nueva.");
        } else if (c.getLongitud() < d.getLongitud()) {
            System.out.println("La nueva cadena es mas larga que la anterior.");
        } else {
            System.out.println("Ambas cadenas son de igual longuitud.");
        }

    }
    
    public void unirFrases(Cadena c, Cadena d){
        System.out.println("Cadenas unidas:");
        System.out.println(c.getFrase().concat(" ").concat(d.getFrase()));
    }

}
