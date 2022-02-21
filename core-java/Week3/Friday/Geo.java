package Week3.Friday;

interface shape {
    void draw();
}

interface polygon {

    double getArea();

    double getPerimeter();

    boolean isPolygon();
}

class Line implements shape {
    @Override
    public void draw() {
        System.out.println("I am of line shape");
    }
}

class Triangle implements polygon, shape {
    double side1;
    double side2;
    double side3;
    double area;
    double perimeter;
    int noOfSides;
    double s;

    Triangle(double side1, double side2, double side3) {
        side1 = this.side1;
        side2 = this.side2;
        side3 = this.side3;
        perimeter = side1 + side2 + side3;
        s = perimeter / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void draw() {
        System.out.println("I am of Triangle shape");
    }

    @Override
    public double getArea() {

        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public boolean isPolygon() {
        return true;
    }

}

class Rectangle implements shape, polygon {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("I am of Rectangle Shape");

    }

    @Override
    public double getArea() {
        return (this.length * this.breadth);
    }

    @Override
    public double getPerimeter() {
        return (2 * (this.length + this.breadth));
    }

    @Override
    public boolean isPolygon() {
        return true;
    }
}

public class Geo {
    public static void main(String[] args) {
        Line line = new Line();
        Triangle triangle = new Triangle(3, 6, 7);
        Rectangle rectangle = new Rectangle(10, 20);

        line.draw();

        triangle.draw();
        System.out.println("Area of triangle: " + triangle.getArea());
        System.out.println("Perimeter of triangle: " + triangle.getPerimeter());
        System.out.println("Trianle is Polygon: " + triangle.isPolygon());

        rectangle.draw();
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getArea());
        System.out.println("Recatngle is Polygon: " + rectangle.isPolygon());

    }
}
