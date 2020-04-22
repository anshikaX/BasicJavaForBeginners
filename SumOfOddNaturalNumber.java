import java.util.Scanner;


public class SumOfOddNaturalNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum=0;
        for (int i =2; i<=number; i=i+2)
        {
            sum = sum+i;
        }
        System.out.print(sum);

    }
}
