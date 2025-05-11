package com.inventario.inventario.Inventario;

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
@RequestMapping("/inventario")
@RequiredArgsConstructor
public class InventarioController {
  
    private final InventarioService inventarioService;

    // CREATE
    @PostMapping
    public void createInventario(@RequestBody Inventario inventario) {
        inventarioService.createInventario(inventario);
    }

    // READ: obtener todos
    @GetMapping
    public List<Inventario> getAllInventarios() {
        return inventarioService.getAllInventarios();
    }

    // READ: obtener por ID
    @GetMapping("/{id}")
    public Inventario getInventarioById(@PathVariable Integer id) {
        return inventarioService.getInventarioById(id)
                .orElseThrow(() -> new RuntimeException("Inventario no encontrado"));
    }

    // UPDATE
    @PutMapping("/{id}")
    public void updateInventario(@PathVariable Integer id, @RequestBody Inventario inventario) {
        inventarioService.updateInventario(id, inventario);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteInventario(@PathVariable Integer id) {
        inventarioService.deleteInventario(id);
    }
}
