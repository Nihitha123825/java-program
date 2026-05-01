import java.util.*;
class method1
{
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter expense name: ");
        String a = s1.nextLine();
        System.out.println("enter price: ");
        int b = s1.nextInt();
        method2 s2 = new method2();
        s2.expensive(a,b);
    }
}
class method2{

    void expensive(String str, int b)
    {
        Scanner sc = new Scanner(System.in);
         int a;
         int total = 0;
        while(true)
         {
             a = sc.nextInt();
             if(a==0)
             {
                 break;
             }
             total = total+b;
            
        }
      
         System.out.println("total price: "+total);
     }


    
}