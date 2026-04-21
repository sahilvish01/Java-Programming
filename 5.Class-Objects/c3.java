// Implerment Constructors in Java

class Student
{
    private int rollNo;
    private int marks;


    public Student()            // Default Constructor
    {
        rollNo = 1;
        marks = 1;
    }
    
    public Student(int r)       // Single parameterized constructor
    {
        rollNo = r;
        marks = 1;
    }

    public Student(int r, int m)    // Multiple parameterized constructor
    {
        rollNo = r;
        marks = m;
    }

    public Student(Student s)       // Copy Constructor
    {
        rollNo = s.rollNo;
        marks = s.marks;
    }

    public void getStudent()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: "+ marks);
    }

}


class Main3
{
    public static void main(String[] args)
    {
        Student s1;                         // Created Referance

        s1 = new Student();                 // Allocated Memory and called default constructor

        Student s2 = new Student(10);       //Called Single parameterized constructor

        Student s3 = new Student(1, 100);   // Multiple parameterized Constructor

        Student s4 = new Student(s3);       // Copy Constructor


        s1.getStudent();
        s2.getStudent();
        s3.getStudent();
        s4.getStudent();
    }
}