package br.gov.sp.fatec.projetotopicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetotopicos.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
