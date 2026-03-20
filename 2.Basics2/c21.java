// Take a character input and print its ASCII value (Type casting)

package lect2;
import java.util.Scanner;


public class c21 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");

        char ch = sc.next().charAt(0);


        int asci = (int) ch;

        System.out.println("The ascii value of "+ ch + " : " + asci);

    }
}