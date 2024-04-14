package com.findtrack.repository;

import com.findtrack.entity.RegistroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroUsuarioRepository extends JpaRepository <RegistroUsuario, Long> {

}
