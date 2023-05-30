
package Enumeraciones;

/**
 * @author ClaudioDuran
 */
public enum Areas {
    
    LENGUAJES("Lenguas"), MATEMATICAS("Matematicas"), SOCIALES("Ciencias Sociales"), FIC("Formacion Cristiana"), FISQUIM("Fisica y Quimica"), ARTES("Artes"), EDFIS("Educacion Fisica");
    
    private String nombreArea;

    private Areas() {
    }

    private Areas(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public static Areas getLENGUAJES() {
        return LENGUAJES;
    }

    public static Areas getMATEMATICAS() {
        return MATEMATICAS;
    }

    public static Areas getSOCIALES() {
        return SOCIALES;
    }

    public static Areas getFIC() {
        return FIC;
    }

    public static Areas getFISQUIM() {
        return FISQUIM;
    }

    public static Areas getARTES() {
        return ARTES;
    }

    public static Areas getEDFIS() {
        return EDFIS;
    }

    public String getNombreArea() {
        return nombreArea;
    }
    
    
}
