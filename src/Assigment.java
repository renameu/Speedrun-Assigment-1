import Models.Point;
import Models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\micro\\IdeaProjects\\nnn\\src\\Models\\source");

        Scanner scan = new Scanner(file);
        Shape shape = new Shape();
        Point Point = null;

        while (scan.hasNext()) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
            if (Point != null) {
                double distance = Point.distance(point);
                System.out.println("Расстояние между " + Point + " и " + point + " = " + distance);
            }
            Point = point;

        }
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Среднее значение: " + shape.getAverageSide());
        System.out.println("Длинная сторона: " + shape.getLongestSide());
    }
}
