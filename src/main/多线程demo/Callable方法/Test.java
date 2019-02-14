package main.多线程demo.Callable方法;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            CaSuShu caSuShu = new CaSuShu(i * 100 + 1, i * 100 + 100);
            FutureTask<Integer> futureTask = new FutureTask<>(caSuShu);
            Thread thread = new Thread(futureTask);
            thread.start();
            int result = futureTask.get();
            total += result;
        }
        Thread.sleep(1000);
        System.out.println();
        System.out.println(total);
    }
}
