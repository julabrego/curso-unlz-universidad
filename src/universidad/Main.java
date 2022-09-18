package universidad;

public class Main {

    public static void main(String[] args) {
        // En primer lugar instancio Mi Universidad
        Universidad miUniversidad = new Universidad("Universidad de programación");

        // Luego creo las dos facultades que va a contener (usando funciones estáticas que creé para tal fin)
        Facultad facultadDeIngenieria = crearFacultadDeIngenieria();
        Facultad facultadDeCienciasSociales = crearFacultadDeCienciasSociales();
         
    }

    private static Facultad crearFacultadDeIngenieria() {
        // Creo la Facultad de Ingeniería
        // Primero instancio y seteo su dirección
        Direccion direccionFacultadDeIngenieria = new Direccion();
        direccionFacultadDeIngenieria.provincia = "Buenos Aires";
        direccionFacultadDeIngenieria.ciudad = "Lomas de Zamora";
        direccionFacultadDeIngenieria.codigoPostal = 1832;
        direccionFacultadDeIngenieria.calle = "Sarasa";
        direccionFacultadDeIngenieria.numero = 100;
        
        Facultad facultadDeIngenieria = new Facultad("Facultad de Ingeniería", direccionFacultadDeIngenieria);
        
        // Creo al decano 
        Docente decanoIngenieria = new Docente(123, 50123456, "Juan Carlos", "Decano");
        facultadDeIngenieria.setDecano(decanoIngenieria);
        
        // Creo sus cátedras/materias
        // Creo a matemática
        Docente titularDeMatematica = new Docente(222, 40555666, "María", "Matemática");
        Catedra matematica = new Catedra("Matemática", titularDeMatematica);
        
        // Creo a física
        Docente titularDeFisica = new Docente(333, 36122345, "Juan", "Profe Física");
        Catedra fisica = new Catedra("Física", titularDeFisica);
        
        // Vinculo las cátedras creadas con la facultad
        facultadDeIngenieria.agregarCatedra(matematica);
        facultadDeIngenieria.agregarCatedra(fisica);
        
        // Devuelvo la nueva facultad 
        return facultadDeIngenieria;
    }
    
    private static Facultad crearFacultadDeCienciasSociales() {
        // Y luego creo la Facultad de Cs. Sociales
        // Primero instancio y seteo su dirección
        Direccion direccionFacultadDeCienciasSociales = new Direccion();
        direccionFacultadDeCienciasSociales.provincia = "Buenos Aires";
        direccionFacultadDeCienciasSociales.ciudad = "Turdera";
        direccionFacultadDeCienciasSociales.codigoPostal = 1832;
        direccionFacultadDeCienciasSociales.calle = "Hipólito Yrigoyen";
        direccionFacultadDeCienciasSociales.numero = 7512;

        Facultad facultadDeCienciasSociales = new Facultad("Facultad de Ciencias Sociales", direccionFacultadDeCienciasSociales);
        
        // Creo al decano 
        Docente decanoIngenieria = new Docente(123, 50123456, "Juan Carlos", "Decano");
        facultadDeCienciasSociales.setDecano(decanoIngenieria);
        
        // Creo sus cátedras/materias
        // Creo a historia
        Docente titularDeHistoria = new Docente(111, 30545687, "Felipe", "Pigna");
        Catedra historia = new Catedra("Historia", titularDeHistoria);
        
        // Creo a semiología
        Docente titularDeSemiologia = new Docente(545, 44555666, "Pierre", "Bourdieu");
        Catedra semiologia = new Catedra("Física", titularDeSemiologia);
        
        // Vinculo las cátedras creadas con la facultad
        facultadDeCienciasSociales.agregarCatedra(historia);
        facultadDeCienciasSociales.agregarCatedra(semiologia);
        
        // Devuelvo la nueva facultad 
        
        return facultadDeCienciasSociales;
    }

}
