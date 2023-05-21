public class RecursiveFibonacciSerisiHesaplama {
    // Fibonacci 1 1 2 3 5 8 13 21    Fibonacci dizisi, her sayının kendinden önceki sayı ile toplanması sonucu oluşan bir sayı dizisidir.
    //f(n) = f(n-1) + f(n-2)
    //f(6) = f(5) + f(4)
    //f(5) = f(4) + f(3)

    public static int fib(int n){
        if (n <= 1 )
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            System.out.println(fib(i));
        }
        //System.out.println(fib(10));
    }
}
