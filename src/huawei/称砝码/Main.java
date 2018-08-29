package huawei.称砝码;

        import java.util.*;

/**
 * 题目描述
 * 现有一组砝码，重量互不相等，分别为m1,m2,m3…mn；
 * 每种砝码对应的数量为x1,x2,x3...xn。现在要用这些砝码去称物体的重量(放在同一侧)，问能称出多少种不同的重量。
 * 注：称重重量包括0
 * 方法原型：public static int fama(int n, int[] weight, int[] nums)
 * 输入描述:
 * 输入包含多组测试数据。
 * 对于每组测试数据：
 * 第一行：n --- 砝码数(范围[1,10])
 * 第二行：m1 m2 m3 ... mn --- 每个砝码的重量(范围[1,2000])
 * 第三行：x1 x2 x3 .... xn --- 每个砝码的数量(范围[1,6])
 * 输出描述:
 * 利用给定的砝码可以称出的不同的重量数
 * 示例1
 * 输入
 * 2
 * 1 2
 * 2 1
 * 输出
 * 5
 */
public class Main {
    public static int fama(int n, int[] weight, int[] nums) {
        Set<Integer> total = new TreeSet<>();
        for (int j = 0; j <= nums[0]; j++) {
            total.add(j * weight[0]);
        }
        for (int i = 1; i < n; i++) {
            List<Integer> list = new ArrayList<>(total);
            for (int j = 1; j <= nums[i]; j++) {
                for (int k = 0; k < list.size(); k++) {
                    total.add(list.get(k) + j * weight[i]);
                }
            }
        }
        return total.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] str1 = scanner.nextLine().split(" ");
            String[] str2 = scanner.nextLine().split(" ");
            int[] weight = new int[n];
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                weight[i] = Integer.parseInt(str1[i]);
                nums[i] = Integer.parseInt(str2[i]);
            }
            System.out.println(fama(n, weight, nums));
        }
    }
}
