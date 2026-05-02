class random
{
    public static void main(String args[])
    {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append("world");
    System.out.println(sb);
    sb.replace(0,5,"wow");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    
    System.out.println(sb.capacity());
    System.out.println(sb.insert(3,"hi"));
    System.out.println(sb.delete(0,5));
    System.out.println(sb.charAt(2));
    sb.trimToSize();
    System.out.println(sb);
    }
}

 