// Using static keyword in nested class

public class c7 {

    static class Student1
    {
        private String name;
        private int marks;

        public void setStudent(String name, int marks)
        {
            this.name = name;
            this.marks = marks;
        }

        public void getStudent()
        {
            System.out.println("Name : " + name);
            System.out.println("Marks : " + marks);
        }

    }

    public static void main(String [] args)
    {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.setStudent("Sahil", 100);
        s2.setStudent("Keshav", 100);

        s1.getStudent();
        s2.getStudent();
    }
}
