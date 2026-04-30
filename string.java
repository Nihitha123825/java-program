class string{
    public static void main(String args[])
    {
        String a = "HELLO";
        String b = "hell";
        System.out.println(a.length());
        if(a.isEmpty())
        {
            System.out.println("empty");
        }
        else{
            System.out.println("not empty");
        }
        System.out.println(a.isBlank());
         System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
     System.out.println(a.compareTo(b));
    System.out.println(a.contains(b));
    System.out.println(a.charAt(1));
    System.out.println(b.substring(1));
  System.out.println(b.indexOf("e"));
  System.out.println(b.trim());
 System.out.println(b.strip());
System.out.println(a.replace("H","a"));
System.out.println(b.repeat(2));
System.out.println(b.toUpperCase());
System.out.println(b.startsWith("o"));
System.out.println(a.endsWith("O"));
System.out.println(a.toLowerCase());



      

     }
}