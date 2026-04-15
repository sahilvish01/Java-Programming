// Find factorial using Reccursion

import java.util.Scanner;
public class c3 {

    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number to find factorial : ");
        int num = sc.nextInt();

        System.out.printf("\nFactorial of %d : %d", num, fact(num));
    }

    // Reccursive Function to find factorial :
    public static int fact(int num)
    {
        if(num < 0)
        {
            return -1;
        }

        if(num == 0 || num == 1)
        {
            return 1;
        }

        return num * fact(num - 1);
    }
}