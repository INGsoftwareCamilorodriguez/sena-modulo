package com.tienda.inventario.repositorio;

import com.tienda.inventario.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interfaz que maneja todas las operaciones con la base de datos
// JpaRepository ya trae métodos listos: guardar, buscar, eliminar, listar
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Spring genera automáticamente todos los métodos CRUD
}