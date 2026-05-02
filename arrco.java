class arrco
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};
        int arr[] = new int[4];
        System.arraycopy(a, 0, arr, 0, 4);
        for(int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}