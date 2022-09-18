package universidad;

import static java.lang.Math.random;
import randomGenerators.GeneradorDeNombresRandom;

public class Main {

    public static void main(String[] args) {
        // En primer lugar instancio Mi Universidad
        Universidad miUniversidad = new Universidad("Universidad de programación");

        // Luego creo las dos facultades que va a contener (usando funciones estáticas que creé para tal fin)
        Facultad facultadDeIngenieria = crearFacultadDeIngenieria();
        Facultad facultadDeCienciasSociales = crearFacultadDeCienciasSociales();

        // Creo las aulas de facultad de ingenieria, indicando sus capacidades
        Aula aulaIngenieria1 = new Aula(30);
        Aula aulaIngenieria2 = new Aula(38);
        Aula aulaIngenieria3 = new Aula(50);

        // Y las agrego a la facultad
        facultadDeIngenieria.agregarAula(aulaIngenieria1);
        facultadDeIngenieria.agregarAula(aulaIngenieria2);
        facultadDeIngenieria.agregarAula(aulaIngenieria3);

        // Ahora vinculo la cátedra con el aula que se vaya a usar para darla
        facultadDeIngenieria.getCatedras().get(0).setAulaDondeSeDa(aulaIngenieria1);
        facultadDeIngenieria.getCatedras().get(1).setAulaDondeSeDa(aulaIngenieria2);

        // Creo las aulas para la facultad de Cs Sociales, indicando sus capacidades
        Aula aulaCienciasSociales1 = new Aula(32);
        Aula aulaCienciasSociales2 = new Aula(25);
        Aula aulaCienciasSociales3 = new Aula(37);

        // Y las agrego a la facultad
        facultadDeCienciasSociales.agregarAula(aulaCienciasSociales1);
        facultadDeCienciasSociales.agregarAula(aulaCienciasSociales2);
        facultadDeCienciasSociales.agregarAula(aulaCienciasSociales3);

        // Ahora vinculo la cátedra con el aula que se vaya a usar para darla
        facultadDeCienciasSociales.getCatedras().get(0).setAulaDondeSeDa(aulaCienciasSociales1);
        facultadDeCienciasSociales.getCatedras().get(1).setAulaDondeSeDa(aulaCienciasSociales2);

        // Inscribo alumnos rándom a cada cátedra
        for (Catedra catedra : facultadDeIngenieria.getCatedras()) {
            String nombreDeCatedra = catedra.getNombre();
            
            int capacidadDeAulaDondeSeDa = catedra.getAulaDondeSeDa().getCapacidad();
            System.out.println("Cátedra " + nombreDeCatedra + " se da en un aula con capacidad de " + capacidadDeAulaDondeSeDa + " alumnos");
            
            for(int i = 0; i < capacidadDeAulaDondeSeDa; i++){
                catedra.agregarAlumno(crearAlumnoRandom());
            }
        }

        for (Catedra catedra : facultadDeCienciasSociales.getCatedras()) {
            String nombreDeCatedra = catedra.getNombre();
            
            int capacidadDeAulaDondeSeDa = catedra.getAulaDondeSeDa().getCapacidad();
            System.out.println("Cátedra " + nombreDeCatedra + " se da en un aula con capacidad de " + capacidadDeAulaDondeSeDa + " alumnos");
            
            for(int i = 0; i < capacidadDeAulaDondeSeDa; i++){
                catedra.agregarAlumno(crearAlumnoRandom());
            }
        }
        
        // Reviso que se hayan registrado esos alumnos
        System.out.println(facultadDeCienciasSociales.getCatedras().get(0).getAlumnos());
        System.out.println(facultadDeCienciasSociales.getCatedras().get(1).getAlumnos());
        System.out.println(facultadDeIngenieria.getCatedras().get(0).getAlumnos());
        System.out.println(facultadDeIngenieria.getCatedras().get(1).getAlumnos());

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
        // Creo a matemática y le seteo sus docentes
        Docente titularDeMatematica = new Docente(222, 40555666, "Bertrand", "Russell");
        Docente ayudanteDeMatematica = new Docente(767, 55678876, "Isaac", "Newton");
        Catedra matematica = new Catedra("Matemática", titularDeMatematica);
        matematica.setAyudante(ayudanteDeMatematica);

        // Creo a la cátedra/materia física y le seteo sus docentes
        Docente titularDeFisica = new Docente(333, 36122345, "Albert", "Einstein");
        Docente ayudanteDeFisica = new Docente(321, 44567654, "Juan", "Ayudante de física");
        Catedra fisica = new Catedra("Física", titularDeFisica);
        fisica.setAyudante(ayudanteDeFisica);

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
        // Creo a historia y seteo a sus docentes
        Docente titularDeHistoria = new Docente(111, 30545687, "Felipe", "Pigna");
        Docente ayudanteDeHistoria = new Docente(888, 20345678, "Noemí", "Goldman");
        Catedra historia = new Catedra("Historia", titularDeHistoria);
        historia.setAyudante(ayudanteDeHistoria);

        // Creo a semiología
        Docente titularDeSemiologia = new Docente(545, 44555666, "Pierre", "Bourdieu");
        Docente ayudanteDeSemiologia = new Docente(987, 33456780, "Ferdinand", "De Saussure");
        Catedra semiologia = new Catedra("Física", titularDeSemiologia);
        semiologia.setAyudante(ayudanteDeSemiologia);

        // Vinculo las cátedras creadas con la facultad
        facultadDeCienciasSociales.agregarCatedra(historia);
        facultadDeCienciasSociales.agregarCatedra(semiologia);

        // Devuelvo la nueva facultad 
        return facultadDeCienciasSociales;
    }

    static int legajo = 0;

    private static Alumno crearAlumnoRandom() {
        int dni = (int) Math.floor(random() * 9_000_000) + 1_000_000;
        Alumno nuevoAlumno = new Alumno(Main.legajo, dni, GeneradorDeNombresRandom.GeneradorDeNombresRandom(), GeneradorDeNombresRandom.GeneradorDeNombresRandom());
        Main.legajo++;
        return nuevoAlumno;
    }

}
