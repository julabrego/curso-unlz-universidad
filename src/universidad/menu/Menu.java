package universidad.menu;

import java.util.Scanner;
import universidad.Facultad;
import universidad.Universidad;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private boolean ejecutando = true;
    private int opcion;

    private Universidad universidad;

    public Menu(Universidad universidad) {
        this.universidad = universidad;
    }

    public void ejecutarMenu() {
        while (this.ejecutando) {
            this.menuPrincipal();

            switch (opcion) {
                case 0:
                    ejecutando = false;
                    break;
                case 1:
                    gestionarFacultades();
                    break;
                case 2:
                    System.out.println("en desarrollo");
                    break;
                case 3:
                    System.out.println("en desarrollo");
                    break;
                default:
                    System.out.println("en desarrollo");
                    break;
            }
        }
    }

    private void menuPrincipal() {
        System.out.println("Universidad: " + this.universidad.getNombre());
        System.out.println("\n");

        System.out.println("Elija una opción:");
        System.out.println("1) Gestionar facultades");
        System.out.println("2) Gestionar docentes");
        System.out.println("3) Gestionar alumnos");
        System.out.println("0) Salir");

        this.opcion = input.nextInt();
        input.nextLine();
    }

    private void gestionarFacultades() {
        System.out.println("Elija la facultad que desea ver: ");
        int i = 1;
        if (this.universidad.getFacultades() != null) {

            for (Facultad facultad : this.universidad.getFacultades()) {
                System.out.println(i + ") " + facultad.getNombre());
                i++;
            }
        } else {
            System.out.println("No hay facultades registradas");
        }
        System.out.println("0) Volver");

        opcion = input.nextInt();
        input.nextLine();

        if (opcion != 0) {
            opcion--;
            if (opcion < this.universidad.getFacultades().size()) {
                this.verDetallesFacultad(this.universidad.getFacultades().get(opcion));
            } else {
                System.out.println("Opción incorrecta");
                gestionarFacultades();
            }
        }
    }

    private void verDetallesFacultad(Facultad facultad) {
        System.out.println(facultad.getDetalles());
    }
}
