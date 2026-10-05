package biblioteca;

/**
 * Un libro de texto asociado a un curso específico.
 * Hereda de Libro (herencia).
 */
public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto() {
        super();
        this.curso = "";
    }

    public LibroTexto(String titulo, String autor, int numeroEjemplares,
                       int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibroTexto{" +
                "curso='" + curso + '\'' +
                "} " + super.toString();
    }
}
