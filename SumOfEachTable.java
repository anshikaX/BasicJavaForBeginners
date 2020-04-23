import java.util.Scanner;
public class SumOfEachTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum;
        for(int i=1;i<=num;i++)
        {
            sum=0;
            for(int j=1;j<=5;j++)
            {
                sum=sum+i*j;

            }
            System.out.println("Sum of " +i+ " table is " +sum);

        }

    }

}
