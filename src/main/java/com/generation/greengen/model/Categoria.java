package com.generation.greengen.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "Identificador único para cada categoria no ecommerce. ", example = "1", required = true)
	private Long id;

	@NotBlank(message = "Obrigatório mínimo 5 e no máximo 255 caracteres")
	@Size(min = 5, max = 255)
	@Schema(description = "Armazena a descrição de cada categoria. ", example = "Aproveite ao máximo a energia do sol para iluminar seus ambientes com nossa vasta seleção de produtos de iluminação solar. ", required = true)
	private String descricao;

	@NotBlank(message = "Obrigatório mínimo 5 e no máximo 255 caracteres")
	@Size(min = 5, max = 255)
	@Schema(description = "Campo destinado ao armazenamento do nome dado para a categoria dos produtos.", example = "Energia solar", required = true)
	private String nome;

	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}
