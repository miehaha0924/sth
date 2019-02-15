package 阻塞队列_生产者消费者;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread {
    private ArrayBlockingQueue queue;
    public Consumer(ArrayBlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("准备消费");
        int taskNum;
        try {
            taskNum = (int) queue.take();
            System.out.println("消费了"+taskNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
