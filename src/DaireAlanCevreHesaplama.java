import java.util.Scanner;

public class DaireAlanCevreHesaplama {

    public static void main(String[] args) {

        double pi = 3.14;
        int r,a;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıcapını giriniz: ");
        r = scanner.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = scanner.nextInt();

        double cevre = 2 * pi * r;
        System.out.println("Dairenin cevresi: " + cevre);

        double alan = pi * r * r;
        System.out.println("Dairenin alanı: " + alan);

        double dairedilimalani = (pi * (r * r) * a)/ 360;
        System.out.println("Daire dilimi alanı: " + dairedilimalani);

    }
}
