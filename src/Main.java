import java.util.Scanner;

/**
 * Java program to check if number is palindrome or not.
 * A number is called palindrome if number and its reverse is equal
 * The program can also be used to reverse a number.
 */

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        while(!exit) {
            System.out.println("Please Enter a number to check or 0 to exit : ");
           int inputNumber = new Scanner(System.in).nextInt();
            if (inputNumber != 0 && checkPalindrome(inputNumber)) {
                System.out.println("Number : " + inputNumber + " is a palindrome");
            } else if (inputNumber == 0){
                exit = true;
            }
            else {
                System.out.println("Number : " + inputNumber + " is not a palindrome");

            }
        }
    }

    public static boolean checkPalindrome (int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(number == reverse) {
            return true;
        }
        return false;
    }
}