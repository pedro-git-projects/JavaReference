package objectOrientedProgramming.oneToOne;

public class Engine {

    Car car; // added car type as instance variable
    boolean isOn = false;
    double injectionFactor = 1;

    // now our relation is bidirectional, for an Engine has a Car associated
    Engine(Car car) {
        this.car = car;
    }

    int rotation() {
        if (!isOn) {
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }
}
