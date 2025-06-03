public class TriangleEquilatero extends FigureAbs {
    //Isoseles
    //perimetro: lado * 3
    //area: base * altura / 2
    private double height;
    private double side;
    private double base;

    public TriangleEquilatero(double height, double side, double base) {
        this.height = height;
        this.side = side;
        this.base = base;
    }
    public double getHeight() {

        return height;
    }

    public double getSide() {

        return side;
    }
    public double getBase() {

        return base;
    }
    public double setHeight(double height) {

        this.height = height;
    }

    public double setSide(double side) {

        this.side = side;
    }
    public double setBase(double base) {

        this.base = base;
    }
    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter(){
        return 3*side;
    }

    
}
