import java.util.Scanner;
import java.util.Arrays;
public class Removeduplicate {
public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the length of the array");
int l = sc.nextInt();
int arr[] = new int[l];
System.out.println("Enter the array elements");
for (int i = 0; i < l; i++) {
arr[i] = sc.nextInt();
}
for (int i = 0; i < l - 1; i++) {
 for (int j = i + 1; j < l; j++) {
 if (arr[i] == arr[j]) {
 arr[j] = arr[l - 1];
l--;
}
}
}
System.out.println("The new array without repetition is:");
for (int i = 0; i < l; i++) {
    Arrays.sort(arr);
System.out.println(arr[i]);
        }
    }

}
