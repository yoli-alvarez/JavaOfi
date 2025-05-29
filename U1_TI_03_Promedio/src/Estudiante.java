public class Estudiante {
    private String nombre;
    private String matricula;
    private double notas [];

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMatricula() {
        return matricula;

    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas(int i) {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calcularPromedio() {
    }
    public boolean aprobado(){
        if (calcularPromedio()>= 70){
            return true;
        }
    }





}


