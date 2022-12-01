import java.util.Scanner;

public class Distance
{
        public static void main(String[] args)
        {
            double distance;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of x :");
            double x = sc.nextDouble();
            System.out.println("Enter the value of y :");
            double y = sc.nextDouble();
            distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);
        }
}
