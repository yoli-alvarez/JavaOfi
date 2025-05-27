public class CuentaBancaria {
    private String titular;
    private double saldo;

    //double getSaldo(); String getTitular() y void setTitular(String).
    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //suma a saldo (solo si monto > 0).
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        System.out.println("Depositaste: " + saldo);
    }

    // boolean retirar(double monto) →
    // si monto > 0 y saldo >= monto, resta y devuelve true, sino devuelve false.
    public boolean retirar(Double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente, intente con una cantidad menor ");
            return false;
        }
        System.out.println("Retiraste: " + saldo);
        return true;
    }




}
