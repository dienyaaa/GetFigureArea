public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Circle(5.0);
        Figure figure2 = new Rectangle(5.0, 4.0);
        Figure larger = getLargerFigure(figure1, figure2);
        System.out.println("The larger figure is " + larger + " and it's area is " + larger.getArea());
    }

    public static Figure getLargerFigure(Figure figure1, Figure figure2) {
        return figure1.getArea() > figure2.getArea() ? figure1 : figure2;
    }
}
