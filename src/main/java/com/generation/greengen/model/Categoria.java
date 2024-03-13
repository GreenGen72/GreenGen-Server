package com.generation.greengen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_categorias;

  @NotBlank(message = "Obrigatório mínimo 5 e no máximo 255 caracteres")
  @Size(min = 5, max = 255)
  private String descricao;

  @NotBlank(message = "Obrigatório mínimo 5 e no máximo 255 caracteres")
  @Size(min = 5, max = 255)
  private String nome;

  public Long getId_categorias() {
    return this.id_categorias;
  }

  public void setId_categorias(Long id_categorias) {
    this.id_categorias = id_categorias;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}