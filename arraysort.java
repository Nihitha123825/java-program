import java.util.*;

class arraysort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list); 


        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.contains(1));

    }
}