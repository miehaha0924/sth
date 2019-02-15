package 多线程demo.Thread或Runnable方法;

public class CalSuShu implements Runnable {
    private int star;
    private int end;

    CalSuShu(int start, int end) {
        this.star = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = star; i < end; i++) {
            if (i == 1) {
                continue;
            }
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                Test.total++;
                System.out.print(i + " ");
            }
        }
    }

}
