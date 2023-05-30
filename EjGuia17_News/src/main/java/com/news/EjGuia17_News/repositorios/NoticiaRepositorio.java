/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.EjGuia17_News.repositorios;

import com.news.EjGuia17_News.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ClaudioDuran
 */
@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String>{
 
}
    

