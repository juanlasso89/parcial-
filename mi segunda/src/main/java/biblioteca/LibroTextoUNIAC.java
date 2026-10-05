package biblioteca;

/**
 * Libro de texto propio de la UNIAC, asociado además a una facultad.
 * Hereda de LibroTexto, que a su vez hereda de Libro (herencia multinivel).
 */
public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC() {
        super();
        this.facultad = "";
    }

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares,
                            int numeroEjemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroTextoUNIAC{" +
                "facultad='" + facultad + '\'' +
                "} " + super.toString();
    }
}
