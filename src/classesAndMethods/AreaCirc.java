package classesAndMethods;

public class AreaCirc {

    double radius;
    // Static attributes are class attributes, and are the same for all instances
    // final sets double as a constant variable
    static final double PI = 3.14;

    AreaCirc(double radius) {
       this.radius = radius;
    }

    double area() {
        return PI * Math.pow(radius, 2);
    }
}
