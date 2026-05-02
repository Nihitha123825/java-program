import java.util.Arrays;

class arraycopy {
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};

        int arr[] = Arrays.copyOf(a, a.length);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}