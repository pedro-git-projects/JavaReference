package objectOrientedProgramming.inheritance.carChallenge;

public class CarTest {
    public static void main(String[] args) {
        MustangBoss mustangBoss = new MustangBoss();
        Delorean delorean = new Delorean();

        System.out.println(delorean.instantVelocity);
        System.out.println(mustangBoss.instantVelocity);

        mustangBoss.acelerate();
        System.out.println(mustangBoss.instantVelocity);
        delorean.acelerate();
        System.out.println(delorean.instantVelocity);

        mustangBoss.acelerate();
        System.out.println(mustangBoss.instantVelocity);
        delorean.acelerate();
        System.out.println(delorean.instantVelocity);

        mustangBoss.decelerate();
        System.out.println(mustangBoss.instantVelocity);
        delorean.decelerate();
        System.out.println(delorean.instantVelocity);
        
    }
}
