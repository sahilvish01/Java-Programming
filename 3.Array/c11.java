// Array Rivision
import java.util.Scanner;
public class c11 {

    public static void main(String [] args)
    {
        System.out.println("Jai Shree Ganeshaye Namah");


        Scanner sc = new Scanner(System.in);

        // Declaration of Array :
        int [] arr ;

        arr = new int[5];

        arr[0] = 100;

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(arr.length);
    

        // 2D Array : Array of Array

        int [][] arr2 = new int[3][3];

        System.out.println("Enter the elements of 2D Array : ");
        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
            
        }


        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.err.println();
        }

        // Jagged Array :

        int [][] arr3 = new int[3][];

        arr3[0] = new int[2];
        arr3[1] = new int[4];
        arr3[2] = new int[6];

        System.out.println("Enter the elements of Jagged Array : ");
        for(int i = 0; i < arr3.length; i++)
        {
            for(int j = 0; j < arr3[i].length; j++)
            {
                arr3[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr3.length; i++)
        {
            for(int j : arr3[i])
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
}
