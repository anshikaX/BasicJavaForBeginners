import java.util.Scanner;
public class StringEx2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        //Printing in reverse manner
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }


    }
}
