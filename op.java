class op
{
    public static void main(String args[])
    {
        int a = 5;
        int b = 6;
//arithmetic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
//logical
        System.out.println(a>b && b>a);
        System.out.println(a>b || b>a);
        System.out.println(5+10+"a");
//relational
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
//assignment
        System.out.println(a+=10);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
//increment
        System.out.println(a++);
        System.out.println(--b);
//bitwise
        System.out.println(a&b);
        System.out.println(a>>b);
        System.out.println(a<<b);
        System.out.println(a^b);
        System.out.println(~a);
//ternary
        int con = (a > b) ? a : b;

        System.out.println(a++ + ++a + --a);

       
    }
}