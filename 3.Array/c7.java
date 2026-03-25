// Cloning of Array

public class c7 {
    public static void main(String[] args)
    {
        int original[] = {3,5,4,2,3};

        int[] copy = original.clone();

        copy[0] = 6;

        for(int i : original)
        {
            System.out.println(i);
        }

        for(int i : copy)
        {
            System.out.println(i);
        }

    }
    
}
