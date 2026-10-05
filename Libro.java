package biblioteca;

/**
 * Clase base que representa un libro genérico de la biblioteca.
 * Aplica encapsulamiento: todos los atributos son privados y se
 * accede a ellos mediante métodos get/set.
 */
public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    /** Constructor por defecto: crea un libro "vacío". */
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    /** Constructor con parámetros. */
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // ---------- Getters y Setters ----------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // ---------- Comportamiento ----------

    /**
     * Registra el préstamo de un ejemplar.
     * @return true si había ejemplares disponibles y se pudo prestar,
     *         false si ya no quedaban ejemplares disponibles.
     */
    public boolean prestamo() {
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    /**
     * Registra la devolución de un ejemplar.
     * @return true si había ejemplares prestados y se pudo devolver,
     *         false si no había ejemplares prestados para devolver.
     */
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados +
                '}';
    }
}
