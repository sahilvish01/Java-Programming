// 1. Create Package -> Packclass name
// 2. import package in another file and create object of Packclass and call its methods

import mypack.*;
class Main1
{
    public static void main(String[] args) 
    {
        Packclass obj = new Packclass();

        obj.setvar1(100);
        obj.displayvar1();
    }
}