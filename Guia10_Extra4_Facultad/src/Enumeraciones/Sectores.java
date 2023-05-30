
package Enumeraciones;

/**
 * @author ClaudioDuran
 */
public enum Sectores {
    
    BIBLIOTECA("Biblioteca"),
    DECANATO("Decanato"),
    SECRETARIA("Secretaría"),
    ADMINISTRACION("Administración"),
    JARDINERIA("Jardinería"),
    AULAS("Aulas"),
    MANTENIMIENTO("Mantenimiento");
    
    private String nombreSector;

    private Sectores() {
    }

    private Sectores(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    public static Sectores getBIBLIOTECA() {
        return BIBLIOTECA;
    }

    public static Sectores getDECANATO() {
        return DECANATO;
    }

    public static Sectores getSECRETARIA() {
        return SECRETARIA;
    }

    public static Sectores getADMINISTRACION() {
        return ADMINISTRACION;
    }

    public static Sectores getJARDINERIA() {
        return JARDINERIA;
    }

    public static Sectores getAULAS() {
        return AULAS;
    }

    public static Sectores getMANTENIMIENTO() {
        return MANTENIMIENTO;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    
}
