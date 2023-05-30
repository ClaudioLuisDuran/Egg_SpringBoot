/*
 * La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. 

También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. 

Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
 
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class RectanguloServicio {
    
    public Rectangulo CargarRectangulo(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese la base del rectángulo:");
        r.setBase(leer.nextInt());
        
        System.out.println("Ingrese la altura del rectángulo:");
        r.setAltura(leer.nextInt());
        
        return r;
    }
    
    public void DibujarRectangulo(Rectangulo rect){
        
        for (int i = 0; i < rect.getAltura(); i++) {
            
            for (int j = 0; j < rect.getBase(); j++) {
                
                if (i == 0 || i == (rect.getAltura() - 1)){
                    System.out.print("* ");
                } else if (j == 0 || j == (rect.getBase()-1)){
                System.out.print("* ");
            }else{
                    System.out.print("  ");
                    }
            }
            System.out.println("");
        }
        
    }
    
    
    public void CalculaSuperficie(Rectangulo r){
        
        System.out.println("El area del rectángulo de " + r.getBase() + " por " + r.getAltura() + " es => " + (r.getBase() * r.getAltura()));
        
    }
    
    
        public void CalculaPerimetro(Rectangulo r){
        
        System.out.println("El perímetro del rectángulo de " + r.getBase() + " por " + r.getAltura() + " es => " + ((r.getBase() + r.getAltura()) * 2));
        
    }
}

