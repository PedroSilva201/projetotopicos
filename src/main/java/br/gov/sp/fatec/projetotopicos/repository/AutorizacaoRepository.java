package br.gov.sp.fatec.projetotopicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetotopicos.entity.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {
    
    public Autorizacao findByNome(String nome);

}
