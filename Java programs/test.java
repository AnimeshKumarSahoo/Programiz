package CSW.CSW2;

public class test {
    public static void main(String[] args) {
        int n = 5, m = 4;
        int arr[] = { 3, 1, 2, 4, 5 };

        System.out.println(diffSum(n, m, arr));

    }

    // static void merge(int arr[], int l, int m, int r) {
    //     // Find sizes of two subarrays to be merged
    //     int n1 = m - l + 1;
    //     int n2 = r - m;

    //     /* Create temp arrays */
    //     int L[] = new int[n1];
    //     int R[] = new int[n2];

    //     /* Copy data to temp arrays */
    //     for (int i = 0; i < n1; ++i)
    //         L[i] = arr[l + i];
    //     for (int j = 0; j < n2; ++j)
    //         R[j] = arr[m + 1 + j];

    //     /* Merge the temp arrays */

    //     // Initial indexes of first and second subarrays
    //     int i = 0, j = 0;

    //     // Initial index of merged subarray array
    //     int k = l;
    //     while (i < n1 && j < n2) {
    //         if (L[i] <= R[j]) {
    //             arr[k] = L[i];
    //             i++;
    //         } else {
    //             arr[k] = R[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     /* Copy remaining elements of L[] if any */
    //     while (i < n1) {
    //         arr[k] = L[i];
    //         i++;
    //         k++;
    //     }

    //     /* Copy remaining elements of R[] if any */
    //     while (j < n2) {
    //         arr[k] = R[j];
    //         j++;
    //         k++;
    //     }
    // }

    // // Main function that sorts arr[l..r] using
    // // merge()
    // static void sort(int arr[], int l, int r) {
    //     if (l < r) {
    //         // Find the middle point
    //         int m = l + (r - l) / 2;

    //         // Sort first and second halves
    //         sort(arr, l, m);
    //         sort(arr, m + 1, r);

    //         // Merge the sorted halves
    //         merge(arr, l, m, r);
    //     }
    // }

    public static int diffSum(int n, int m, int arr[]) {
        int diff = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int x = arr.length - 1, a = 0, b = 0, c = x - m;

        while (x > c) {
            a += arr[x];
            x--;
        }

        x = 0;
        c = x + m;
        while (x < c) {
            b += arr[x];
            x++;
        }
        diff = a - b;

        return diff;
    }
}
