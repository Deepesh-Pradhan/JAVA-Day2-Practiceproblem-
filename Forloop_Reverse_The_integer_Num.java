import java.util.Scanner;

public class Forloop_Reverse_The_integer_Num
{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int number = sc.nextInt();
            int reverse = 0, remainder;

            for (;number > 0;)
            {
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            System.out.println("The reverse of the given Number is: " + reverse);
        }

}
