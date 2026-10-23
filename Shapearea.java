abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
}
@Override
 double area() {
 return length * width;
}
}
class Triangle extends Shape {
double base;
double height;
Triangle(double base, double height) {
this.base = base;
this.height = height;
    }
@Override
double area() {
return 0.5 * base * height;
}
}
public class Shapearea {
public static void main(String[] args) {
Shape[] shapes = new Shape[3];
shapes[0] = new Circle(7);
shapes[1] = new Rectangle(5, 4);
shapes[2] = new Triangle(6, 8);
System.out.printf("Circle area: %.2f%n",
shapes[0].area());
System.out.printf("Rectangle area: %.1f%n",
shapes[1].area());
 System.out.printf("Triangle area: %.1f%n",
shapes[2].area());
    }
}