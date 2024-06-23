// Nombre: [Tu Nombre]
// Apellido: [Tu Apellido]
// Legajo: [Tu Legajo]
// Fecha: 23/06/2024

public class Main {
    public static void main(String[] args) {
        Equipo[] equipos = {
            new Equipo("Racing", 18),
            new Equipo("Sarmiento", 16),
            new Equipo("Alte. Brown", 14),
            new Equipo("Juv. Unida", 13),
            new Equipo("Atenas", 12),
            new Equipo("Tiro Federal", 11),
            new Equipo("Alumni", 10),
            new Equipo("Arg. Peñarol", 9)
        };

        System.out.println("Equipos antes del ordenamiento:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }

        Quicksort.quicksort(equipos, 0, equipos.length - 1);

        System.out.println("\nEquipos después del ordenamiento:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }
}
