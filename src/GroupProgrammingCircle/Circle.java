package GroupProgrammingCircle;
public class Circle {

    private double r = 1;
    private String c = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getRadius() {
        return r;
    }

    public double getArea(double r) {
        double area = Math.PI * Math.pow(r,r);
        return area;
    }
        public double getArea() {
        double area = Math.PI * Math.sqrt(r);
        return area;
    }

}
