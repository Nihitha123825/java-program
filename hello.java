class hello
{
    public static void main(String args[]){
    int mark1 = 90;
    int mark2 = 80;
    int mark3 = 70;
    if(mark1 > mark2)
    {
        System.out.println("Grade A");

    }
     if (mark2 > mark3)
    {
        System.out.println("Grade B");
    }
    else if(mark3 < mark1)
    {
        System.out.println("Grade c");
    }
    else{
        System.out.println("Grade d");
    }
}
}