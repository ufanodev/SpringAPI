package service;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import repo.ClienteRepo;

import java.util.List;
import java.util.Optional;

public class CliemteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public List<Cliente> getAllClients() {
        return clienteRepo.findAll();
    }

    @Override
    public Optional<Cliente> findById(int id) {
        return clienteRepo.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    public void deleteById(int id) {
        clienteRepo.deleteById(id);
    }
}
