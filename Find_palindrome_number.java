import java.util.Scanner;

public class Find_palindrome_number {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the first number: ");
            int num = sc.nextInt();
            int rev = 0, remainder;
            int temp = num;
            for (; num != 0; ) {
                remainder = num % 10;
                rev = rev * 10 + remainder;
                num = num / 10;

            }
            if ( temp == rev ) {
                System.out.println(" Entered number is a palindrome Number");
            } else {
                System.out.println(" Entered number is not a palindrome Number");
            }
        }
    }