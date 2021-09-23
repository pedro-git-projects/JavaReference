package foundations;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte companyYears = 23;
        short flights = 542;
        int id = 56789;
        long points = 3_134_845_223L;

        // Real numbers
        float wage = 11_445.44F;
        double saleNumbers = 2_991_797_103.01;

        // Booleans
        boolean isOnHolidays = false; // true

        // Character
        char status = 'A'; // active

        // Days at the company
        System.out.println(companyYears * 365);

        // Number of trips
        System.out.println(flights / 2);

        // Points per dollar
        System.out.println(points / saleNumbers);

        System.out.println(id + ": earns -> " + wage);
        System.out.println("Holidays? " + isOnHolidays);
        System.out.println("Status: " + status);
    }
}
