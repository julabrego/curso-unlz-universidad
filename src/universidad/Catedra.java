package universidad;

import java.util.ArrayList;

class Catedra {
    private String nombre;
    private Docente titular;
    private Docente ayudante;
    private ArrayList<Alumno> alumnos;
    private Aula aulaDondeSeDa;

    public Catedra(String nombre, Docente titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getTitular() {
        return titular;
    }

    public void setTitular(Docente titular) {
        this.titular = titular;
    }

    public Docente getAyudante() {
        return ayudante;
    }

    public void setAyudante(Docente ayudante) {
        this.ayudante = ayudante;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
    
    // BorrarAlumno

    public Aula getAulaDondeSeDa() {
        return aulaDondeSeDa;
    }

    public void setAulaDondeSeDa(Aula aulaDondeSeDa) {
        this.aulaDondeSeDa = aulaDondeSeDa;
    }
}
