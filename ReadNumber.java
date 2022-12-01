import java.util.Scanner;
public class ReadNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if(num == 1 ){
            System.out.println("Unit");
        }
        if(num == 10 ) {
            System.out.println("Ten");
        }
        if(num == 100 ) {
            System.out.println("Hundred");

        }
        if(num == 1000 ) {
            System.out.println("Thousand");

        }

        else{
            System.out.println("Enter Numbers 1, 10, 100 to get UNIT TEN HUNDRED");
        }
    }
}