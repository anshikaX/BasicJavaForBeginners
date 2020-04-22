import java.util.Scanner;
public class ArrayEx1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter elements in array 1");
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }

        int arr2[]=new int[size];

        System.out.println("Enter elements in array 2");
        for(int i=0;i<size;i++)
        {
            arr2[i]=sc.nextInt();
        }

        int arr3[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr3[i]=arr1[i]+arr2[size-1-i];
        }

        //Display the elements of array 3
        for(int i=0;i<size;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}
