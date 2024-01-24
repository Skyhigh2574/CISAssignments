public class Assign5 {
    public static void main(String[] args) {
        // Test Data
        int resultA = -5 + 8 *6;
        int resultB = (55 + 9) % 9;
        double resultC = 20 + -3 * 5 / 8.0;  // To include decimal point for accurate division
        double resultD = 5 + 15 / 3.0 * 2 - 8 % 3.0;

        // Print Results
        System.out.println("Result of -5 + 8 * 6 = " + resultA);
        System.out.println("Result of (55 + 9) % 9 = " + resultB);
        System.out.println("Result of 20 + -3 * 5 / 8 = " + resultC);
        System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3 = " + resultD);
    }
}