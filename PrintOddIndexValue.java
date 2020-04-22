import java.util.Scanner;

public class PrintOddIndexValue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter values in an array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            if(i%2==1)
            {
                System.out.println(arr[i]);
            }
        }

    }
}
