public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = width * height;
        return area;
        // Реализуйте расчет площади прямоугольника
    }

    @Override
    public double getPerimeter() {
        double perimetr = 2 * width + 2 * height;
        // Реализуйте расчет периметра прямоугольника
        return perimetr;
    }
}