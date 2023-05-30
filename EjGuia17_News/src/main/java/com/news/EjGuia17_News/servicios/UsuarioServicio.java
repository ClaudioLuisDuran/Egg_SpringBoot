
package com.news.EjGuia17_News.servicios;

import com.news.EjGuia17_News.entidades.Administrador;
import com.news.EjGuia17_News.entidades.Periodista;
import com.news.EjGuia17_News.entidades.Usuario;
import com.news.EjGuia17_News.enumeraciones.Rol;
import com.news.EjGuia17_News.repositorios.UsuarioRepositorio;
import com.news.EjGuia17_News.excepciones.MiException;
import com.news.EjGuia17_News.repositorios.AdminRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author ClaudioDuran
 */
@Service
public class UsuarioServicio implements UserDetailsService {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private AdminRepositorio adminRepositorio;

    
    @Override
    public UserDetails loadUserByUsername(String email) {
    
    Usuario user = usuarioRepositorio.buscarPorEmail(email);
    
        if (user != null) {
            List<GrantedAuthority> permisos = new ArrayList();
            
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + user.getRol().toString()) ;
            
            permisos.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes)  RequestContextHolder.currentRequestAttributes();
            
            HttpSession session = attr.getRequest().getSession(true);
            
            session.setAttribute("usuariosession", user);
        
            return new User(user.getEmail(), user.getPassword(), permisos);

        }
    return null;
    }
     
    //Para cargar usuarios comunes
      @Transactional
    public void registrar(String nombre, String email, String password, String password2) throws MiException {

        validar(nombre, email, password, password2);
        
        Usuario usuario = new Usuario();
        
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.USER);
        usuario.setAlta(new Date());
        usuario.setActivo(Boolean.TRUE);

        usuarioRepositorio.save(usuario);
                
    }
    
// HABILITAR SOLO PARA CARGAR UN ADMINISTRADOR Y DESHABILITAR METODO ANTERIOR
//    @Transactional
//    public void registrar(String nombre, String email, String password, String password2) throws MiException {
//
//        validar(nombre, email, password, password2);
//        
//        Administrador usuario = new Administrador();
//        
//        usuario.setNombre(nombre);
//        usuario.setEmail(email);
//        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
//        usuario.setRol(Rol.ADMIN);
//        usuario.setAlta(new Date());
//        usuario.setActivo(Boolean.TRUE);
//
//        adminRepositorio.save(usuario);
//                
//    }
    
    
        @Transactional
    public void actualizar(String idUsuario, String nombre, String email, String password, String password2, Boolean activo) throws MiException {

        validar(nombre, email, password, password2);
        
        Optional<Usuario> respuesta = usuarioRepositorio.findById(idUsuario);
        
            if (respuesta.isPresent()) {
                Usuario usuario = respuesta.get();
             usuario.setNombre(nombre);
                  usuario.setEmail(email);
                  usuario.setPassword(new BCryptPasswordEncoder().encode(password));
                  usuario.setActivo(activo);
//                  usuario.setRol(Rol.USER);

                  usuarioRepositorio.save(usuario);
                        }

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

                //borrar usr
    @Transactional // para todo metodo que haga cambios en la base de datos
    public void borrarUsr(String id){
     Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
//            usuarioRepositorio.delete(usuario);
            usuarioRepositorio.deleteById(id);
        }
    }
    
    
          //listar usuarios
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList();
        usuarios = usuarioRepositorio.findAll();
        return usuarios;
    }
    
    /// Para cambiar usuario a Periodista o Admin o Usr
  @Transactional
    public void cambiarRol(String id){
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
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

    
        /// Para cambiar ualta o baja de usuario
  @Transactional
    public void cambiarAlta(String id){
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
    	
    	if(respuesta.isPresent()) {
    		Usuario usuario = respuesta.get();
    		if(usuario.getActivo().equals(Boolean.TRUE)){
    		usuario.setActivo(Boolean.FALSE);
    		}else{
    		usuario.setActivo(Boolean.TRUE);
    		}
    	}
    }
    
               //buscar usuario
    public Usuario getOne(String id) {
        return usuarioRepositorio.getOne(id);

    }    


    
}
