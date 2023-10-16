import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
     
        String originalStr = scanner.nextLine();
        scanner.close();
     
        String words[] = originalStr.split("\\s");
        String reversedString = "";
     
        for (int i = words.length-1;i>=0;i--) 
        {
          String word = words[i];
          reversedString = reversedString + word+" ";
        }
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}
