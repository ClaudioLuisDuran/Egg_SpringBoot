
package com.news.EjGuia17_News.controladores;

import com.news.EjGuia17_News.entidades.Noticia;
import com.news.EjGuia17_News.entidades.Usuario;
import com.news.EjGuia17_News.servicios.NoticiaServicio;
import com.news.EjGuia17_News.servicios.UsuarioServicio;
import com.news.EjGuia17_News.excepciones.MiException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ClaudioDuran
 */

@Controller
@RequestMapping("/")
public class PortalControlador {
    
@Autowired
 private NoticiaServicio noticiaServicio;
     
 @Autowired
 private UsuarioServicio usuarioServicio;
    
    @GetMapping("/")
    public String index(ModelMap modelo){
         List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias",noticias);
        return "index.html";
    }
    
   @GetMapping("/registrar")
    public String registrar(){
        return "registro.html";
    }
    
    @GetMapping("/logout")
    public String salir(){
        return "index";
    }
      
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email, 
            @RequestParam String password, @RequestParam String password2, ModelMap modelo, MultipartFile archivo){
        
        try {
            usuarioServicio.registrar(nombre, email, password, password2);
            modelo.put("exito", "Usuario registrado correctamente.");
            return "index.html";
        } catch (MiException ex) {
            modelo.put("error",  ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            return "registro";
        }
    }
    
        @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo){
            if (error != null) {
                modelo.put("error", "Usuario o contraseñas incorrectas");
            }
        return "loginOk.html";
    }
    

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN', 'ROLE_PRESS')")
            @GetMapping("/perfil")
    public String perfil(ModelMap modelo, HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", usuario);
        return "usuario_modificar.html";
    }

        @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
            @PostMapping("/actualizar/{id}")
        public String actualizar(@PathVariable String id, @RequestParam String nombre, @RequestParam String email, 
            @RequestParam String password, @RequestParam String password2, ModelMap modelo){
        
        try {
            usuarioServicio.actualizar(id, nombre, email, password, password2, Boolean.TRUE);
            modelo.put("exito", "Perfil actualizado correctamente.");
            return "inicio.html";
        } catch (MiException ex) {
            modelo.put("error",  ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            return "usuario_modificar.html";
        }
    }
    

public class LogoutController {
    @RequestMapping(value="/logout", method = RequestMethod.POST)
    public String logout(HttpServletRequest request){
        // realiza cualquier acción adicional que necesites
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        // redirige al usuario a la página de inicio
        return "redirect:/";
    }
}

            @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN', 'ROLE_PRESS')")
            @GetMapping("/inicio")
    public String inicio (HttpSession session, ModelMap modelo){
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        
                if (logueado.getRol().toString().equals("ADMIN")) {
                    return "redirect:/admin/dashboard";   
                }
       List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias",noticias);
        return "inicio.html";
    }
}

