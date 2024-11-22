public class PruebaMatematicas {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;

        
        System.out.println("Suma: " + Matematicas.sumar(num1, num2)); 
        System.out.println("Resta: " + Matematicas.restar(num1, num2)); 
        System.out.println("Multiplicación: " + Matematicas.multiplicar(num1, num2)); 
        System.out.println("División: " + Matematicas.dividir(num1, num2)); 

        
        try {
            System.out.println("División por cero: " + Matematicas.dividir(num1, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Muestra: No se puede dividir entre cero
        }
    }
}