package objectOrientedProgramming.oneToOne;

public class Car {
    // We set engine as an instance attribute, because, even tough every car has a engine
    // each car has its own

    Engine engine;

    //by passing 'this' as parameter when constructing the car
    // we're able to construct the engine, since its constructor
    // asks for a car

    Car() {
        this.engine = new Engine(this);
    }

    void turnOnOff() {
        engine.isOn = !engine.isOn;
    }

    boolean isOn() {
        return engine.isOn;
    }

    void accelerate() {
        engine.injectionFactor += 0.4;
    }

    void decelerate() {
        engine.injectionFactor -= 0.4;
    }
}
