// Nombre: Linda Candela 
// Apellido: Paz
// Fecha: 23/06/2024

public class Quicksort {

    public static void quicksort(Equipo[] equipos, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(equipos, inicio, fin);
            quicksort(equipos, inicio, indiceParticion - 1);
            quicksort(equipos, indiceParticion + 1, fin);
        }
    }

    private static int particion(Equipo[] equipos, int inicio, int fin) {
        Equipo pivote = equipos[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (equipos[j].puntos >= pivote.puntos) { // Ordenar de mayor a menor
                i++;
                Equipo temp = equipos[i];
                equipos[i] = equipos[j];
                equipos[j] = temp;
            }
        }
        Equipo temp = equipos[i + 1];
        equipos[i + 1] = equipos[fin];
        equipos[fin] = temp;
        return i + 1;
    }
}
