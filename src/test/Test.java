package test;

public class Test {
    public static void main(String[] args) {
        int[] A = new int[]{9, 7, 8, 5, 2, 1, 7, 3, 4, 6};
        System.out.println(findDupli(A));
        String str = "miehaha";
        String str2 = new String("miehaha");
        System.out.println(str.equals(str2));
    }

    private static int findDupli(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        for (int i = 0; i < len; i++) {
            B[i] = -1;
        }
        for (int i = 0; i < len; i++) {
            if (B[A[i]] == -1) {
                B[A[i]] = A[i];
            } else {
                return A[i];
            }
        }
        return -1;
    }
}
