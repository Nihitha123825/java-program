import java.util.ArrayList;
class list
{
    public static void main(String args[])
    {
      ArrayList<Integer> list1 = new ArrayList<>();
      list1.add(5);
      list1.add(10);
      System.out.println(list1);

      list1.set(0,2);
      System.out.println(list1);
      list1.remove(1);
      System.out.println(list1);

    }
}