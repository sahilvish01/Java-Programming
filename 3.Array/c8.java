public class c8
{
    public static void main(String[] args)
    {
        int arr[] = {1,20,7,15,6,8,5,2};

        int result[] = new int[arr.length];

        result[0] =arr[arr.length-1];
        int j=1;
        for(int i = arr.length-2; i >=0 ; i--)
        {
            if(arr[i] > result[j-1])
            {
                result[j] = arr[i];
                j++;

            }
        }

        for(int i = 0; i < j; i++)
        {
            System.out.println(result[i]);
        }
        
    }
}