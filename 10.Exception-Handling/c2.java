// Divide only nonzero-positive numbers, if input is not nonzero-positive throw an exception
import java.io.IOException;
class Main2
{
    public static void main(String[] args) 
    {
        int a, b, count = 0;

        try
        {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            if(a <= 0 || b <= 0)
                throw new IOException();

            int ans = a/b;

            System.out.printf("Division of %d and %d : %d\n", a,b,ans);
        }
        catch(IOException e)
        {
            count++;
            System.out.println("Please enter value greater than zero, your input is less or equal to zero");
        }
        finally
        {
            if(count == 0)
            {
                System.out.println("Yay.. Exception nahi aayi try block mein");
            }
            else 
            {
                System.out.println("Shit.. Exception aa gayi try block mein");
            }
        }

        System.out.println("At the bottom of the main method");
    }
}