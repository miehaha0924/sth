package 多线程demo.Callable方法;

import java.util.concurrent.Callable;

public class CaSuShu implements Callable {
    private int start;
    private int end;

    public CaSuShu(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int total = 0;
        for (int i = start; i < end; i++) {
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
                System.out.print(i + " ");
                total++;
            }
        }
        return total;
    }

}
