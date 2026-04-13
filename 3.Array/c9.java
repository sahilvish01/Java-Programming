// Find Missing element

public class c9 {

    public static void main(String[] args)
    {
       int arr[] = {8, 2, 4, 5, 3, 7, 1};
       
       int arrsum = 0;
       int realsum = 0;

       int i = 1;
       for(; i <= arr.length; i++)
       {
            arrsum += arr[i-1];
            realsum += i;
       }

       realsum += i;
       int missing = realsum - arrsum;

       System.out.println(missing);

    }
    
}
