/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Persistencia;

import Principal.Dominio.Usuario.Usuario;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ClaudioDuran
 */
public final class UsuarioDAO extends DAO {
    
    public void guardarUsuario(Usuario usuario) throws Exception{
        
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar un usuario...");
            }
            
            String sql = "INSERT INTO Usuario (correoElectronico, clave)"
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
        public void modificarUsuario(Usuario usuario) throws Exception{
        
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar un usuario...");
            }
            
            String sql = "UPDATE Usuario SET"
                    + "clave = '" + usuario.getClave() + "' WHERE correElectronico = '" + usuario.getCorreoElectronico() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
        public void eliminarUsuario(String correoElectronico) throws Exception{
        
        try {
            String sql = "DELETE FROM Usuario WHERE correoElectronico = ' " + correoElectronico + " '; ";
               insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Usuario buscarUsuraioPorCorreo(String correoElectronico) throws Exception{
        
        try {
            String sql = "SELECT * FROM usuario WHERE correElectronico = '"+correoElectronico+"';";
            consultarBase(sql);Usuario usuario = null;
            while(resultado.next()){
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                        usuario.setCorreoElectronico(resultado.getNString(2));
                        usuario.setClave(resultado.getString(3));
            }   
            desconectarBase();
            return usuario;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
        
        
        public Collection<Usuario> listarUsuarios() throws Exception{
        
        try {
            String sql = "SELECT correoElectronico, clave FROM usuario";
            consultarBase(sql);
            Usuario usuario = null;
            Collection <Usuario> usuarios = new ArrayList();
 
            while(resultado.next()){
                usuario = new Usuario();
                        usuario.setCorreoElectronico(resultado.getNString(1));
                        usuario.setClave(resultado.getString(2));
                        usuarios.add(usuario);
            }   
            desconectarBase();
            return usuarios;
            
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de sistema.");
        }
        
    }
    
    
    
        
}
