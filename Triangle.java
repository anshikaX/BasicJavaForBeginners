import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c)
        {
            System.out.println("Equilateral Triangle");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("Isosceles Triangle");
        }
        else if(a*a+b*b==c*c|| b*b+c*c==a*a || a*a+c*c==b*b )
        {
            System.out.println("Right Angled Triangle");
        }
        else
        {
            System.out.println("Triangle can't be formed");
        }
    }
}
