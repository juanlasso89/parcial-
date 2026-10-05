package biblioteca;

/**
 * Una novela, que puede ser de distintos tipos.
 * Hereda de Libro (herencia).
 */
public class Novela extends Libro {

    /** Tipos de novela permitidos según el enunciado. */
    public enum TipoNovela {
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURAS
    }

    private TipoNovela tipo;

    public Novela() {
        super();
        this.tipo = null;
    }

    public Novela(String titulo, String autor, int numeroEjemplares,
                  int numeroEjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.tipo = tipo;
    }

    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela{" +
                "tipo=" + tipo +
                "} " + super.toString();
    }
}
