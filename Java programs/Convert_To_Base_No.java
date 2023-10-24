
import java.util.Scanner;

public class Convert_To_Base_No {
	public static int normal_conv(int x, int y) {
		int temp = x;
		int res=0;
		while(temp>0) {
			res = (res*10)+(temp%y);
			temp/=y;
		}
		int rev=0;
		while(res>0) {
			rev = (rev*10)+(res%10);
			res/=10;
		}
		return rev;
	}
	
	public static void hexadec_conv(int x, int y) {
		int hexa_dec[] = new int[100];
		int i = 0;
		int temp = x;
		while(temp>0) {
			hexa_dec[i] = temp%y;
			temp/=16;
			i++;
		}
		System.out.print("HexaDecimal : ");
		for (int j=i-1; j>=0; j--) {
			if(hexa_dec[j]>9)
				System.out.print((char)(55+hexa_dec[j]));
			else
				System.out.print(hexa_dec[j]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no : ");
		int x = sc.nextInt();
		System.out.print("Enter base no : ");
		int y = sc.nextInt();
		
		if(y==16)
			hexadec_conv(x,y);
		else
			System.out.println(normal_conv(x, y));
		
	
		sc.close();
	}

}
