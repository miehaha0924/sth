package 接口和抽象类;

public class Test2 extends Test {
    public Test2(int a) {
        super(a);
    }

    @Override
    protected void method2() {
        System.out.println("实现了抽象方法");
    }

    public static void main(String[] args) {
        Test t1 = new Test2(90);
        t1.method();
        t1.method2();
    }
}
