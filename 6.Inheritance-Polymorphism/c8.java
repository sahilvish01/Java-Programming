// Create Final variable and try to reassign that
// Create Final class and try to inherit
// Create Final method and try to override

class FinalDemo1
{
    final int var1 = 100;               // Intialize when declared or Using Constructor or Intializer Block

    public void setVar1(int var1)
    {
        // this.var1 = var1;           // Not Allowed
    }

    public final void displayVar1()
    {
        System.out.println(var1);
    }

}

class FinalDemo2 extends FinalDemo1
{
    int var1 = 0;

    // public void displayVar1()               // Cannot override final method
    // {
    //     System.out.println(var1);
    // }

}


final class FinalDemo3
{
    public FinalDemo3()
    {
        System.out.println("Final Class");
    }
}

// class FinalDemo4 extends FinalDemo3         // Not Allowed
// {
//     public FinalDemo4()
//     {
//         System.out.println("Final Class ki Derived Class");
//     }
// }


class Main8
{
    public static void main(String[] args) 
    {
        FinalDemo1 f1 = new FinalDemo2();

        System.out.println(f1.var1);
    }
}