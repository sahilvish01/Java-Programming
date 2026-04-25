// Access Specifiers:
/*

1. private: Only inside same class
2. default: Only inside same package
3. protected: Only inside same package and inside derived class of other packages
4. public: inside same package as well as other packages

*/


// Ek java program mein keval ek hi public class ho sakti hai agar ek se jyada public class banana hai same package mein to same package mein dusri java file bana lo
// Same Package
package mypack;

public class SameClass {

    private int pri_i;
    int def_i;              // default
    protected int pro_i;
    public int pub_i;

    // Same class
    public void setvar()
    {
        pri_i = 10;
        def_i = 20;
        pro_i = 30;
        pub_i = 40;
    }
    
}

class SamepkgDerived extends SameClass
{

    // Inherited Class:
    public void setvar()
    {
        // pri_i = 10;         // Private Members cannot be accessed
        def_i = 20;
        pro_i = 30;
        pub_i = 40;
    }

}

class SamepkgStandAlone
{
    
    // Stand Alone Class: 
    public static void main(String[] args) 
    {
        SameClass obj = new SameClass();

        // obj.pri_i = 10;     // Private members cannot be accessed here
        obj.def_i = 20;
        obj.pro_i = 30;
        obj.pub_i = 40;
    }

}
