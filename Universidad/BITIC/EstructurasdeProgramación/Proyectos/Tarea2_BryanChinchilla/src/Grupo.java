public class Grupo {
    private String horario;
    private String codigo;
    private boolean estado;

    // Constructor
    public Grupo(String horario, String codigo, boolean estado) {
        this.horario = horario;
        this.codigo = codigo;
        this.estado = estado;
    }

    // Getters y setters
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "horario='" + horario + '\'' +
                ", codigo='" + codigo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
