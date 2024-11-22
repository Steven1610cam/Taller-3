
public class Prueba {
    public static void main(String[] args) {
        // Creación de objetos Coche
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");

        // Llamada al método estático para mostrar el contador de coches
        Coche.mostrarContadorCoches(); // Debería mostrar: Total de coches creados: 3
    }
}