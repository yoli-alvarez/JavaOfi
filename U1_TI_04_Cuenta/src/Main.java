//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
      CuentaBancaria cB = new CuentaBancaria();
      cB.depositar(1000.0);
      cB.retirar(200.0);
      cB.retirar(1000.0);
  }
}