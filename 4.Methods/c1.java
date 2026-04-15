// Methods in Java :

import java.lang.Math;
import java.util.Scanner;
class c1
{
    public static void main(String [] args)
    {
        System.out.println("Jai Shree Ganesh");

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number to check prime : ");
        int val = sc.nextInt();

        System.out.println();

        if(isPrime(val))
        {
            System.out.printf("%d is Prime number", val);
        }
        else
        {
            System.out.printf("%d in not prime number", val);
        }

    }

    // To Check Prime :
    public static boolean isPrime(int num)
    {
        if(num < 2)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}