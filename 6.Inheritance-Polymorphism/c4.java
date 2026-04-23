// Super keyword in Java

class Base
{
    protected String name;
    protected int age;

    public Base(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayB()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class Derived extends Base
{
    private int rollNo;

    public Derived(String name, int age, int rollNo)
    {
        super(name, age);
        this.rollNo = rollNo;
    }

    public void setDerived(String name, int age, int rollNo)
    {
        super.name = name;
        super.age = age;
        this.rollNo = rollNo;
    }

    public void displayD()
    {
        super.displayB();
        System.out.println("Roll No.: " + rollNo);
    }
}

class Main4
{
    public static void main(String [] args)
    {
        Derived d = new Derived("Sahil", 19, 79);

        d.displayD();

        d.setDerived("Keshav", 19, 79);

        d.displayD();
        
    }
}