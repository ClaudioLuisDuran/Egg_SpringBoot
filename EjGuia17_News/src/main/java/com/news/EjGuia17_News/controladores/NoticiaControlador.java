package com.news.EjGuia17_News.controladores;

import com.news.EjGuia17_News.entidades.Noticia;
import com.news.EjGuia17_News.servicios.NoticiaServicio;
import com.news.EjGuia17_News.excepciones.MiException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ClaudioDuran
 */
@Controller
@RequestMapping("/noticia") //localhost:8080/noticia
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/registrar") //localhost:8080/noticia/registrar
    public String registrar() {
        return "noticia_form.html";
    }

    @PostMapping("/registrar")
    public String registro(@RequestParam String titulo, String cuerpo, ModelMap modelo) throws MiException {
        try {
            noticiaServicio.cargarNoticia(titulo, cuerpo);
            modelo.put("exito", "La noticia fue cargada correctamente.");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_form.html";
        }
        return "index.html";
    }

    @GetMapping("/lista")  //localhost:8080/noticia/lista
    public String listar(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "noticia_list.html";
    }

    @GetMapping("/listamodif")
    public String listarModif(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "noticia_modif.html";
    }

    @GetMapping("/listadel")
    public String listarDelete(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "noticia_del.html";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable String id, ModelMap modelo) {
        try {
            noticiaServicio.borrarNoticia(id);
            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_del.html";
        }
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "noticia_modificar.html";
    }

    @GetMapping("/leer/{id}")
    public String leer(@PathVariable String id, ModelMap modelo) {
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "noticia_leer.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String titulo, String cuerpo, ModelMap modelo) {
        try {
            noticiaServicio.modificarNoticia(titulo, cuerpo, id);
            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_modificar.html";
        }
    }

}
