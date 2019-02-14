package main.冒泡排序;

public class BubbleSort {
    public static void sort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {8, 4, 1, 3, 2, 5};
        sort(array);
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
