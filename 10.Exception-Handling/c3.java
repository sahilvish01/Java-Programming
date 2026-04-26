// Create a method divide karegi do numbers ko but agar exception generate hota hai, to voh method ke andar ke handle nahi karegi jaha se call huyi hai vaha handle karna padega

class ExceptionHandling
{

    public int divide2Nos(int a, int b) throws Exception
    {
        if(b == 0)
            throw new ArithmeticException();
        return (a/b);
    }

}

class Main3
{
    public static void main(String[] args) //   throws Exception  -> 2nd way
    {
        ExceptionHandling obj = new ExceptionHandling();

        try
        {
            int ans = obj.divide2Nos(10, 10);
            System.out.println(ans);
        }
        catch(Exception e)
        {
            System.out.println("Cannot divided by zero..");
        }

        System.out.println("At the bottom of the main");
    }
}