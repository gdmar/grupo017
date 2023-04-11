package ar.edu.unju.fi.ejercicio18.model.domain;

public class Producto {
    private String nombre;
    private int codigo;
    private double precio;
    private String categoria;
    private int descuento;
    
    /**
     * Constructor parametrizado de la clase Producto.
     * @param nombre
     * @param codigo
     * @param precio
     * @param categoria
     * @param descuento
     */
    public Producto(String nombre, int codigo, double precio, String categoria, int descuento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        this.descuento = descuento;
    }

    /**
     * Método que devuelve el valor del campo nombre del producto
     * @return string 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna un valor al campo nombre del producto.
     * @param nombre string
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el valor del código del producto.
     * @return int.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método que asigna un valor al campo código de producto.
     * @param codigo int.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método que devuelve el valor del precio del producto.
     * @return double.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que asigna un valor al campo precio del producto.
     * @param precio double.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve el valor de la categoría del producto.
     * @return String.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método que asigna un valor al campo categoría del producto.
     * @param categoria String
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método que devuelve el valor del descuento del producto.
     * @return int
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Método que asigna un valor al campo descuento del producto.
     * @param descuento int.
     */
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    /**
     * Método que devuelve el precio del producto con descuento.
     * @return double
     */
    public double calcularDescuento() {
        return this.precio - this.descuento;
    }

    

    
}
