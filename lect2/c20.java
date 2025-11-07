// Check whether a number is a multiple of 3 or not using if-else

package lect2;

import java.util.Scanner;

public class c20 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n%3 == 0)
        {
            System.out.println("Multiple of 3");
        }
        else
        {
            System.out.println("Not Multiple of 3");
        }
    }
    
}
