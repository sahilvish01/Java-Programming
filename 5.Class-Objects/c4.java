// 1. Create a demo class that has 2 constructors default and parameterized, 
// 2. the parameter name of 2nd constructor should be same as the name of the data members in class,
// 3. call the constructor from inside same class,
// 4. also create the method that return the current object
// 5. create a method that can accepts the current object as parameter  -> Not Now


class Demo
{
    private String name;
    private int marks;

    public Demo()
    {
        name = "No name";
        marks = 0;
    }

    public Demo(String name, int marks)
    {
        this.name = name;
        this.marks = marks;   
    }

    public Demo(int marks, String name)
    {
        this(name, marks);
    }

    public Demo checkMarks(Demo d)
    {
        if(this.marks < d.marks)
        {
            return d;
        }

        return this;
    }

    public void diplay()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Marks : " + this.marks);
    }
    

}



class Main4
{
    public static void main(String [] args)
    {
        Demo d1 = new Demo();

        Demo d2 = new Demo("Keshav", 100);

        Demo d3;
        d3 = new Demo(100, "Sahil");


        d1.diplay();
        d2.diplay();
        d3.diplay();
        

        d1 = d2.checkMarks(d3);

        d1.diplay();

    }
}