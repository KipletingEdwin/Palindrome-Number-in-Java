import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
            int reversedNumber = 0, temp = number;

            while (temp > 0) {
                int remainder = temp % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                temp = temp / 10;
            }
            if (number == reversedNumber)
                System.out.println("The number is Palindrome");
            else
                System.out.println("The number is not Palindrome");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
