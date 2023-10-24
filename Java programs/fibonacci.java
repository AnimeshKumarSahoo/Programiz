class fibonacci {
    static int num_1 = 0, num_2 = 1, num_3 =0;
    
    static void fibo(int n){
        if(n>0){
            num_3 = num_1 +  num_2;
            num_1 = num_2;
            num_2 = num_3;
            System.out.print(" " + num_2);
            fibo(n-1);
        }
    }
    public static void main(String[] args) {
        int num_1 = 0;
        int num_2 = 1;
        int n = 15;
        System.out.print(num_1 + " " + num_2);
        fibo(n-2);
    
    }
    
}