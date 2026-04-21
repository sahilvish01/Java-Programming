// Create an employee class that has two data members empID and salary, also create getter and setter method then create an array of object

import java.util.Scanner;

class Employee
{
    private int empID;
    private int salary;

    public void setempID(int id)
    {
        empID = id;
    }

    public void setsalary(int sal)
    {
        salary = sal;
    }

    public int getempID()
    {
        return empID;
    }
    public int getsalary()
    {
        return salary;
    }
}


class Main2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee emp[];                 // Created a referance
        emp = new Employee[3];         // Created array of objects (Does not create object)

        for(int i = 0; i < emp.length; i++)
        {
            System.out.println("Enter the Details of Employee " + (i+1));
            emp[i] = new Employee();
            System.out.print("Enter ID: ");
            emp[i].setempID(sc.nextInt());
            System.out.print("Enter Salary: ");
            emp[i].setsalary(sc.nextInt());
        }

        System.out.println("The Details of Employee : ");

        for(int i = 0; i < emp.length; i++)
        {
            System.out.println("Details of Employee " + (i+1));

            System.out.println("Employee ID: " + emp[i].getempID());
            System.out.println("Salary: " + emp[i].getsalary());
            if(emp[i].getsalary() >= 50000)
            {
                System.out.println("Bonus : " + 1000);
            }
            else
            {
                System.out.println("Bonus : " + 500);
            }
        }
    }
}

