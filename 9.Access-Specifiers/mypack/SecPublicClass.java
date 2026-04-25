package mypack;

public class SecPublicClass
{
    // Same Package Stand Alone Class
    public static void main(String[] args) 
    {
        SameClass obj1 = new SameClass();
    
        // obj1.pri_i = 10;     // Private members cannot be accessed here
        obj1.def_i = 20;
        obj1.pro_i = 30;
        obj1.pub_i = 40;

    }
}