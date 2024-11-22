
public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000.0);
        
        
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        
        cuenta.modificarSaldo(1500.0);
        
        
        System.out.println("Saldo modificado: " + cuenta.getSaldo());
    }
}