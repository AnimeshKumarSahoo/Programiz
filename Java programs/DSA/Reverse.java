package DSA;

public class Reverse {
    public static void main (String[] args) {
        String str= "Animesh", rev="";
        char ch;
      System.out.print("Original string:");
      System.out.println(str);
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        rev= ch+rev; 
      }
      System.out.println("Reversed word: "+rev);
    }
}

