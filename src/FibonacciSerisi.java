public class FibonacciSerisi {
    public static void main(String[] args) {

        int a=1;
        int b=1;
        int sonuc;

        System.out.println(a);
        System.out.println(b);

        for (int i =1; i<=9; i++){
            sonuc = a + b;
            a = b;
            b = sonuc;
            System.out.println(sonuc);
        }
    }
}
