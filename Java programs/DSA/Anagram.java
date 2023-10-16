package DSA;
import java.util.Arrays;
public class Anagram {
    static boolean check(char[] str1, char[] str2)
    {
        int l1 = str1.length;
        int l2 = str2.length;
        if (l1 != l2)
        return false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < l1; i++)
        if (str1[i] != str2[i])
        return false;
        return true;
    }
    public static void main(String args[])
    {
        char str1[] = { 'l', 'i', 's', 't','e','n' };
        char str2[] = { 's', 'i', 'l','e','n','t' };
        if (check(str1, str2))
            System.out.println("The two strings are"+ " anagram of each other");
        else
            System.out.println("The two strings are not"+ " anagram of each other");
    }
    
}
