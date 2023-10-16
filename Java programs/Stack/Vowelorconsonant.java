package Stack;

public class Vowelorconsonant {
    static void check(char ch)
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o'
            || ch == 'u'||ch=='A'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }
  
    static public void main(String[] args)
    {
        check('B');
        check('u');
    }
}
    

