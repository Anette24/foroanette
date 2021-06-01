package com.anette.foro.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.anette.foro.modelo.Tema;


public interface RepoTemas extends CrudRepository<Tema, Integer> {
@Query (value="Select * FROM temas", nativeQuery=true)
ArrayList<Tema> todos();
}
