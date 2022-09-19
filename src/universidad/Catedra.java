package universidad;

import java.util.ArrayList;
import utilidades.Color;

class Catedra {
    private String nombre;
    private Docente titular;
    private Docente ayudante;
    private ArrayList<Alumno> alumnos;
    private Aula aulaDondeSeDa;

    public Catedra(String nombre, Docente titular) {
        this.nombre = nombre;
        this.titular = titular;
        
        // Es necesario instanciar un ArrayList vacío para que podamos agregar información luego
        this.alumnos = new ArrayList<Alumno>();
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
        if(this.alumnos.size() <= this.aulaDondeSeDa.getCapacidad()){
            this.alumnos.add(alumno);
            System.out.println(Color.GREEN + "Alumno " + alumno.getNombre() + " " + alumno.getApellidad() + " agregado correctamente." + Color.RESET);
        }else{
            System.out.println(Color.RED + "El aula alcanzó su capacidad máxima y no se pudo agregar el alumno " + alumno.getNombre() + " " + alumno.getApellidad() + Color.RESET);
        }
    }
    
    // BorrarAlumno

    public Aula getAulaDondeSeDa() {
        return aulaDondeSeDa;
    }

    public void setAulaDondeSeDa(Aula aulaDondeSeDa) {
        this.aulaDondeSeDa = aulaDondeSeDa;
    }
    
    public String getAlumnosData(){
        String alumnosData = "";
        for(Alumno alumno : this.alumnos){
            alumnosData += String.format("Legajo: %o\nDni: %o\nNombre y apellido: %s %s\n\n", alumno.getLegajo(), alumno.getDni(), alumno.getNombre(), alumno.getApellidad());
        }
        return alumnosData;
    }
}
