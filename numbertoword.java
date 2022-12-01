import java.util.Scanner;

public class numbertoword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to convert");
        int i= sc.nextInt();
        if(i==1)
        {
            System.out.println("One");
        }
        if(i==2)
        {
            System.out.println("Two");
        }
        if(i==3)
        {
            System.out.println("Three");
        }
        if(i==4)
        {
            System.out.println("Four");
        }
        if(i==5)
        {
            System.out.println("Five");
        }
        if(i==6)
        {
            System.out.println("Six");
        }
        if(i==7)
        {
            System.out.println("Seven");
        }
        if(i==8)
        {
            System.out.println("Eight");
        }
        if(i==9)
        {
            System.out.println("Nine");
        }
        if(i==10)
        {
            System.out.println("Ten");
        }
        else {
            System.out.println("Please Enter Number between 1 to 10");
        }
    }
}