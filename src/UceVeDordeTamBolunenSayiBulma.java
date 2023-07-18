import java.util.Scanner;

public class UceVeDordeTamBolunenSayiBulma {
    public static void main(String[] args) {

        int k, toplam = 0, ortalama, iterasyon = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        k = scanner.nextInt();

        for (int i = 0; i<= k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                iterasyon ++;
                toplam += i;
                System.out.println(i);
            }
        }
        ortalama = toplam / iterasyon;
        System.out.println("3'e ve 4'e bölünen sayıların toplamı: " + toplam);
        System.out.println("3'e ve 4'e bölünen sayıların ortalaması: " + ortalama);
    }
}
