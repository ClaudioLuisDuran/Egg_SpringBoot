
package Entidades;

/**
 * @author ClaudioDuran
 */
public class Gato extends Animal {
    
    private String sexo;

    public Gato() {
    }



    public Gato(String sexo, String nombre) {
        super(nombre);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void hacerRuido(){
        System.out.println("Gato "+this.getNombre()+" dice 'Miau'");
    }
}
