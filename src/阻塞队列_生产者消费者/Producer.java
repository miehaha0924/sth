package 阻塞队列_生产者消费者;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread {
    private int taskNum;
    private ArrayBlockingQueue queue;

    public Producer(int taskNum, ArrayBlockingQueue queue) {
        this.taskNum = taskNum;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(2000);
            System.out.println("开始生产");
            queue.add(taskNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
