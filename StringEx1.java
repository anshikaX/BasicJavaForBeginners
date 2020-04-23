import java.util.Scanner;

public class StringEx1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        //Printing String
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i)+ " ");
        }


    }
}
