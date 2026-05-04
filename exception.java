class exception {
    public static void main(String[] args) {
        int a = 5;

        try {
            int b = a / 0;
            System.out.println("invalid");
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }
}