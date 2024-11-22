public class Cuenta {
    private double saldo; 

    
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método estático que intenta acceder a un atributo no estático (Código Incorrecto)
    /*
    public static void modificarSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo; // Esto generará un error de compilación
    }
    */

    // Método corregido para modificar el saldo (No estático)
    public void modificarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo; // Ahora se puede acceder al saldo
    }

    // Método para mostrar el saldo
    public double getSaldo() {
        return saldo;
    }
}