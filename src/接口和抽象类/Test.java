package 接口和抽象类;

public abstract class Test {
    int a ;

    public Test(int a) {
        this.a = a;
    }

    public void method() {
        System.out.println(a);
    }

    protected abstract void method2();


}
