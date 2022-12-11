package br.gov.sp.fatec.projetotopicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.projetotopicos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente , Long>{
    public List <Cliente> findByEmailContains(String email);
}
