package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(7));
    }
    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-2) + fib(n-1);
    }
}
