
package universidad;

public class Docente extends Persona {
    
    private int matricula;

    public Docente(int matricula, int dni , String nombre, String apellido ){
        super(dni, nombre, apellido);
        this.matricula = matricula ;
    }
        
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
