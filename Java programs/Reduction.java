import java.util.Arrays;
public class Reduction {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 7, 2, 8, 4};
        Arrays.sort(arr);
        int n = arr.length;
        int count = n;
        System.out.println(count+" ");
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count--;
                System.out.print(count + " ");
            }
        }
    }
}


