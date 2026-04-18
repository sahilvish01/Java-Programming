// Reverse all the digits of the number using reccursion

import java.util.Scanner;
public class c4
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.printf("\nReverse Digit of %d : %d", num, revDig(num));
        
    }

    public static int revDig(int num)
    {
        if(num >= 0 && num <= 9)
        {
            return num;
        }

        int rem = num % 10;
        return rem*10 + revDig(num/10);
    }
}
