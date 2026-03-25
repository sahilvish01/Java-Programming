// for each loop for 2d arr

import java.util.Scanner;
public class c4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

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
