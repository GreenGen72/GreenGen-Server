package com.generation.greengen.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "Identificador único para cada produto no ecommerce. ", example = "1", required = true)
	private long id;

	@NotBlank(message = "O atributo produto é obrigatorio!")
	@Size(min = 5, max = 100, message = "o atributo produto deve conter no minimo 05 e no máximo 100 caracteres")
	@Schema(description = "Armazena o nome do produto.", example = "John Doe", required = true)
	private String nome;

	@NotBlank(message = "O atributo descrição é obrigatorio!")
	@Size(min = 10, max = 1000, message = "o atributo descrição deve conter no minimo 10 e no máximo 1000 caracteres")
	@Schema(description = "Armazena a descrição de cada produto. ", example = "Painel Solar de 155W Monocristalino da marca Resun com o melhor preço para Energia Solar Fotovoltaica. Aprovado pelo INMETRO.", required = true)
	private String descricao;

	@Positive(message = "O atributo preço deve ser maior do que zero")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "O atributo preço é Obrigatório!")
	@Schema(description = "Armazena o preço do produto utilizando BigDecimal, com precisão para até 10 dígitos, sendo 2 decimais.. ", example = "1.99", required = true)
	private BigDecimal preco;

	@Schema(description = "Armazena a quantidade deste produto no estoque ", example = "1", required = true)
	private Long quantidade;

	@Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres")
	@Schema(description = "Armazena a foto do produto a partir da URL. ", example = "http://example.com/photo.jpg")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
	public Long getQuantidade() {
		return quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
