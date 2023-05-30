
package Entidades;

/**
 * @author ClaudioDuran
 */
public final class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

     
    @Override
    public void Alimentarse() {
        System.out.println("El caballo "+this.nombre+", de la raza "+this.raza+" y de "+this.getEdad()+" años de edad, se alimenta con "+this.getAlimento()+".");
    }
    
}
