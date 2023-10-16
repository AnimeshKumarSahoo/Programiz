public class Mindiff_twoarrays {
    public static int mindiff(int[] A, int[] B, int m, int n) {
        int minDiff = Integer.MAX_VALUE; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int diff = Math.abs(A[i] - B[j]); 
                if (diff < minDiff) {
                    minDiff = diff; 
                }
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 11, 5};
        int[] B = {4, 12, 19, 23};
        int m = A.length;
        int n = B.length;
        System.out.println("The minimum difference of two elements in both the arrays is:"+mindiff(A, B, m, n));
    }
}

