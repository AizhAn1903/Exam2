package exercise1;

import java.util.concurrent.Callable;

public class GeometryCalculator {
    public static void main(String[] args) {

         Circle circle = new Circle(5.0);
        System.out.println("Area of circle:" + circle.calcArea() +
                           "\n Perimeter of circle:" + circle.calcPerimeter() );

        Rectangle rectangle = new Rectangle(4.0,5.0);
        System.out.println("Area of rectangle:" + rectangle.calcArea() +
                           "\nPerimeter of rectangle:" + rectangle.calcPerimeter());

        Triangle triangle = new Triangle(3.0,4.0,5.0);
        System.out.println("Area of triangle:" + triangle.calcArea() +
                         "\n Perimeter of triangle:" + triangle.calcPerimeter());
    }
}
