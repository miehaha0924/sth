package trycatchfinally;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(add(a, b));
    }

    public static int add(int a, int b) {
        int sum = 0;
        try {
            sum = a + b;
            //throw new ArithmeticException();
            return sum;
        } catch (Exception e) {
            System.out.println("捕获到异常");
            return sum + 1;
        } finally {
            System.out.println("执行了finally");
        }
        //return sum + 2;
    }
}
