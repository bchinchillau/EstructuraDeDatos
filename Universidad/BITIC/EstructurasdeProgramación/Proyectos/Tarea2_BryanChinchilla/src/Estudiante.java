import java.util.Date;
public class Estudiante {
    private String nombre;
    private String cedula;
    private Date nacimiento;

    // Constructor
    public Estudiante(String nombre, String cedula, Date nacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nacimiento = nacimiento;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}


