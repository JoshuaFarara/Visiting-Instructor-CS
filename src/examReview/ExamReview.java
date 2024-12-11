package examReview;


interface Resizable {
    void resize(double factor);
}

public class Circle extends Shape implements Resizable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized to radius " + radius);
    }
}

public class Rectangle extends Shape implements Resizable {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle with width " + width + " and height " + height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Rectangle resized to width " + width + " and height " + height);
    }
}