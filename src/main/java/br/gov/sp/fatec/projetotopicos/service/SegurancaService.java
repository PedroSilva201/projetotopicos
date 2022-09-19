package br.gov.sp.fatec.projetotopicos.service;

import br.gov.sp.fatec.projetotopicos.entity.Usuario;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface SegurancaService extends UserDetailsService {
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPorId(Long id);

}
