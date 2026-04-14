public class c10
{
    public static void main(String[] args)
    {
        int arr[] = {3,9,0,6,8,5,0,6,0};

        for(int i = 0,j=0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }


    }

    
}