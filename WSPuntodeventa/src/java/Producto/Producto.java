/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author Jose Antonio
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private String marca;
    private String descripcion;
    private float precioVenta;
    private float precioCompra;
    private String caducidad;
    private int stock;
    private int Medida_idMedida;
    private int Departamento_idDepartamento;
    private int Provedor_idProvedor;

    public Producto(int idProducto, String nombre, String marca, String descripcion, float precioVenta, float precioCompra, String caducidad, int stock, int Medida_idMedida, int Departamento_idDepartamento, int Provedor_idProvedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.caducidad = caducidad;
        this.stock = stock;
        this.Medida_idMedida = Medida_idMedida;
        this.Departamento_idDepartamento = Departamento_idDepartamento;
        this.Provedor_idProvedor = Provedor_idProvedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMedida_idMedida() {
        return Medida_idMedida;
    }

    public void setMedida_idMedida(int Medida_idMedida) {
        this.Medida_idMedida = Medida_idMedida;
    }

    public int getDepartamento_idDepartamento() {
        return Departamento_idDepartamento;
    }

    public void setDepartamento_idDepartamento(int Departamento_idDepartamento) {
        this.Departamento_idDepartamento = Departamento_idDepartamento;
    }

     public int getProvedor_idProvedor() {
        return Provedor_idProvedor;
    }

    public void setProvedor_idProvedor(int Provedor_idProvedor) {
        this.Provedor_idProvedor = Provedor_idProvedor;
    }
    
}
