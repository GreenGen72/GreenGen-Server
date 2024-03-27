package com.generation.greengen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.greengen.model.Categoria;
// FIXME falta a indent

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
