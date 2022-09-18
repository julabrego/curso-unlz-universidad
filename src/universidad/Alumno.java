package universidad;

public class Alumno extends Persona
        implements ObtenerNota, ObtenerPromedio {

    //Atributos
    private int legajo;

    //métodos estáticos
    public Alumno(int legajo, int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public int getNota() {
        return 10;
    }

    @Override
    public int getPromedio() {
        return 0;
    }

}
