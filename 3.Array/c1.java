// Array :

import java.util.Scanner;
public class c1
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // Declaration of array :
        int [] arr = new int[5];

        System.out.print("Enter the elements in the array : ");
        // Inputing Array :
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        // printing all the elements of array :
        for(int temp : arr)
        {
            System.out.print(temp + " ");
        }

        System.out.println();

        int sum = 0;
        // Sum of array :
        for(int temp : arr)
        {
            sum += temp;
        }

        System.out.println("Sum of Array : " + sum);

    }
}