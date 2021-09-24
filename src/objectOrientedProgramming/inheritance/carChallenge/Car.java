package objectOrientedProgramming.inheritance.carChallenge;

public class Car {

    int instantVelocity = 0;

    void acelerate() {
        instantVelocity +=  5;
    }

    void decelerate() {
        if(instantVelocity - 5 >= 0) {
            instantVelocity -= 10;
        }
    }
}
