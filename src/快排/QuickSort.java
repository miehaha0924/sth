package 快排;

public class QuickSort {
    public static int sort(int[] array, int low, int high) {
        int key = array[low];
        while (high > low) {
            while (high > low && array[high] > key) {
                high--;
            }
            array[low] = array[high];
            while (high > low && array[low] < key) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = key;
        return low;
    }

    public static void findMiddle(int[] array, int low, int high) {
        if (low > high) {
            return;
        }
        int middle = sort(array, low, high);
        findMiddle(array, low, middle - 1);
        findMiddle(array, middle + 1, high);
    }

    public static void main(String[] args) {
        int[] array = {8, 4, 1, 3, 2, 5};
        findMiddle(array, 0, array.length - 1);
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}

