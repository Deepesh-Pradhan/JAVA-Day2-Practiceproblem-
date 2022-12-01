import java.util.Scanner;

public class Print_MonthName
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println ("Month number " +num+  " is January");
                    break;
                case 2:
                    System.out.println ("Month number " +num+  " is February");
                    break;
                case 3:
                    System.out.println ("Month number " +num+  " is March");
                    break;
                case 4:
                    System.out.println ("Month number " +num+  " is April");
                    break;
                case 5:
                    System.out.println ("Month number " +num+  " is May");
                    break;
                case 6:
                    System.out.println ("Month number " +num+ " is June");
                    break;
                case 7:
                    System.out.println ("Month number " +num+ " is July");
                    break;
                case 8:
                    System.out.println ("Month number " +num+ " is August");
                    break;
                case 9:
                    System.out.println ("Month number " +num+  " is September");
                    break;
                case 10:
                    System.out.println ("Month number " +num+  " is October");
                    break;
                case 11:
                    System.out.println ("Month number " +num+  " is November");
                    break;
                case 12:
                    System.out.println ("Month number "+num+  " is December");
                    break;
                default:
                    System.out.println ("You have Entered an invalid month Number");
            }

        }
}


