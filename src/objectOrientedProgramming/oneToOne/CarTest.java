package objectOrientedProgramming.oneToOne;

public class CarTest {
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.turnOnOff();
        System.out.println(c1.isOn());

        System.out.println(c1.engine.rotation());
        c1.accelerate();
        c1.accelerate();
        System.out.println(c1.engine.rotation());

        c1.decelerate();
        System.out.println(c1.engine.rotation());

        // Missing encapsulation
        // c1.engine.injectionFactor = -30;

        // Since the relational is bidirectional:
        System.out.println(c1.engine.car.engine.car.engine.car.engine.rotation());
    }
}
