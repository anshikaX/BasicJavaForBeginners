import java.util.Scanner;
public class ArrayEx2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size= sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements in array");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++)

            for(int j=1;j<=5;j++)
            {
                System.out.println(arr[i]*j);

            }

        }
    }
