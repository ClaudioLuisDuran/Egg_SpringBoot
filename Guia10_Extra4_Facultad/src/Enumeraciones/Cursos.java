package Enumeraciones;

/**
 * @author ClaudioDuran
 */
public enum Cursos {
    
    PRIMEROA("1A"), PRIMEROB("1B"), SEGUNDOA("2A"), SEGUNDOB("2B"), TERCEROA("3A"), TERCEROB("3B"), 
    CUARTOA("4A"), CUARTOB("4B"), QUINTOA("5A"), QUINTOB("5B");  
    
private String nombreCurso;

    private Cursos() {
    }

    private Cursos(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public static Cursos getPRIMEROA() {
        return PRIMEROA;
    }

    public static Cursos getPRIMEROB() {
        return PRIMEROB;
    }

    public static Cursos getSEGUNDOA() {
        return SEGUNDOA;
    }

    public static Cursos getSEGUNDOB() {
        return SEGUNDOB;
    }

    public static Cursos getTERCEROA() {
        return TERCEROA;
    }

    public static Cursos getTERCEROB() {
        return TERCEROB;
    }

    public static Cursos getCUARTOA() {
        return CUARTOA;
    }

    public static Cursos getCUARTOB() {
        return CUARTOB;
    }

    public static Cursos getQUINTOA() {
        return QUINTOA;
    }

    public static Cursos getQUINTOB() {
        return QUINTOB;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }


}
