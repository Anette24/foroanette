package com.anette.foro.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.anette.foro.modelo.Replica;

public interface RepoReplicas extends CrudRepository<Replica, Integer> {
  @Query(value="SELECT * FROM replica WHERE idtema=?", nativeQuery= true)
  ArrayList<Replica> filtrarPorTema(int idtema);
}
