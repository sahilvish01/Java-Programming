// WAP to check the number is prime or not

import java.util.Scanner;
public class c28 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number to check prime : ");
        int num = sc.nextInt();

        if(num < 2)
        {
            System.out.println("Not Prime");
            return;
        }

        int i = 2;
        for(; i <= num/2; i++)
        {
            if(num%i == 0)
            {
                System.out.println("Not Prime");
                return;
            }
        }

        
        System.out.println("Prime");
    }
    
}
