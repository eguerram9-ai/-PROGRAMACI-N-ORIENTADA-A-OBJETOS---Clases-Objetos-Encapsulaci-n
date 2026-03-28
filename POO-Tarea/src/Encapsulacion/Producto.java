package Encapsulacion;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            precio = precio - (precio * porcentaje / 100);
        } else {
            System.out.println("Porcentaje inválido. No se aplicó descuento.");
        }
    }

    public void mostrar() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Precio: $" + precio);
    }
}