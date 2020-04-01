package com.sisesc.sisesc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Entity
@Table(name = "TB_ALUNO")
public class Aluno implements UserDetails {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAluno;

    @Column(unique=true)
    @NotBlank
    private String login;

    @NotBlank
    private String nome;

    @NotBlank
    private String senha;

    private Long[] livrosEmprestados = {0L,0L,0L};

    public Long[] getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Long[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }




    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
