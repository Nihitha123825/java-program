class stobj
{
    public static void main(String args[])
    {
        String s = "abc";
        String obj = new String("abc"); 
        System.out.println(obj);
        System.out.println(s==obj);
        System.out.println(s.equals(obj));
        System.out.println(obj.equals(s));
        
    }
}]
[