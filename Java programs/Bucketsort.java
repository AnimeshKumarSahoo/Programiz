public class Bucketsort {
    public static void sort(int[] array, int lowerRange, int upperRange) {
        int i, j;
        int size = array.length;
        int range = upperRange - lowerRange;
        int[] count = new int[range];
        System.out.println("Frequencies of lements of the array");
        for (i = 0; i < size; i++) {
            count[array[i] - lowerRange]++;
        }
        j = 0;
        for (i = 0; i < range; i++) {
            while  (count[i] > 0) {
            array[j++] = i + lowerRange;
            (count[i])--;
            }
            }
            }
            public static void main(String[] args) {
            int[] array = { 23, 24, 22, 21, 26, 25, 27, 28, 21, 21 };
            sort(array, 20, 30);
            for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
            }
                  
}
