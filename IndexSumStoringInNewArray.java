import java.util.Scanner;
public class IndexSumStoringInNewArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        int arr3[]=new int[size];

        //Entering elements in array1
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();
        }
        //Entering elements in array2
        for(int i=0;i<size;i++)
        {
            arr2[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            arr3[i]=arr1[i]+arr2[i];
        }

        //Display Elements of array 3
        for(int i=0;i<size;i++)
        {
            System.out.println(arr3[i]);
        }


    }

}
