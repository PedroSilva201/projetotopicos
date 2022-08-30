package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetotopicos.entity.Usuario;
import br.gov.sp.fatec.projetotopicos.repository.UsuarioRepository;

@Service
public class SegurancaServiceImpl implements SegurancaService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    @Override
    public Usuario novoUsuario(String nome, String senha) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSenha(senha);
        return novoUsuario(usuario);
    }

    @Override
    public List<Usuario> todosUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioOptional = usuarioRepo.findById(id);
        if(usuarioOptional.isPresent()) {
            return usuarioOptional.get();
        }
        throw new RuntimeException("Usuario nao encontrado!");
    }
    
}
