public class A3Q12 {
    public static void Sum(int[] A, int[] B, int m, int n,int value) { 
        int sum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                 sum=A[i]+B[j];
                if (sum==value) {
                    System.out.println("The elements which give sum equals to value are:"+A[i]+" "+B[j]);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 11, 5};
        int[] B = {4, 12, 19, 23};
        int value=14;
        int m = A.length;
        int n = B.length;
        Sum(A, B, m, n, value);
    }
}
