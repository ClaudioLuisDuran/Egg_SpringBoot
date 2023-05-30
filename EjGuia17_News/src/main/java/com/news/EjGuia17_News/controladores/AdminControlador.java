
package com.news.EjGuia17_News.controladores;


import com.news.EjGuia17_News.entidades.Noticia;
import com.news.EjGuia17_News.entidades.Periodista;
import com.news.EjGuia17_News.entidades.Usuario;
import com.news.EjGuia17_News.excepciones.MiException;
import com.news.EjGuia17_News.servicios.PeriodistaServicio;
import com.news.EjGuia17_News.servicios.UsuarioServicio;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin")
public class AdminControlador {
   
    @Autowired
    private UsuarioServicio usuarioServicio;
    
      @Autowired
    private PeriodistaServicio periodistaServicio;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_PRESS')")
    @GetMapping("/dashboard")
public String panelAdministrativo(HttpSession session, ModelMap model) {
    
    Usuario logueado = (Usuario) session.getAttribute("usuariosession");
    if (logueado.getRol().toString().equals("ADMIN") || logueado.getRol().toString().equals("PRESS")) {
        // Lógica para el caso en que se cumpla la condición
        return "panel.html";
    } else {
        String error = "No tiene permitido esa acción";
            return "redirect:" + "?error=" + error;
//        } else {
            // Si no se puede obtener la URL anterior, se redirige a una página genérica de error
//            return "redirect:/error";
//        }
    }
}
    
    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo){
            if (error != null) {
                modelo.put("error", "Usuario o contraseñas incorrectas");
            }
        return "loginOk.html";
    }
    
   
   @GetMapping("/usuarios")
    public String listar(ModelMap modelo) {
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "usuario_list.html";
    }
    
    @GetMapping("/modificarRol/{id}")
    public String cambiarRol(@PathVariable String id){
        usuarioServicio.cambiarRol(id);
       return "redirect:/admin/usuarios";
    }
    
        @GetMapping("/modificarRolPress/{id}")
    public String cambiarRolPress(@PathVariable String id){
        periodistaServicio.cambiarRolPress(id);
       return "redirect:/admin/listarPress";
    }
    
        @GetMapping("/alta/{id}")
    public String cambiarAlta(@PathVariable String id){
        usuarioServicio.cambiarAlta(id);
       return "redirect:/admin/usuarios";
    }
    
        @GetMapping("/borrar/{id}")
    public String borrarUsrl(@PathVariable String id){
        usuarioServicio.borrarUsr(id);
       return "redirect:/admin/usuarios";
    }

    @GetMapping("/modificar/{id}")
    public String modificarUsr(@PathVariable String id, ModelMap modelo){
        modelo.put("usuario", usuarioServicio.getOne(id));
        
        return "usuario_modificar.html";
    }
    
    
        // Periodistas
    
        @GetMapping("/registrarPress")
    public String registrarPress(){
        return "registroPress.html";
    }
    
        @PostMapping("/registroPressOK")
    public String registro(@RequestParam String nombre, @RequestParam String email, 
            @RequestParam String password, @RequestParam String password2, ModelMap modelo){
        
        try {
            periodistaServicio.registrarPress(nombre, email, password, password2);
            modelo.put("exito", "Periodista registrado correctamente.");
            return "index.html";
        } catch (MiException ex) {
            modelo.put("error",  ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            return "registro";
        }
    }
    
    
    
        @GetMapping("/modificarPress/{id}")
    public String modificarPress(@PathVariable String id, ModelMap modelo){
        modelo.put("usuario", periodistaServicio.getOne(id));
        
        return "press_modificar.html";
    }
    
        
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
            @PostMapping("/modificarPress/{id}")
        public String modificarPress(@PathVariable String id, @RequestParam String nombre, @RequestParam String email, 
            @RequestParam Integer sueldoMensual, ModelMap modelo){
        
        try {
            periodistaServicio.actualizarPress(id, nombre, email, sueldoMensual);
            modelo.put("exito", "Perfil actualizado correctamente.");
            return "inicio.html";
        } catch (MiException ex) {
            modelo.put("error",  ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            modelo.put("sueldoMensual", sueldoMensual);
            return "press_modificar.html";
        }
    }
    
        
            @GetMapping("/listarPress")  
    public String listarPress(ModelMap modelo) {
        List<Periodista> periodistas = periodistaServicio.listarPress();
        modelo.addAttribute("periodistas", periodistas);
        return "press_list.html";
    }

    @GetMapping("/listamodif")
    public String listarModif(ModelMap modelo) {
        List<Periodista> periodistas = periodistaServicio.listarPress();
        modelo.addAttribute("periodistas", periodistas);
        return "press_modificar.html";
    }
        
        
        
}
