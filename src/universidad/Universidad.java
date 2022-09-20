package universidad;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private Docente rector;
    private ArrayList<Facultad> facultades;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.facultades = new ArrayList<Facultad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getRector() {
        return rector;
    }

    public void setRector(Docente rector) {
        this.rector = rector;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void agregarFacultad(Facultad facultad) {
        this.facultades.add(facultad);
    }
    
    //public void borrarFacultad(int indiceFacultad){
    //    this.facultades.remove(indiceFacultad)
    //}
}
