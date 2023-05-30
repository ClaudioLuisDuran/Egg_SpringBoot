
package com.news.EjGuia17_News.servicios;

import com.news.EjGuia17_News.entidades.Noticia;
import com.news.EjGuia17_News.repositorios.NoticiaRepositorio;
import com.news.EjGuia17_News.excepciones.MiException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ClaudioDuran
 */
@Service
public class NoticiaServicio {
    @Autowired // inyeccion de dependencias
    NoticiaRepositorio noticiaRepositorio;
    
      // cargar nueva noticia
    @Transactional // para todo metodo que haga cambios en la base de datos
    public void cargarNoticia(String titulo, String cuerpo) throws MiException{
         validar(titulo,cuerpo);  
         Noticia noticia = new Noticia();
          noticia.setTitulo(titulo);
          noticia.setCuerpo(cuerpo);
         noticiaRepositorio.save(noticia);
    }
    
    // listar noticias cargadas
   public List<Noticia> listarNoticias(){
        List<Noticia> noticias = new ArrayList();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }
    
        // modificar noticia
    @Transactional // para todo metodo que haga cambios en la base de datos
    public void modificarNoticia(String titulo, String cuerpo, String id) throws MiException{
     validar(titulo,cuerpo);
     Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaRepositorio.save(noticia);
        }
    }
        
    //borrar noticia
    @Transactional // para todo metodo que haga cambios en la base de datos
    public void borrarNoticia(String id) throws MiException{
     Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticiaRepositorio.delete(noticia);
        }
    }
    
     //buscar noticia
    public Noticia getOne(String id) {
        return noticiaRepositorio.getOne(id);
    }    
       
      // manejo de errores
    private void validar(String titulo, String cuerpo) throws MiException{
         if (titulo.isEmpty() || titulo == null) {
             throw new MiException("El titulo de la nota no puede ser nulo o estar vacío.");
         }   
         if (cuerpo.isEmpty() || cuerpo == null) {
             throw new MiException("Elcuerpo de la nota no puede ser nulo o estar vacío.");
         }   
    }
    
}
