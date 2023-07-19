import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    public static void pattern(int a){

        System.out.print(a + " ");
        if (a <= 0){
            return;
        }
        pattern(a - 5);
        System.out.print(a + " ");

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scanner.nextInt();

        System.out.print("Çıktı: " );
        pattern(n);
    }
}
