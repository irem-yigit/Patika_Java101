import java.util.Scanner;

public class DordunKatlariniBulma {
    public static void main(String[] args) {

        int n,toplam = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz: ");
            n = scanner.nextInt();

            if (n % 4 == 0){
                toplam += n;
            }
        }while (n % 2 != 1);
        System.out.println("Toplam : " + toplam);
    }
}
