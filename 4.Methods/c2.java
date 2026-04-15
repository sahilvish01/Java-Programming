// Method Overloading :

import java.lang.Math;
import java.util.Scanner;
class c2
{
    public static void main(String [] args)
    {
        System.out.println("Jai Shree Ganesh");

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the radius of Circle : ");
        int rad = sc.nextInt();

        System.out.printf("\nEnter the length and breadth of Rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("\nThe Area of Circle : %.2f", Area(rad));
        System.out.printf("\nThe Area of Rectangle : %.2f", Area(l,b));
    }

    // Area of Circle 
    public static float Area(int r)
    {
        return (float)Math.PI*r*r;
    }

    // Area of Rectangle
    public static float Area(int l, int b)
    {
        return l*b;
    }
}