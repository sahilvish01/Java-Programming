// Single Inheritance:

// Create a class Employee and inherits the property into Fulltime Emoloyee 

class Employee
{
    private String name;
    private int empID;

    public void setEmp(String name, int empID)
    {
        this.name = name;
        this.empID = empID;
    }

    public void displayEmp()
    {
        System.out.println("Name : " + this.name);
        System.out.println("empID : " + this.empID);
    }
}

class FulltimeEmp extends Employee
{
    private int salary;

    public void setftEmp(String name, int empID, int salary)
    {
        setEmp(name, empID);
        this.salary = salary;
    }

    public void displayftEmp()
    {
        displayEmp();
        System.out.println("Salary : " + salary);
    }
}

class Main1
{
    public static void main(String [] args)
    {
        FulltimeEmp ftemp = new FulltimeEmp();

        ftemp.setftEmp("Sahil", 101, 100000000);
        ftemp.displayftEmp();
    }
}