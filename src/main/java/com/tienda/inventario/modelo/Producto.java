package com.tienda.inventario.modelo;
import jakarta.persistence.*;

// en esta parte es donde se coloca la entidad que representa un producto en la base de datos
@Entity
@Table(name = "Productos")

public class Producto {
    // identificamos el unico producto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // creamos los atributos de producto
    // creamos los el atributo nombres
    @Column(nullable = false)
    private String nombre;

    //creamos unos de categoria
    private String categoria;

    //creamos uno de talla
    private String talla;

    // creamos uno de precio
    private double precio;

    //creamos uno de stock
    private int stock;

    //creamos un constructor vacio
    public Producto() {}

    //creacion de los metodos get y set
    //creamos los metodos get y set para la llave primaria
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // creamos los metodos get y set para nombre
    public String getNombre() {return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    // creamos los metodos get y set para categoria
    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria){this.categoria = categoria;}

    // creamos los metodos get y set para talla
    public String getTalla(){return talla;}
    public void setTalla(String talla) {this.talla = talla;}

    // creamos los metodos get y set para precio

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public int getStock(){return stock;}
    public void setStock(int stock){this.stock = stock;}
}
