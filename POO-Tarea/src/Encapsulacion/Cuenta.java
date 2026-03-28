package Encapsulacion;

public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de $" + monto + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo - monto >= 0) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Retiro no permitido. Saldo insuficiente o monto inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + ", Saldo actual: $" + saldo);
    }
}