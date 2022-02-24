package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByDescricaoContainingIgnoreCase(String descricao); 
	
	public List <Produto> findByPrecoBetween(BigDecimal start, BigDecimal end);
	
	Object findAllByNomeContainingIgnoreCase(String nome);
	
	public List <Produto> findAllByNomeContainingIgnoreCaseAndLaboratorioContainingIgnoreCase (String nome,String Laboratorio);
	
}
