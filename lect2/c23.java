// Write a program to reverse a number using while loop

package lect2;

import java.util.Scanner;

public class c23
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num = sc.nextInt();

        int b = num;

        int rev = 0;

        while(b != 0)
        {
            int last = b%10;

            rev = rev*10 + last;

            b = b/10;
        }

        System.out.println("The Reverse of " + num + " : " + rev);

    }
}