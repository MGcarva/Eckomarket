package com.inventario.inventario.Inventario;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventarioService {

    private final InventarioRepository inventarioRepo;

    // CREATE
    public void createInventario(Inventario inventario) {
        inventarioRepo.save(inventario);
    }

    // READ: obtener todos los registros
    public List<Inventario> getAllInventarios() {
        return inventarioRepo.findAll();
    }

    // READ: obtener por ID
    public Optional<Inventario> getInventarioById(Integer id) {
        return inventarioRepo.findById(id);
    }

    // UPDATE
    public void updateInventario(Integer id, Inventario inventario) {
        if (inventarioRepo.existsById(id)) {
            inventario.setId(id); // Asegura que actualice el objeto correcto
            inventarioRepo.save(inventario);
        } else {
            throw new RuntimeException("Inventario no encontrado para actualizar");
        }
    }

    // DELETE
    public void deleteInventario(Integer id) {
        if (inventarioRepo.existsById(id)) {
            inventarioRepo.deleteById(id);
        } else {
            throw new RuntimeException("Inventario no encontrado para eliminar");
        }
    }
}
