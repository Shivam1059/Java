class Test {
    public static void main(String args[]) {
        int a = 100;
        int b = 0;

        try {
            System.out.print(a / b);
        } catch (ArithmeticException e) {
            System.out.println("0 divide and give infinite");
        } finally {
            System.out.println("Your program is executed");
        }
    }
}
