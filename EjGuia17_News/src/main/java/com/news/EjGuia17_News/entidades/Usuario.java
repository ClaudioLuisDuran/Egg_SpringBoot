/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.EjGuia17_News.entidades;

import com.news.EjGuia17_News.enumeraciones.Rol;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ClaudioDuran
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) // asi funcionó y separa cada entidad en una tabla distinta.

//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  // me dio error

//@DiscriminatorColumn(name = "dType", discriminatorType = DiscriminatorType.STRING) // no funciono esa opcion
//@DiscriminatorValue("Usuario")  // no funciono esa opcion
public class Usuario {
    @Id
    @GeneratedValue (generator = "uuid")
    @GenericGenerator (name = "uuid", strategy = "uuid2")
    protected String id;
    
    protected String nombre;
    protected String email;
    protected String password;
    
    @Temporal (TemporalType.DATE)
    protected Date alta;
    
    @Enumerated(EnumType.STRING)
    protected Rol rol;
    protected Boolean activo;

    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
}
