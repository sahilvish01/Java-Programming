// Create a Student Class that contains marks, name, rollNo as property and create its getter and setter method, then create a objects of Student class

import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.setName("Sahil");
        s1.setMarks(100);
        s1.setrollNo(79);

        System.out.println("Name : " + s1.getName());
        System.out.println("Roll No : " + s1.getrollNo());
        System.out.println("Marks : " + s1.getMarks());
    }
}

class Student {

    static Scanner sc = new Scanner(System.in);
    private String name;
    private int marks;
    private int rollNo;
    

    public void setName(String n)
    {
        name = n;
    }

    public void setMarks(int m)
    {
        if(m < 0 || m > 100)
        {
            System.out.println("Entered Wrong marks");
            return;
        }
        marks = m;
    }

    public void setrollNo(int r)
    {

        if(r < 1 || r > 150)
        {
            System.out.println("Only 1 - 150 roll numbers are valid !!");
            return;
        }

        rollNo = r;
    }

    public String getName()
    {
        return name;
    }

    public int getMarks()
    {
        return marks;
    }

    public int getrollNo()
    {
        return rollNo;
    }


}





