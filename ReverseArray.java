import java.util.Scanner;
public class ReverseArray
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

        for(int i=size-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
}
