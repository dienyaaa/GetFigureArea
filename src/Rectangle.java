public class Rectangle extends Figure {
    private double height, width;

    public Rectangle (double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    double getArea() {
        return height * width;
    }
}
