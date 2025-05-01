package com.example.Marcket.Producto;

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
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoServicio productoServicio;

    @PostMapping
    public void createProducto(@RequestBody Producto producto) {
        productoServicio.createProducto(producto);
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoServicio.getAllProductos();
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Integer id) {
        return productoServicio.getProductoById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    @PutMapping("/{id}")
    public void updateProducto(@PathVariable Integer id, @RequestBody Producto producto) {
        productoServicio.updateProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Integer id) {
        productoServicio.deleteProducto(id);
    }
}
