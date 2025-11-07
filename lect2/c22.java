//  Find factorial of a number using for loop

package lect2;

import java.util.Scanner;

public class c22
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num = sc.nextInt();

        for(int i = num-1; i >1 ; i-- )
        {
            num = num *i;
        }

        System.out.println("Factorial : " + num);

        






    }
}