package DSA;

public class MaxMininstring {
    public static void find(String str){
        if(str==null)
            return;
        String [] words = str.split(" ");
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        String smallestWord = "";
        String largestWord = "";
        for (int i = 0; i <words.length ; i++) {
            String word = words[i];
            int len = word.length();
            if(len>largest){
                largest = len;
                largestWord = word;
            }
            if(len<smallest) {
                smallest = len;
                smallestWord = word;
            }
        }
        System.out.println("Input String: " + str);
        System.out.println("Smallest Word: " + smallestWord);
        System.out.println("Largest Word: " + largestWord);
    }
    public static void main(String[] args) {
        String str = "I am here to help you out";
        find(str);
    }
}

