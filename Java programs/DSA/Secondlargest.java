package DSA;

import java.util.Arrays;
public class Secondlargest {
    static void secondlargest(int arr[],int n){
  Arrays.sort(arr);
  for (int i =n- 2; i >= 0; i--)
 {  
    if (arr[i] != arr[n - 1])
    {
      System.out.printf("The second largest element in the array is:"+ arr[i]);
      break;
    }
  }
}
public static void main(String[] args)
{
  int arr[] = {2,7,8,9,6};
  int n = arr.length;
  secondlargest(arr, n);
}
}


