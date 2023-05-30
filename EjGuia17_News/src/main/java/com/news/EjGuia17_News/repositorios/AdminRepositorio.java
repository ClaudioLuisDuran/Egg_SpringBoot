
package com.news.EjGuia17_News.repositorios;

import com.news.EjGuia17_News.entidades.Administrador;
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
public interface AdminRepositorio extends JpaRepository<Administrador, String> {
    
    
    @Query("SELECT a FROM Administrador a WHERE a.email = :email") // Como esta en el video
    public Administrador buscarPorEmail (@Param("email") String email);  // Como esta en el video
    
    // para admins
    
    @Query("SELECT a FROM Administrador a WHERE a.rol = :rol") 
    public List<Administrador> findAllByRol(@Param("rol") Rol rol);

}
