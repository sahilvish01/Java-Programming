// Print :

// 5
// 55
// 555
// 5555
// 55555

package lect1;

class c8 {
    public static void main()
    {
        int a = 5;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(a);
            }
            System.out.print("\n");
        }
    }
    
}
