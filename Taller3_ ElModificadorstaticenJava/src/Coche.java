public class Coche {
    
    private String marca;
    private String modelo;
    
    
    private static int contadorCoches = 0;

    // Constructor de la clase Coche
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; 
    }

    
    public static void mostrarContadorCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }
}

