import java.util.Scanner;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the element to find");
        int value=sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid = start + ((end-start)/2);
            if(arr[mid]==value)
            {
                break;
            }
            else if(arr[mid]>value)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        if(start<=end){
            System.out.println("The position of the element is: "+mid );
        }
        else{
            System.out.println("The value to find doesn't exist.");
        }



    }
}
