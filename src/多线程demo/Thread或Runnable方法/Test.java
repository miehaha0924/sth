package 多线程demo.Thread或Runnable方法;

public class Test {
    public static volatile int total = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            CalSuShu c = new CalSuShu(i * 100 + 1, i * 100 + 100);
            Thread t =  new Thread(c);
            t.start();
            //c.join();
        }
//        CalSuShu c1 = new CalSuShu(2,200);
//        c1.start();
//        CalSuShu c2 = new CalSuShu(201,400);
//        c2.start();
//        CalSuShu c3 = new CalSuShu(401,600);
//        c3.start();
//        CalSuShu c4 = new CalSuShu(601,800);
//        c4.start();
//        CalSuShu c5 = new CalSuShu(801,1000);
//        c5.start();
        //Thread.currentThread().join();
        Thread.sleep(1000);
        System.out.println();
        System.out.println(total);
    }
}
