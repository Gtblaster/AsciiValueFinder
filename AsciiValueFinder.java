import java.util.Scanner;

public class AsciiValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        if (validateInput(input)) {
            char character = input.charAt(0);
            int asciiValue = (int) character;

            System.out.println("ASCII value of '" + character + "' is: " + asciiValue);
        } else {
            System.out.println("Invalid input. Please enter a single character.");
        }

        scanner.close();
    }

    private static boolean validateInput(String input) {
        return input.length() == 1;
    }
}