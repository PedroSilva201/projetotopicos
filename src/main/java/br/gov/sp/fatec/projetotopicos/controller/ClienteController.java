package br.gov.sp.fatec.projetotopicos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.gov.sp.fatec.projetotopicos.entity.Cliente;
import br.gov.sp.fatec.projetotopicos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value= "/cliente")
@CrossOrigin
public class ClienteController {
    @Autowired
    private ClienteService CliSevMed;

    @GetMapping(value ="/{email}")
    public List<Cliente> findByEmailContains(@PathVariable("email") String email){
        return CliSevMed.buscarPorEmail(email);
    }
    
}
