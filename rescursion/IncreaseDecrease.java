public class IncreaseDecrease{
    public static void printIncreaseDecrease(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printIncreaseDecrease(n-1);
        if(n>1){
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        int n=5;
        printIncreaseDecrease(n);
    }
}