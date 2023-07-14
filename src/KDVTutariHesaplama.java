import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tutar,kdvTutar,kdvliTutar,kdvOran = 0.18;

        System.out.print("Ücret tutarını giriniz: ");
        tutar = scanner.nextDouble();

        kdvOran = tutar < 1000 ? 0.18 : 0.8;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

    }
}
