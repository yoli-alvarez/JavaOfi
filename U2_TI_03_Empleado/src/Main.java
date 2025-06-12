//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleadoTimpoCompleto = new EmpleadoTiempoCompleto("FAAR4", "Naoly", 15000,"CUENTA CON SEGURO COMPLETO");
        System.out.println("Tu salario es: " + empleadoTimpoCompleto.calcularSalario());

        Empleado empleadoPorHoras = new EmpleadoPorHoras("GAFAF2","NAOLY ",9000,54);
        System.out.println("Tu salario es de: " + empleadoPorHoras.calcularSalario() );
    }
}