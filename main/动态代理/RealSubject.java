package 动态代理;

public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want rent my house!");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello " + str);
    }
}
