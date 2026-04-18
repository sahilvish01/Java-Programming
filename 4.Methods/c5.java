// Overloding of Add method

public class c5 {

    public static void main (String [] args)
    {
        System.out.printf("Addition of %d %d %d : %d", 2,3,4,add(2,3,4));
        System.out.printf("\nAddition of %d %d : %d", 2,3,add(2,3));
        System.out.printf("\nAddition of %.2f %.2f %.2f : %.2f", 2.98f,3.3f,8.21f,add(2.98f,3.3f,8.21f));
        
    }

    // Add 3 int
    public static int add(int num1, int num2, int num3)
    {
        return (num1 + num2 + num3);
    }

    // Add 2 int 
    public static int add(int num1, int num2)
    {
        return (num1 + num2);
    }

    // Add 3 floats
    public static float add(float num1, float num2, float num3) {

        return (num1 + num2 + num3);
         
    }

}