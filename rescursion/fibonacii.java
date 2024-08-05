public class fibonacii {

    public static int fibonaciii(int n){
        if(n==1){
            return  0;
        }else if(n==2){
            return 1;
        }
        int fibo=fibonaciii(n-1)+fibonaciii(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        int n=8;

        System.out.println(fibonaciii(n));
    }
}
