// For Each loop

import java.text.ListFormat.Style;
import java.util.Scanner;
public class c5 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        for(int temp[] : arr)
        {
            for(int i = 0; i < temp.length; i++)
            {
                temp[i] = sc.nextInt();
            }

        }


        for(int temp[] : arr)
        {
            for(int i : temp)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    
}
