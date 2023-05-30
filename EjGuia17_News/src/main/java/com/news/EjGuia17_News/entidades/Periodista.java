
package com.news.EjGuia17_News.entidades;


import com.news.EjGuia17_News.enumeraciones.Rol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 *
 * @author ClaudioDuran
 */
@Entity
//@DiscriminatorValue("Periodista")
public class Periodista extends Usuario implements Serializable{
   
    private Integer sueldoMensual;

    private ArrayList<Noticia> misNoticias;
    

    public Periodista() {
    }

    public Integer getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Integer sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public ArrayList<Noticia> getMisNoticias() {
        return misNoticias;
    }

    public void setMisNoticias(ArrayList<Noticia> misNoticias) {
        this.misNoticias = misNoticias;
    }

    public Periodista(Integer sueldoMensual, ArrayList<Noticia> misNoticias) {
        this.sueldoMensual = sueldoMensual;
        this.misNoticias = misNoticias;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
