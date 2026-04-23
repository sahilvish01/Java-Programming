// Runtime Polymorphism: Method Overriding through Direct Instantiation

class Base6
{
    public void sayHello()
    {
        System.out.println("Hello from Base...");
    }
}

class Derived6 extends Base6
{
    public void sayHello()
    {
        System.out.println("Hello from Derived...");
    }
}

class Main6
{
    public static void main(String [] args)
    {
        Derived6 d = new Derived6();
    
        d.sayHello();
    }
}