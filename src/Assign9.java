import java.util.Scanner;

public class Assign9 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            String numAsString = Integer.toString(num);
            System.out.println("Integer to String: " + numAsString);

            // Convert String to Integer
            System.out.print("Enter a string representing an integer: ");
            String inputString = scanner.next();
            int stringToInt = Integer.parseInt(inputString);
            System.out.println("String to Integer: " + stringToInt);

            // Convert String to Float
            System.out.print("Enter a floating-point number as a string: ");
            String floatAsString = scanner.next();
            float stringToFloat = Float.parseFloat(floatAsString);
            System.out.println("String to Float: " + stringToFloat);


            System.out.print("Enter a double-precision number: ");
            double num1 = scanner.nextDouble();
            String numAsStringg = Double.toString(num);
            System.out.println("Double to String: " + numAsString);


            scanner.close();
        }
    }

