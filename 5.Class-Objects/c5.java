// Create a student class that has same college name for all students
// Also create a passingMarks variable that is same for all students and create its setter method
// Using static keyword

class Student 
{
    private static String cllgName;
    private int rollNo;
    private int marks;
    private static int passingMarks;

    public static void setPassingMarks(int passingMarks)
    {
        Student.passingMarks = passingMarks;
    }

    public static void setCollegeName(String cllgName)
    {
        Student.cllgName = cllgName;
    }

    public void setStudent( int rollNo, int marks)
    {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void getStudent()
    {
        System.out.println("College Name : " + Student.cllgName);
        System.out.println("Roll NO. : " + rollNo);
        System.out.println("Marks : " + marks);

        if(marks >= passingMarks)
        {
            System.out.println("Status: Pass");
            return;
        }

        System.out.println("Status: Fail");
    }

}

class Main5
{
    public static void main(String[] args) {

        Student.setPassingMarks(30);
        Student.setCollegeName("BGIEM");

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();


        s1.setStudent( 79, 100);
        s2.setStudent( 78, 100);
        s3.setStudent( 100, 10);


        s1.getStudent();
        s2.getStudent();
        s3.getStudent();

    }

}