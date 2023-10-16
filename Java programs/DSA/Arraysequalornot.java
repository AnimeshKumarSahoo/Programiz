package DSA;
public class Arraysequalornot {
    static void  equality_checking_two_arrays(int[]arr1, int[]arr2)
  {
 boolean  res = true;
  if(arr1.length == arr2.length)
  {
  for (int i  = 0; i < arr1.length; i++)
  {
  if(arr1[i] != arr2[i])
  {
    res = false;
  }
  }
  }
  else
  {
  res = false;
  }
  if  (res)
  {
  System.out.println("Two arrays are equal.");
  }
  else
  {
  System.out.println("Two  arrays are not equal.");
  }
  }
  public static void  main(String[] args)
  {
  int[] arr1 =  {2, 5, 7, 9, 11};
  int[] arr2 =  {2, 5, 7, 8, 11};
  int[] arr3 =  {2, 5, 7, 9, 11};
  equality_checking_two_arrays(arr1,  arr2);
  equality_checking_two_arrays(arr1, arr3);
  }
    
}
