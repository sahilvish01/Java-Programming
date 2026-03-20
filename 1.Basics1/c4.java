// Grade Calculator

package lect1;


class c4 {
    
    public static void main(String[] args)
    {
        float att = 77.5f;
        int marks = 100;

        if(att >= 75 && marks >=80)
        {
            System.out.println("Grade : A");
        }
        else
        {
            if(att >= 75 && marks >= 60)
            {
                System.out.println("Grade : B");

            }
            else
            {
                if(att >= 75 && marks >= 33)
                {
                    System.out.println("Garde : C");


                }
                else
                {
                    System.out.println("Fail");
                }

            }
        }

    }

}
