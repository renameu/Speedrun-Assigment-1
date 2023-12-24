package Models;
import java.util.ArrayList;

public class Shape {

    ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point){
        points.add(point);
    }

    public static double getPerimeter(double[] arr) {
        double sum = 0;
        for (double a : arr) {
            sum += a;
        }
        return sum;
    }
    public double getPerimeter() {
        return getPerimeter(getSides());
    }
    public double setAverageSide(double[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return getPerimeter(arr)/ arr.length;
    }
    public double getAverageSide() {
        return setAverageSide(getSides());
    }
    public static double setLongestSide(double[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public double getLongestSide() {
        return setLongestSide(getSides());
    }
    private double[] getSides() {
        int n = points.size();
        double[] sides = new double[n];
        for (int i = 0; i < n; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % n);
            sides[i] = currentPoint.distance(nextPoint);
        }
        return sides;
    }
}
