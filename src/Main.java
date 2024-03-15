import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int reversedNumber = 0, temp = number;

        while (temp > 0){
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp /10;
        }
        if (number == reversedNumber)
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is not Palindrome");
    }
}