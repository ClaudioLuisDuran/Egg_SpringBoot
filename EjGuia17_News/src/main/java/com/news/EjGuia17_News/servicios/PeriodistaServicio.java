package com.news.EjGuia17_News.servicios;


import com.news.EjGuia17_News.entidades.Periodista;
import com.news.EjGuia17_News.entidades.Usuario;
import com.news.EjGuia17_News.enumeraciones.Rol;
import com.news.EjGuia17_News.excepciones.MiException;
import com.news.EjGuia17_News.repositorios.PeriodistaRepositorio;
import com.news.EjGuia17_News.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


/**
 *
 * @author ClaudioDuran
 */
@Service
public class PeriodistaServicio{
// Esta implementacion es la que tiene un método llamado loadUserByUsername () que se puede sobreescribir para personalizar el
//proceso de búsqueda del usuario.
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private PeriodistaRepositorio periodistaRepositorio;

    
    //resitro de usuario Periodista
    
          @Transactional
    public void registrarPress(String nombre, String email, String password, String password2) throws MiException {

        validar(nombre, email, password, password2);
        
        Periodista usuario = new Periodista();
        
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.PRESS);
        usuario.setAlta(new Date());
        usuario.setActivo(Boolean.TRUE);
        usuario.setSueldoMensual(150000);

        periodistaRepositorio.save(usuario);
                
    }
    
    
    
    
    
    
        @Transactional
    public void actualizarPress(String idUsuario, String nombre, String email, Integer sueldoMensual) throws MiException {

//        validar(nombre, email, password, password2);
        
        Optional<Usuario> respuesta = usuarioRepositorio.findById(idUsuario);
        
            if (respuesta.isPresent()) {
                Periodista usuario = (Periodista) respuesta.get();
             usuario.setNombre(nombre);
                  usuario.setEmail(email);
                  usuario.setSueldoMensual(sueldoMensual);
                  periodistaRepositorio.save(usuario);
                        }
    }
    
    
        /// Para cambiar usuario a Periodista o Admin o Usr
  @Transactional
    public void cambiarRolPress(String id){
        Optional<Usuario> respuesta = periodistaRepositorio.findById(id);
    	Periodista aux = new Periodista();

    	if(respuesta.isPresent()) {
    		Usuario usuario = respuesta.get();
    		if(usuario.getRol().equals(Rol.USER)) {
    		usuario.setRol(Rol.PRESS);
    		}else if(usuario.getRol().equals(Rol.PRESS)) {
    			usuario.setRol(Rol.ADMIN);
    		}else if(usuario.getRol().equals(Rol.ADMIN)) {
    			usuario.setRol(Rol.USER);
    		}
            
    	}
    }

                //borrar usr
    @Transactional // para todo metodo que haga cambios en la base de datos
    public void borrarUsr(String id){
     Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
//            usuarioRepositorio.delete(usuario);
            periodistaRepositorio.deleteById(id);
        }
    }
    
    
        //listar usuarios periodistas
    public List<Periodista> listarPress() {
//        List<Usuario> periodistas = new ArrayList();
//        periodistas = usuarioRepositorio.findAllByRol(Rol.PRESS);
        

//    List<Usuario> usuarios = usuarioRepositorio.findAllByRol(Rol.PRESS);
   List<Periodista> periodistas = periodistaRepositorio.findAllByRol();
//    List<Periodista> periodistas = new ArrayList<>();
////   
////    for (Usuario usuario : usuarios) {
////        System.out.println(usuario.getNombre());
////        System.out.println(usuario.getRol());
////            Periodista aux = new Periodista();
//////            aux.setSueldoMensual(usuario.g);
////            periodistas.add((Periodista)usuario);
////
////    }
    return periodistas;
}



               //buscar usuario
    public Usuario getOne(String id) {
        return periodistaRepositorio.getOne(id);

    }    
    
    
        private void validar(String nombre, String email, String password, String password2) throws MiException {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre no puede ser nulo o estar vacío.");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("El email no puede ser nulo o estar vacío.");
        }
        if (password.isEmpty() || password == null || password.length() <=5) {
            throw new MiException("La contraseña no puede ser nula o estar vacía y debe tener más de 5 digitos.");
        }
          if (!password2.equals(password)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales.");
        }
    }
    
}
