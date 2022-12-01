public class SumofNaturalNum
{
    public static void main(String[] args) {
        int N = 9;
        int sum = 0;
        int i = 0;

        while ( N >= i )
        {
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of N Number is : " + sum );
    }

}
