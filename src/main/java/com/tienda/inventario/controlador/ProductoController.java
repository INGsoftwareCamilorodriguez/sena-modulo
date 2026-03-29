package com.tienda.inventario.controlador;

import com.tienda.inventario.modelo.Producto;
import com.tienda.inventario.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Clase que recibe y responde las peticiones del usuario
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    // Inyectamos el servicio para poder usarlo
    @Autowired
    private ProductoService productoService;

    // Trae todos los productos → GET http://localhost:8080/api/productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    // Busca un producto por ID → GET http://localhost:8080/api/productos/1
    @GetMapping("/{id}")
    public Producto buscarProducto(@PathVariable Long id) {
        return productoService.buscarPorId(id);
    }

    // Guarda un producto nuevo → POST http://localhost:8080/api/productos
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    // Actualiza un producto → PUT http://localhost:8080/api/productos/1
    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id,
                                       @RequestBody Producto producto) {
        return productoService.actualizarProducto(id, producto);
    }

    // Elimina un producto → DELETE http://localhost:8080/api/productos/1
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "Producto eliminado correctamente";
    }
}