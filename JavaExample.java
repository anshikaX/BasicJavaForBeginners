import java.util.Scanner;
public class JavaExample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.println(i * j);
            }

        }
    }
}
