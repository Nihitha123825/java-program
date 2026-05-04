class index
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        try
        {
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Out Of Bounds!!!");
        }
        try 
        {
            System.out.println(arr[-1]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Out Of Bounds (negative index)");
        }
        try
        {
            int i=5;
            System.out.println(arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("original index");
        }

    }
}

