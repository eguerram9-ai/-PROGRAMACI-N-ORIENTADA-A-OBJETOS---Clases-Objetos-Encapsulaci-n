package Encapsulacion;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean esValida() {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > 31) return false;
        // Validación simple de días por mes (ignorando años bisiestos)
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) return false;
        } else if (mes == 2) {
            if (dia > 28) return false; // febrero siempre 28 días para simplificar
        }
        return true;
    }

    public void mostrarValidez() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + año + " -> " + (esValida() ? "Válida" : "Inválida"));
    }
}