// Check whether a number is prime or not using loop and if-else

package lect2;

import java.util.Scanner;

class c24
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        int count=0;


        if(n>1)
        {
            for(int i = 2; i<=n/2; i++)
            {
                // if(n%i != 0)  - I made this mistake, It means agar i se divisble nahi hai to condition chalao which was wrong

                if(n%i == 0)
                {
                    count ++;
                    break;
                }
            }
        }
        else
        {
            count ++;
        }

        if(count == 0)
        {
            System.out.println(n + " is a Prime number");
        }
        else
        {
            System.out.println(n + " is not a Prime number");
        }

    }
}

