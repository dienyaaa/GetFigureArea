public class Circle extends Figure{
    private static final double PI = Math.PI;
    private double diameter;

    public Circle (double diameter){
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}
