package Models;
public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point dest){
        double distX = this.x - dest.x;
        double distY = this.y - dest.y;
        return Math.sqrt(distX * distX + distY * distY);
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

