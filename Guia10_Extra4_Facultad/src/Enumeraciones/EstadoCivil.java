
package Enumeraciones;

/**
 * @author ClaudioDuran
 */
public enum EstadoCivil {
    
    CASADO ("Casado"), SOLTERO ("Soltero"), DIVORCIADO ("Divorciado");
    
    private String tipoEstado;

    private EstadoCivil() {
    }

    private EstadoCivil(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public static EstadoCivil getCASADO() {
        return CASADO;
    }

    public static EstadoCivil getSOLTERO() {
        return SOLTERO;
    }

    public static EstadoCivil getDIVORCIADO() {
        return DIVORCIADO;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

}
