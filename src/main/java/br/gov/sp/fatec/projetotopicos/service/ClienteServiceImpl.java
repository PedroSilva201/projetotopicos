package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetotopicos.entity.Cliente;
import br.gov.sp.fatec.projetotopicos.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository cliRepo;

    @Override
    public List<Cliente> buscarPorEmail(String email){
        List<Cliente> clienteOptional = cliRepo.findByEmailContains(email);
            return clienteOptional;
    }
}
