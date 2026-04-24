// Abstract class and methods 

abstract class AbstractDemo1
{
    int var1;


    AbstractDemo1(int var1)                 // Constructor
    {
        this.var1 = var1;
    }

    public void setVar1(int var1)           // Concrete Method
    {
        this.var1 = var1;
    }

    abstract public void display();         // Non-concrete (Abstract) Method

}

class AbstractDemo2 extends AbstractDemo1
{
    int var2;

    AbstractDemo2(int var1, int var2)
    {
        super(var1);
        this.var2 = var2;
    }

    public void setVars(int var1, int var2)
    {
        super.var1 = var1;
        this.var2 = var2;
    }


    public void display()
    {
        System.out.println("Var1 : " + var1);
        System.out.println("Var2 : " + var2);
    }
}

class Main1
{

    public static void main(String[] args) {
        
        AbstractDemo2 obj1 = new AbstractDemo2(1,2);
        
        obj1.setVars(10, 20);

        obj1.display();
    }
    
}