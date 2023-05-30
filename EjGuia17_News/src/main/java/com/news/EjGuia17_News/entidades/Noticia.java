/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.EjGuia17_News.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ClaudioDuran
 */
@Entity
public class Noticia {
    @Id
    @GeneratedValue (generator = "uuid")
    @GenericGenerator (name = "uuid", strategy = "uuid2")
    private String id;
    private String titulo;
    
    @OneToOne
    private Periodista creador;
    
    @Column(name = "CUERPO", nullable = false, length = 3000)
    private String cuerpo;

    
    public Noticia() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    
}
