/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.EjGuia17_News.repositorios;

import com.news.EjGuia17_News.entidades.Periodista;
import com.news.EjGuia17_News.entidades.Usuario;
import com.news.EjGuia17_News.enumeraciones.Rol;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ClaudioDuran
 */
@Repository
public interface PeriodistaRepositorio extends JpaRepository<Usuario, String> {
    
//    public Usuario buscarPorEmail(String email);
    
        @Query("SELECT p FROM Periodista p WHERE p.email = :email") // Como esta en el video
    public Periodista buscarPorEmail (@Param("email") String email);  // Como esta en el video
    
    // para periodistas
    
//    @Query("SELECT p FROM Periodista p WHERE u.rol = :rol") 
//    public List<Periodista> findAllByRol(@Param("rol") Rol rol);

        @Query("SELECT p FROM Periodista p") 
    public List<Periodista> findAllByRol();

    
    
}
