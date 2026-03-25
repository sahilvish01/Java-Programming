public class c6 {

    public static void main(String[] args)
    {
        int arr[] = {2,4,6,8,7};
        int max = arr[0]; 
        int min = arr[0]; 
        for(int i =1; i< arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];

            }

            if(arr[i] > max)
            {
                max = arr[i];
            }
            
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        

    }
    
}
