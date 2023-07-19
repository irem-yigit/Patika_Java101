import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        int sayi, toplam = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0){
                toplam += i;
            }
        }

        String sonuc = toplam == sayi ? "Mükemmel sayiyi buldunuz." : "Girdiğiniz sayı mükemmel sayı değildir.";
        System.out.println(sonuc);
    }
}
