package com.mercadito.mercadito.repository;

import com.mercadito.mercadito.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
