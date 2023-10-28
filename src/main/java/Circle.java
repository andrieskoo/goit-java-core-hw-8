package shapes;



public class Circle extends Shape {

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private String name = "Circle";
    private double radius;
    private String color;

    @Override
    public void printName() {

    }
}
