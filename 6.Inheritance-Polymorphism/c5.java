// Constructor in Inheritance

class Base1
{
    // public Base1()                      // Called First
    // {
    //     System.out.println("Default Constructor of Base Class");
    // }

    public Base1(int i)                     // Called First
    {
        System.out.println("Parameterized Constructor of Base Class, P: " + i);
    }
}

class Derived1 extends Base1
{
    // public Derived1()                   // Called After parent
    // {
    //     System.out.println("Default Constructor of Derived Class");
    // }

    public Derived1(int i)                  // Called After parent
    {
        super(i);
        System.out.println("Parameterized Constructor of Derived Class, P: " + i);
    }
}

class Main5
{
    public static void main(String[] args) {
        // Derived1 d1 = new Derived1(); 
        Derived1 d2 = new Derived1(2); 
    }
}