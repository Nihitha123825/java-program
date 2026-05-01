import java.util.*;
class method
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
          System.out.println("enter your task");
        String s1 = s.nextLine();
        method2 a = new method2();
        a.task(s1);

    }
}

class method2{
     void task(String a)
     {

        
        if(a.isBlank())
        {
            System.out.println("task is not entered");
        }
        else{
            System.out.println("task is entered:"+a);
        }



     }
}