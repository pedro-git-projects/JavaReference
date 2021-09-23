package foundations.operators;

public class Relational {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(30 != 7);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);

        double result = 9.9;
        boolean goodBehaviour = false;
        boolean approvedByGrade = result >= 7;
        boolean grant = goodBehaviour && approvedByGrade;

        System.out.println("Grant? " + grant);
    }

}
