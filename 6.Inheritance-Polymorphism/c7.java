// Runtime Polymorphism: Method Overriding through Upcasting

// Cricketer class: Countryname, Playername
// Batsman class: No50s, No100s
// Bowler class: wicket, runsgiven

// Override Display() Method


import java.util.Scanner;
class Cricketer 
{
    protected String CountryName;
    protected String PlayerName;

    public Cricketer(String CountryName, String PlayerName)
    {
        this.CountryName = CountryName;
        this.PlayerName = PlayerName;
    }

    public void display()
    {
        System.out.println("Country Name: " + CountryName);
        System.out.println("Player Name: " + PlayerName);
    }

}

class Batsman extends Cricketer
{
    private int No50s;
    private int No100s;

    public Batsman(String CountryName, String PlayerName, int No50s, int No100s)
    {
        super(CountryName, PlayerName);
        this.No50s = No50s;
        this.No100s = No100s;
    }

    public void display()
    {
        System.out.println("Country Name: " + CountryName);
        System.out.println("Player Name: " + PlayerName);
        System.out.println("No. of 50s: " + No50s);
        System.out.println("No. of 100s: " + No100s);
    }
}

class Bowler extends Cricketer
{
    private int wickets;
    private int runsGiven;

    public Bowler(String CountryName, String PlayerName, int wickets, int runsGiven)
    {
        super(CountryName, PlayerName);
        this.wickets = wickets;
        this.runsGiven = runsGiven;
    }

    public void display()
    {
        System.out.println("Country Name: " + CountryName);
        System.out.println("Player Name: " + PlayerName);
        System.out.println("No. of Wickets Taken: " + wickets);
        System.out.println("No. of Runs Given: " + runsGiven);
    }
}

class Main7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Batsman");
        System.out.println("Enter Other for Bowler");

        System.out.println("Enter a Number: ");
        int choice = sc.nextInt();

        Cricketer c;

        if(choice == 1)
        {
            c = new Batsman("India", "Virat Kohli", 150, 90);
        }
        else
        {
            c = new Bowler("India", "Jaspreet Bumrah", 4, 10);    
        }               

        c.display();

    }
}