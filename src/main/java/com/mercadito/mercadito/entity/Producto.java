package com.mercadito.mercadito.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    //CONSTRUCTORES
    public Producto(){
    }
    public Producto(String nombre){
        this.nombre = nombre;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }




}
