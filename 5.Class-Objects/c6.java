// Demonstrate Initiallizer and static Initializer block


class Main6
{
    public static void main(String [] args)
    {
        System.out.println("Main Started");

        Main6 obj1 = new Main6();        

        System.out.println("Main Ended");
    }

    // Constructor:
    public Main6()
    {
        System.out.println("Constructor called");
    }

    // Initializer block
    {
        System.out.println("Intializer block 1");       //It will execute before constructor
    }

    {
        System.out.println("Intializer block 2");
    }

    // Static Initializer Block
    static 
    {
        System.out.println("Static Intializer Block 1");    // It will execute before even main method
    }

    static 
    {
        System.out.println("Static Intializer Block 2");
    }
}