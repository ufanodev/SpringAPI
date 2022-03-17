package service;

import model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClienteService {

    List<Cliente> getAllClients();
    Optional<Cliente> findById(int id);
    Cliente save(Cliente cliente);
    void deleteById(int id);
}
