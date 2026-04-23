// Hierarichal Inheritance:

// 1. Emp Class    -> empID 
// 2. FulltimeEmp   -> fullsal
// 3. ParttimeEmp   -> perhour, hoursal

class Emp3
{
    private String empID;

    public void setEmp(String empID)
    {
        this.empID = empID;
    }

    public void displayEmp()
    {
        System.out.println("Employee ID: " + empID);
    }
}

class FulltimeEmp3 extends Emp3
{
    private int fullsal;

    public void setFTEmp(String empID,int fullsal)
    {
        setEmp(empID);
        this.fullsal = fullsal;
    }

    public void displayFTEmp()
    {
        displayEmp();
        System.out.println("Full Salary: " + fullsal);
    }
}

class ParttimeEmp3 extends Emp3
{
    private int hours;
    private int phrsal;

    public void setPTEmp(String empID, int hours, int phrsal)
    {
        setEmp(empID);
        this.hours = hours;
        this.phrsal = phrsal;
    }

    public void displayPTEmp()
    {
        displayEmp();
        System.out.println("Salary : " + (phrsal * hours));
    }

}


class Main3
{
    public static void main(String[] args) {
        FulltimeEmp3 ftemp = new FulltimeEmp3();
        ParttimeEmp3 pttemp = new ParttimeEmp3();


        ftemp.setFTEmp("EMP101",100000000);
        ftemp.displayFTEmp();

        pttemp.setPTEmp("EMP102", 12, 1500);
        pttemp.displayPTEmp();
    }
}