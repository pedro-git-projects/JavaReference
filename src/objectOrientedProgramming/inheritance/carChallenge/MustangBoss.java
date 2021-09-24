package objectOrientedProgramming.inheritance.carChallenge;

public class MustangBoss extends Car {
   /*
   * It is to be noted that the implicit constructor for classes that extend other classes
   * is the constructor super();
   * if you override the default constructor from the parent class
   * you need to manually call the super constructor in the child class
   * and pass the adequate parameters
   * */

    MustangBoss() {
        super(281);
    }

    void acelerate() {
        super.acelerate();
        super.acelerate();
        super.acelerate();
    }

}
