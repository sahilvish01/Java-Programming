// Multilevel Inheritance

// Person class -> name, age
// Emp class -> Emp ID, Department
// FulltimeEmp class -> salary

class Person
{
    private String name;
    private int age;

    public void setPerson(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayPerson()
    {
        System.out.println("Name: " + name);
        System.out.println("Age:  " + age);
    }
}

class Employee1 extends Person
{
    private int empID;
    private String Dept;

    public void setEmp(String name, int age, int empID, String Dept)
    {
        setPerson(name, age);
        this.empID = empID;
        this.Dept = Dept;
    }

    public void displayEmp()
    {
        displayPerson();
        System.out.println("Employee ID: " + empID);
        System.out.println("Department: " + Dept);
    }
}

class FulltimeEmp1 extends Employee1
{
    private int salary;

    public void setFtEmp(String name, int age, int empID, String Dept, int salary)
    {
        setEmp(name, age, empID, Dept);
        this.salary = salary;
    }

    public void displayFtEmp()
    {
        displayEmp();
        System.out.println("Salary: " + salary);
    }
}

class Main2
{
    public static void main(String[] args) {
        
        FulltimeEmp1 ftemp = new FulltimeEmp1();

        ftemp.setFtEmp("Sahil", 19, 101, "Technical", 1000000000);

        ftemp.displayFtEmp();
    }
}