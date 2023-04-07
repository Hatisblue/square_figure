import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название фигуры площадь которой хотите получить");
        String shapeName = scanner.nextLine().toLowerCase();

        if (shapeName.equals("circle")) {
            System.out.println("Введите радиус");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.printf("Площадь: %.2f%n", circle.getArea());
            System.out.printf("Периметр: %.2f%n", circle.getPerimeter());
        } else if (shapeName.equals("rectangle")) {
            System.out.println("Введите длину(высоту) прямоугольника)");
            double heigth = scanner.nextDouble();
            System.out.println("Введите ширину прямоугольника)");
            double weigth = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(weigth,heigth);
            System.out.printf("Площадь: %.2f%n", rectangle.getArea());
            System.out.printf("Периметр: %.2f%n", rectangle.getPerimeter());
        } else {
            System.out.println("Введите Circle или Rectangle");

        }

        }

}
