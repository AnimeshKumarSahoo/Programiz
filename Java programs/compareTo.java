import java.util.Scanner;
public class compareTo {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Original string : ");
    String originalStr = scanner.nextLine();
    String words[] = originalStr.split("\\s");
    String reversedString = "";
    for (int i = words.length-1; i>=0; i--) 
    {
      String reverseWord = "";
      String word = words[i];
      for (int j = word.length() - 1; j >= 0; j--) {
        reverseWord = reverseWord + word.charAt(j);
      }
      reversedString = reversedString + reverseWord + " ";
    }
    System.out.print("Reversed string : " + reversedString);
}
}
