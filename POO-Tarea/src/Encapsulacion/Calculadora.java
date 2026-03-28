package Encapsulacion;

public class Calculadora {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static Double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División entre cero no permitida.");
            return null;
        }
        return a / b;
    }
}