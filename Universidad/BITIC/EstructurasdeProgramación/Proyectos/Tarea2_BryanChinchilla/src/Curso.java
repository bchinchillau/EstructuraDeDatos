public class Curso {
    private String nombre;
    private String codigo;
    private int horas;
    private int creditos;

    // Constructor
    public Curso(String nombre, String codigo, int horas, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas = horas;
        this.creditos = creditos;
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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", horas=" + horas +
                ", creditos=" + creditos +
                '}';
    }
}

