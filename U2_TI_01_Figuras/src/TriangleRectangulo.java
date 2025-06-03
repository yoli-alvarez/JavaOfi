public class TriangleRectangulo  extends FigureAbs{
    private double base;
    private double height;
    private double sidefirst;
    private double sidesecond;
    private double sidetthird;
    private double side;

    //primetro:
    //area: base * altura / 2
    public TriangleRectangulo(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public TriangleRectangulo(double base) {
        this.base = base;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {

        this.base = base;
    }

    public double getSidefirst() {

        return sidefirst;
    }
    public void setSidefirst(double sidefirst) {
        this.sidefirst = sidefirst;
    }

    public void setSidesecond(double side) {
        this.sidesecond = sidesecond;
    }

    public double getSidetthird() {
        return sidetthird;
    }
    public void setSidetthird(double side) {
        this.sidetthird = sidetthird;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return sidefirst + sidesecond + sidetthird;
    }

}
