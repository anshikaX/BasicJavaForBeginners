import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String s=Binary(n);
        System.out.println(s);

    }

    public static String Binary(int number)
    {
        String BinaryNo = "";
        int rem;
        while(number>0)
        {
            rem = number % 2;
            BinaryNo = BinaryNo + rem;
            number = number/2;

        }
        return BinaryNo;

    }
}
