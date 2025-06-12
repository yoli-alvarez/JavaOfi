public class EmpleadoTiempoCompleto extends Empleado{

    private String beneficios;

    public EmpleadoTiempoCompleto(String id, String nombre, double salario, String beneficios) {
        super(id, nombre, salario);
        this.beneficios = beneficios;
    }




    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}

