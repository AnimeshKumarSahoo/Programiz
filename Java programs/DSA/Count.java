package DSA;
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        int alph,digi,spl;
		 alph=digi=spl=0;
		Scanner sc= new Scanner(System.in);
		System.out.print( "Enter the string");
		String str = sc.nextLine();
		for(int i = 0; i <str.length(); i++)
		{
			char ch =str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("Number of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}

