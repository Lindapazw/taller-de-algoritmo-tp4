// Nombre: Linda Candela 
// Apellido: Paz
// Fecha: 23/06/2024

class Equipo {
    String nombre;
    int puntos;
    
    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
