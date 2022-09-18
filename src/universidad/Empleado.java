package universidad;

public class Empleado extends Persona {
    
    private int cuil;

    public Empleado(int cuil, int dni , String nombre, String apellido){
        super(dni, nombre, apellido);
        this.cuil = cuil ;
    }
        
    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
    
    
}
