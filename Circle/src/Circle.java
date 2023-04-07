public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area = radius*radius * Math.PI;
        return area;
        // Реализуйте расчет площади
    }
    @Override
    public double getPerimeter() {
        double perimetr = 2 * Math.PI * radius;
        return perimetr;
        // Реализуйте расчет периметра
    }
}