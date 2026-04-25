// Take invalid input and handle 

// Integer -> divide by 0 = Exception           -> Does not follow IEEE 754 Rule

// Decimal -> divide by 0 = Infinity            -> Follow IEEE 754 Rule         (0.000000001 ko round off karke = 0.0) that is why it shows Infinity


class Main1
{
    public static void main(String[] args) 
    {
        int a, b, count = 0;
        try
        {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            
            // float ans = (float)a/b;

            int ans = a/b;

            System.out.printf("Division of %d and %d : %d\n", a,b,ans);
        }
        catch(Exception e)
        {
            count++;
            System.out.println("Exception is generated : " + e);
        }
        finally
        {
            System.out.println("Mai to run zarur hounga, chahe exception create ho ya nahi");

            if(count == 0)
            {
                System.out.println("Try block bina exception ke chal gaya");
            }
            else
            {
                System.out.println("Try block mein exception aaya hai");
            }
        }
        
        System.out.println("The Execution flow after try block");
    }
}