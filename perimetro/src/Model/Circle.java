package Model;

public class Circle {
    private double radius;
    private double base;
    private double altura;

          public double getPerimeter () {
          return radius * (8*8);
          }
    public double getArea(){
        return (altura * base)/2;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
              this.altura = altura;
    }
    public void setRadius(double radius){
              this.radius = radius;

    }
}
