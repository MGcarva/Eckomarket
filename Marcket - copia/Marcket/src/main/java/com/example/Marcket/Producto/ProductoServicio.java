package com.example.Marcket.Producto;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoServicio {

    private final ProductoRepository productoRepo;

    public void createProducto(Producto producto) {
        productoRepo.save(producto);
    }

    public List<Producto> getAllProductos() {
        return productoRepo.findAll();
    }

    public Optional<Producto> getProductoById(Integer id) {
        return productoRepo.findById(id);
    }

    public void updateProducto(Integer id, Producto producto) {
        if (productoRepo.existsById(id)) {
            producto.setId(id);
            productoRepo.save(producto);
        }
    }

    public void deleteProducto(Integer id) {
        productoRepo.deleteById(id);
    }
}