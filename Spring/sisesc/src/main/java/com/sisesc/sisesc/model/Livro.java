package com.sisesc.sisesc.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TB_LIVRO")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLivro;

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @NotBlank
    private int QuantidadeDisponivel;

    @NotBlank
    private String Categoria;

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long id) {
        this.idLivro = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeDisponivel() {
        return QuantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        QuantidadeDisponivel = quantidadeDisponivel;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
}
