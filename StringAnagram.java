import java.util.Scanner;
public class StringAnagram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1=sc.nextLine();
        System.out.println("Enter String 2");
        String str2=sc.nextLine();
        boolean isAnagram = false;
        boolean visited[] = new boolean[str2.length()];

        if(str1.length()!=str2.length())
        {
            System.out.println("It is not an anagram");
        }
        else
        {
            for(int i=0;i<str1.length();i++)
            {
                for(int j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j) && !visited[j])
                    {
                        isAnagram=true;
                        break;
                    }
                }
            }

        }
        if(isAnagram)
        {
            System.out.println("It is an anagram");
        }

    }
}
