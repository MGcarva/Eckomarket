package com.example.Marcket.Cliente;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteServicio clienteServicio;  

    @PostMapping
    public void createCliente(@RequestBody Cliente cliente) {
        clienteServicio.createCliente(cliente);
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteServicio.getAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Integer id) {
        return clienteServicio.getClienteById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    @PutMapping("/{id}")
    public void updateCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        clienteServicio.updateCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Integer id) {
        clienteServicio.deleteCliente(id);
    }
}
