import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private String codigo;
    private ArrayList<Curso> listaCurso;

    // Constructor
    public Carrera(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaCurso = new ArrayList<Curso>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    // Método para agregar un curso a la lista de cursos de la carrera
    public void agregarCurso(Curso objCurso) {
        this.listaCurso.add(objCurso);
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", listaCurso=" + listaCurso +
                '}';
    }
}
