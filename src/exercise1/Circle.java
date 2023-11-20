package exercise1;

public class Circle extends AbstractShape{
    private Double radius;
    final Double PI = 3.14;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return PI * radius * 2;
    }
}
