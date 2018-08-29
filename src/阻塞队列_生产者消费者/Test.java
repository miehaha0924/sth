package 阻塞队列_生产者消费者;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(20);
        ThreadPoolExecutor proPool = new ThreadPoolExecutor(10,20,60,TimeUnit.MILLISECONDS,new ArrayBlockingQueue(5),new ThreadPoolExecutor.CallerRunsPolicy());
        ThreadPoolExecutor conPool = new ThreadPoolExecutor(10,20,60,TimeUnit.MILLISECONDS,new ArrayBlockingQueue(5),new ThreadPoolExecutor.CallerRunsPolicy());
        System.out.println("start");
        for (int i = 0; i < 100; i++) {
            proPool.execute(new Producer(i,queue));
            conPool.execute(new Consumer(queue));
        }
        proPool.shutdown();
        conPool.shutdown();
    }

}
