
package Entidades;

import java.util.ArrayList;

/**
 * @author Claudio Durán
 */
public class Materias {
    
    private ArrayList <String> materias;

    public Materias() {
    }

    public Materias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }
    
    
        
}
