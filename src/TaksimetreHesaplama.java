import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        int km;
        double perkm = 2.20, total, startPrice = 10;  //perkm --> km başına anlamı katıyor.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = scanner.nextInt();

        total = (km * perkm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total);
    }
}
