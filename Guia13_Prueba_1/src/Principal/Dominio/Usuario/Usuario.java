/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.Dominio.Usuario;

/**
 *
 * @author ClaudioDuran
 */
public class Usuario {
    
    private int Id;
    private String correoElectronico;
    private String clave;

    public Usuario() {
    }

    public Usuario(int Id, String correoElectronico, String clave) {
        this.Id = Id;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
    }



    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    
}
