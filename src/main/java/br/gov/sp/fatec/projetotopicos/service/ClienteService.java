package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;
import br.gov.sp.fatec.projetotopicos.entity.Cliente;

public interface ClienteService {
    public List<Cliente> buscarPorEmail(String email);
    
}
