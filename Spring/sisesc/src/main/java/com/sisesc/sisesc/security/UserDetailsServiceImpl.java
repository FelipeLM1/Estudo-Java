package com.sisesc.sisesc.security;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

        Aluno aluno = alunoRepository.findByLogin(login);
        if (aluno == null) {
            throw new UsernameNotFoundException("Usuário não encontrado!");
        }
        return aluno;
    }
}
