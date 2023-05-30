/*

• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioRaiz {

    /*Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c*/

    public double getDiscriminante(Raices r) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double disc;
        disc = (Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));
        return disc;
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices(Raices r) {
        boolean tiene;
        double disc = (Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));
        if (disc >= 0) {
            tiene = true;
        } else {
            tiene = false;
        }
        return tiene;
    }
    
    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.*/
    
    public boolean tieneRaiz(Raices r){
        boolean raizunica;
        boolean tiene;
        double disc = (Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));
        if(disc == 0){
            raizunica = true;
        }else{
            raizunica = false;
        }
        return raizunica;
    }
    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.*/
    
    public void obtenerRaices(Raices r){
        if(this.tieneRaices(r)==true){
            double resultado1, resultado2;
            resultado1 = (-r.getB()+Math.sqrt((Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA());
            resultado2 = (-r.getB()-Math.sqrt((Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA());
            System.out.println("Posibles soluciones:");
            System.out.println("Resultado 1 = " + resultado1);
            System.out.println("Resultado 2 = " + resultado2);
        }
    }
    
    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.*/
    
    public void obtenerRaiz(Raices r){
        if(this.tieneRaiz(r) == true){
            System.out.println("Tiene raiz unica pero no se que hacer ;)");
        }else{
            System.out.println("No tiene raiz unica.");
        }
        
    }
    
}
