class clobj
{
    public static void main(String args[])
    {
      clobj2 o = new clobj2();
      o.add();
      System.out.println(o.a);
      
      System.out.println(clobj2.b);


    }
}
class clobj2
{
 int a = 20;
 static int b = 30;
void add()
{
int a = 10;
final int c = 25;
System.out.println(a);
System.out.println(c);

}
}