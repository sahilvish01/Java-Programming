// Check If a array is pelindrome or not

package lect1;


import java.util.Scanner;

class c7 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Object call kiya scanner class

        System.out.print("Enter a number : ");
        int a = sc.nextInt();



        // System.out.print(a);

        int b = a;

        int rev = 0;
        if(a == 0)
        {
            rev = a;
        }
        else
        {
            for(;b!=0;b = b/10)
            {
                int last = b%10;

                rev = rev*10 + last;



            }
        }

        if(rev == a)
        {
            System.out.println("Pelindrome");
        }
        else
        {
            System.out.println("Not Pelindrome");
        }
    }
    
}



