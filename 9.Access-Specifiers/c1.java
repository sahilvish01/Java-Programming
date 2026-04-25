// Another Package: 
import mypack.SameClass;

class AnotherpkgDerived extends SameClass
{
    public void setvar() 
    {
        // pri_i = 10;     // Private members cannot be accesed from here
        // def_i = 20;     // default members cannot be accesed from here
        pro_i = 30;
        pub_i = 40;
    };
}

class AnotherpkgStandAlone
{
    public static void main(String[] args) 
    {
        SameClass obj1 = new SameClass();
        
        // obj1.pri_i = 10;     // Private members cannot be accesed from here
        // obj1.def_i = 20;     // default members cannot be accesed from here
        // obj1.pro_i = 30;     // Protected members cannot be accessed from here
        obj1.pub_i = 40;
    }
}
