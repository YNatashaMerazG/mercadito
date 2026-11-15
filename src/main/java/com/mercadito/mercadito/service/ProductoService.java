package com.mercadito.mercadito.service;

import com.mercadito.mercadito.entity.Producto;
import com.mercadito.mercadito.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerProducto(){
        return productoRepository.findAll();
    }
}
