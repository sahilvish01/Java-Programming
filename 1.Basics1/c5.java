// Print Sum of given digits

package lect1;
class c5 {

    public static void main(String[] args)
    {
        int a = 123;
        int sum = 0;

        for(;a!=0;a=a/10)
        {
            int last = a%10;

            sum = sum + last;

        }

            System.out.print("Sum : ");
            System.out.println(sum);

    }
    
}
