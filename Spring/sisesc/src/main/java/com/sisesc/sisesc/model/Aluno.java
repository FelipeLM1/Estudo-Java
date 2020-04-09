package com.sisesc.sisesc.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "TB_ALUNO")
public class Aluno implements UserDetails, Comparable<Aluno>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAluno;

    @Column(unique = true)
    @NotBlank
    private String login;

    @NotBlank
    private String nome;

    @NotBlank
    @Size(min = 4)
    private String senha;

    private Long[] livrosEmprestados = new Long[3];

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
    public String toString() {
        return "Aluno{" +
                "idAluno=" + idAluno +
                ", login='" + login + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", livrosEmprestados=" + Arrays.toString(livrosEmprestados) +
                '}';
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


    @Override
    public int compareTo(Aluno o) {
        return this.idAluno.compareTo(o.getIdAluno());
    }
}
