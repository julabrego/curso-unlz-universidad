package universidad;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private Docente decano;
    private Direccion direccion;
    private ArrayList<Catedra> catedras;
    private ArrayList<Empleado> empleados;
    private ArrayList<Aula> aulas;

    public Facultad(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catedras = new ArrayList<Catedra>();
        this.empleados = new ArrayList<Empleado>();
        this.aulas = new ArrayList<Aula>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDecano() {
        return decano;
    }

    public void setDecano(Docente decano) {
        this.decano = decano;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Catedra> getCatedras() {
        return catedras;
    }

    public void agregarCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }
    
    // borrarCatedra

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
    // borrar empleado
    
        public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void agregarAula(Aula aula) {
        this.aulas.add(aula);
    }
    
    // borrarAula
    
    public String getDetalles(){
        String detalles = "Nombre: " + this.nombre + "\n"
                + "Decano: " + this.decano + "\n"
                + "Direccion: " + this.direccion.calle + " " + this.direccion.numero + "\n"
                + "Cátedras: \n";
        
        for(Catedra catedra : this.catedras){
            detalles += catedra.getNombre() + ",\n"
                    + "docente a cargo: " + catedra.getTitular().getNombre() + " " + catedra.getTitular().getApellidad() + "\n"
                    + "con " + catedra.getAlumnos().size() + " alumnos inscriptos";
            
            detalles += "Listado de alumnos: \n" + catedra.getAlumnosData();
            
        }
        
        return detalles;
    }
}
