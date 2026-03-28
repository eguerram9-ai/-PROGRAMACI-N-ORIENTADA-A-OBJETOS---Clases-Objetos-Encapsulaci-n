package Encapsulacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 1: CLASE PERSONA =====");
        Persona p1 = new Persona("Juan", "Pérez", 25);
        Persona p2 = new Persona("María", "García", 30);
        Persona p3 = new Persona("Carlos", "López", 18);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        System.out.println("\n===== EJERCICIO 2: CLASE RECTÁNGULO =====");
        Rectangulo r1 = new Rectangulo(5, 3);
        Rectangulo r2 = new Rectangulo(4, 6);
        double area1 = r1.area();
        double area2 = r2.area();
        System.out.println("Rectángulo 1: base=5, altura=3 -> Área=" + area1 + ", Perímetro=" + r1.perimetro());
        System.out.println("Rectángulo 2: base=4, altura=6 -> Área=" + area2 + ", Perímetro=" + r2.perimetro());
        if (area1 > area2) {
            System.out.println("El rectángulo 1 tiene mayor área.");
        } else if (area2 > area1) {
            System.out.println("El rectángulo 2 tiene mayor área.");
        } else {
            System.out.println("Ambos rectángulos tienen la misma área.");
        }

        System.out.println("\n===== EJERCICIO 3: CLASE PRODUCTO =====");
        Producto prod1 = new Producto("001", "Laptop", 800.0);
        Producto prod2 = new Producto("002", "Mouse", 25.0);
        System.out.println("Productos originales:");
        prod1.mostrar();
        prod2.mostrar();
        prod1.aplicarDescuento(10); // 10% descuento
        prod2.aplicarDescuento(5);  // 5% descuento
        System.out.println("Productos con descuento:");
        prod1.mostrar();
        prod2.mostrar();

        System.out.println("\n===== EJERCICIO 4: CLASE CUENTA =====");
        Cuenta cuenta = new Cuenta("Ana Torres", 1000.0);
        cuenta.mostrarSaldo();
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.retirar(1500.0); // intento de retiro mayor al saldo
        cuenta.mostrarSaldo();

        System.out.println("\n===== EJERCICIO 5: CLASE LIBRO =====");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 96);
        Libro libro3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 576);
        libro1.mostrar();
        System.out.println("¿Es largo? " + (libro1.esLargo() ? "Sí" : "No"));
        libro2.mostrar();
        System.out.println("¿Es largo? " + (libro2.esLargo() ? "Sí" : "No"));
        libro3.mostrar();
        System.out.println("¿Es largo? " + (libro3.esLargo() ? "Sí" : "No"));

        System.out.println("\n===== EJERCICIO 6: CLASE CALCULADORA =====");
        double a = 10, b = 5;
        System.out.println("Números: a=" + a + ", b=" + b);
        System.out.println("Suma: " + Calculadora.sumar(a, b));
        System.out.println("Resta: " + Calculadora.restar(a, b));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(a, b));
        Double div = Calculadora.dividir(a, b);
        if (div != null) System.out.println("División: " + div);
        // Prueba división entre cero
        System.out.println("\nProbando división entre cero:");
        Double divCero = Calculadora.dividir(a, 0);
        if (divCero == null) System.out.println("No se puede dividir entre cero.");

        System.out.println("\n===== EJERCICIO 7: CLASE FECHA =====");
        Fecha f1 = new Fecha(15, 3, 2023);
        Fecha f2 = new Fecha(31, 4, 2023); // 31 de abril inválido
        Fecha f3 = new Fecha(29, 2, 2023); // febrero 29 no bisiesto (simplificado)
        f1.mostrarValidez();
        f2.mostrarValidez();
        f3.mostrarValidez();
    }
}