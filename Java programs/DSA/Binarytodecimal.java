package DSA;
public class Binarytodecimal {
    public static void main(String[] args) {
        int num = 1101;
        int decimal = convert(num);
        System.out.println("Binary to Decimal");
        System.out.println(num + " = " + decimal);
      }
      public static int convert(int num) {
        int d = 0, i = 0;
        int r;
        while (num != 0) {
          r = num % 10;
          num /= 10;
          d += r * Math.pow(2, i);
          i++;
        }
        return d;  
}
}
