import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assign17 {
    public static int romanToDecimal(String roman) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char numeral = roman.charAt(i);
            int value = romanNumerals.getOrDefault(numeral, 0);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static boolean isValidRoman(String roman) {
        String validChars = "IVXLCDM";

        for (char c : roman.toCharArray()) {
            if (validChars.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanInput = scanner.nextLine().toUpperCase();

        if (isValidRoman(romanInput)) {
            int decimalResult = romanToDecimal(romanInput);
            System.out.println("The decimal equivalent of " + romanInput + " is: " + decimalResult);
        } else {
            System.out.println("Invalid Roman numeral. Please enter a valid Roman numeral.");
        }
    }
}

