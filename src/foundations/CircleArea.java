package foundations;

public class CircleArea {
    public static void main(String[] args) {

        double radius = 3.4;

        // final is the keyword for creating constants in Java
        final double PI = 3.141519;

        double area = PI * radius * radius;

        System.out.println(area);

        radius = 10;
        area = PI * radius * radius;
        System.out.println("The area is equal to " + area);
    }
}
