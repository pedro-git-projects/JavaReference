package foundations.operators;

public class Ternary {
    public static void main(String[] args) {

        double mean = 8.6;
        String result = mean >= 7.0 ?
                "passed." : "retake test.";
        System.out.println("Your status is " + result);


        double nota = 9.9;
        boolean goodBehaviour = true;
        boolean approvedByMean = nota >= 7;
        boolean grant = goodBehaviour && approvedByMean;
        String finalResult = grant ? "Yes." : "No.";

        System.out.printf("Grant? %s", finalResult);
    }
}
