package com.tienda.inventario.servicio;

import com.tienda.inventario.modelo.Producto;
import com.tienda.inventario.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// Clase que contiene toda la lógica del negocio
@Service
public class ProductoService {

    // Inyectamos el repositorio para poder usarlo
    @Autowired
    private ProductoRepository productoRepository;

    // Guarda un producto nuevo en la base de datos
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Trae todos los productos de la base de datos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Busca un producto por su ID
    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    // Actualiza un producto existente
    public Producto actualizarProducto(Long id, Producto producto) {
        producto.setId(id);
        return productoRepository.save(producto);
    }

    // Elimina un producto por su ID
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}