package com.anette.foro.servicios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.anette.foro.modelo.Usuario;

public interface RepoUsuario extends CrudRepository<Usuario, Integer>{

	@Query(value= "SELECT* FROM usuario WHERE correoe=?1 AND claveacceso= ?2", nativeQuery=true)
	Usuario validar (String correoe, byte[] claveacceso);
}
