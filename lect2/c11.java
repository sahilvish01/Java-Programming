// Sorting array in ascending order

package lect2;

public class c11 {

    // arr.length : array ka size mil jata hai


    public static void main(String[] args)
    {
        int arr[] = {1,2,4567,45};


        for(int j=0;j<arr.length;j++)
        {
            for(int i =0; i< arr.length - 1; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
            }

        }

        for(int i =0 ; i < arr.length; i++)
        {
           System.out.print(" " + arr[i]);
        }
        


    }
    
}
