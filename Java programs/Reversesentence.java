import java.util.Scanner;
public class Reversesentence {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
        String originalStr = scanner.nextLine();
        String words[] = originalStr.split(" ");
        System.out.println("Reverse of the string is:");
          for (int j = words.length - 1; j >= 0; j--) {
            System.out.println(words[j]);
}
        }
    }

