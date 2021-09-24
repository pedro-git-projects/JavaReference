package objectOrientedProgramming.inheritance.carChallenge;

public class Car {

    final int TOP_SPEED;

    Car(int topSpeed) {
        TOP_SPEED = topSpeed;
    }

    int instantVelocity = 0;

    void acelerate() {
        if(instantVelocity + 5 > TOP_SPEED){
            instantVelocity = TOP_SPEED;
        } else {
            instantVelocity +=  5;
        }

    }

    void decelerate() {
        if(instantVelocity - 5 >= 0) {
            instantVelocity -= 10;
        }
    }
}
