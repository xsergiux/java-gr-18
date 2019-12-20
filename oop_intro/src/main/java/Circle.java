public class Circle {
    public static final double PI = 3.14;
    double radius;
    String color;

    //constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //metode
    public double getAria() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
}

