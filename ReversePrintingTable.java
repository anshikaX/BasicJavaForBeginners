import java.util.Scanner;

public class ReversePrintingTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int table = sc.nextInt();

        for(int i=10;i>=1;i--)
        {
            System.out.println(table*i);
        }

    }
}
