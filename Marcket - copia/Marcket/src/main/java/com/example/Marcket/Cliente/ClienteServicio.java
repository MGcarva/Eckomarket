package com.example.Marcket.Cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServicio {

    private final ClienteRepository clienteRepo;

    public void createCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepo.findAll();
    }

    public Optional<Cliente> getClienteById(Integer id) {
        return clienteRepo.findById(id);
    }

    public void updateCliente(Integer id, Cliente cliente) {
        if (clienteRepo.existsById(id)) {
            cliente.setId(id);
            clienteRepo.save(cliente);
        }
    }

    public void deleteCliente(Integer id) {
        clienteRepo.deleteById(id);
    }
}