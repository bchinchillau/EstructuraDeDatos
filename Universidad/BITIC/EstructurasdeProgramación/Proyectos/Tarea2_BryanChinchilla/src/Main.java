import java.util.ArrayList;
import java.util.Date;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Creación tres instancias de la clase Carrera
        Carrera carrera1 = new Carrera("Ingeniería en Sistemas", "INS");
        Carrera carrera2 = new Carrera("Administración de Empresas", "ADM");
        Carrera carrera3 = new Carrera("Ingeniería Industrial", "INE");

        // Crear 6 instancias de la clase Curso
        Curso curso1 = new Curso("Programación I", "INF101", 60, 4);
        Curso curso2 = new Curso("Base de Datos", "INF102", 50, 3);
        Curso curso3 = new Curso("Contabilidad", "ADM101", 45, 3);
        Curso curso4 = new Curso("Proyecto 1", "PRO01", 40, 3);
        Curso curso5 = new Curso("Electrónica", "ELE01", 55, 4);
        Curso curso6 = new Curso("Ética", "ET102", 40, 3);

        // Asociar los cursos a la carrera
        carrera1.agregarCurso(curso1);
        carrera1.agregarCurso(curso2);
        carrera2.agregarCurso(curso3);
        carrera2.agregarCurso(curso4);
        carrera3.agregarCurso(curso5);
        carrera3.agregarCurso(curso6);

        // Crear un arreglo de lista
        ArrayList<Carrera> listaCarreras = new ArrayList<>();

        // Agregar los tres objetos carrera al arreglo
        listaCarreras.add(carrera1);
        listaCarreras.add(carrera2);
        listaCarreras.add(carrera3);

        // Imprimir en consola los objetos Carrera y sus cursos asociados
        for (Carrera carrera : listaCarreras) {
            System.out.println(carrera);
        }
    }
}