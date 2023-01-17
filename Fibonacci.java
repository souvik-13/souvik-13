public class Fibonacci {
    static int fibonacci(int n){
        int t;
        if(n==1) t=0;
        if(n==2) t=1;
        t = fibonacci(n-1)+fibonacci(n-2);
        System.out.print(t+"  ");
        return t;
    }
    public static void main(String[] args) {
        
    }
}
