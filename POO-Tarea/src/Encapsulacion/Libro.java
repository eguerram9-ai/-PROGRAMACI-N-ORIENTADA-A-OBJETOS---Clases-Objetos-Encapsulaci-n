package Encapsulacion;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public boolean esLargo() {
        return paginas > 300;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas);
    }
}