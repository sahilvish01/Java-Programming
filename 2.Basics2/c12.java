// Print the character of given string in reverse order 

package lect2;

public class c12 {


    public static void main(String[] args)
    {

        String str = "Hello";

        for(int i = 0; i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }

        System.out.println("Reverse : ");

        for(int i = str.length() - 1 ; i >= 0;i--)
        {
            System.out.println(str.charAt(i));
        }
    }
    
}
