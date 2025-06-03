import javax.management.modelmbean.ModelMBean;

TriangleRectangulo;
TriangleEquilatero;
TriangleIsoseles;
Circle;
Square;
FigureAbs;

public class Main {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new TriangleIsoseles(20, 25, 20);
        FigureAbs trianglequi = new TriangleEquilatero(20,15,20);
        FigureAbs trianrec = new TriangleRectangulo(20,15,25);

        FigureAbs[] figures = { sq, cir, triangle , trianglequi,trianrec };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}

void main() {
}