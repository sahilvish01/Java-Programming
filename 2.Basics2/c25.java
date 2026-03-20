//  Use switch-case to build a simple calculator (Add, Sub, Mul, Div)

package lect2;

import java.util.Scanner;

public class c25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number : ");
        int a = sc.nextInt();

        

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Menu : ");
        System.out.println("Enter + : Addition");
        System.out.println("Enter - : Substraction");
        System.out.println("Enter * : Multiplication");
        System.out.println("Enter / : Division");

        

        System.out.print("Enter your choice : ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+' : System.out.println("The Addition : " + a + b);
                        break;
            case '-' : System.out.println("The Substraction : " + (a - b));
                        break;
            case '*' : System.out.println("The Multiplication : " + (a*b));
                        break;
            case '/' : System.out.println("The Division : " + ((float)a/b));
                        break;
            default : System.out.println("Invalid Choice");
        }


        
    }
}

