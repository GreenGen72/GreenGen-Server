package com.generation.greengen.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.greengen.model.Produto;
// FIXME falta a notation de repository e indent

	public interface ProdutoRepository extends JpaRepository<Produto, Long> {
		public List <Produto> findAllByNomeContainingIgnoreCase(@Param ("nome") String nome);
}
