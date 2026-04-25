// Interface

interface InterfaceDemo1
{
    int x = 100;                    // final and static by default

    void sayHello1();               // public abstract by default

    default void sayInterface()         // public -> default methods
    {
        // x = 10;                     // Cannot assign to final variable
        System.out.println("It is method inside Interface 1");
    }

}

interface InterfaceDemo2 
{
    void sayHello2();

    default void sayInterface()
    {
        System.out.println("It is a default method inside Interface 2");
    }

}

class DemoClass1
{
    public void DemoMethod()
    {
        System.out.println("The method of Democlass1");
    }
  
}


class DemoClass2 extends DemoClass1 implements InterfaceDemo1, InterfaceDemo2          // Multiple Inheritance using interfaces
{

    @Override                       // best practice hai ki har override method ke aage hamesha @Override likhna
    public void sayHello1()
    {
        System.out.println("This Method is overrided from first Interface 1");
    }

    @Override
    public void sayHello2()
    {
        System.out.println("This Method is overrided from second Interface 2");
    }

    @Override
    public void sayInterface()
    {
        InterfaceDemo2.super.sayInterface();
    }

}

class Main4
{
    public static void main(String[] args) 
    {
        DemoClass2 d1 = new DemoClass2();

        d1.sayHello1();
        d1.sayHello2();
        d1.sayInterface();
        d1.DemoMethod();

    }

}