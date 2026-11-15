package com.mercadito.mercadito.controller;

import com.mercadito.mercadito.entity.Producto;
import com.mercadito.mercadito.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        return productoService.obtenerProducto();
    }
}
