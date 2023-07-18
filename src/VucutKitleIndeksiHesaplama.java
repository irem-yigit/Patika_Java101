import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        double boy, kilo, sonuc;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu(metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        sonuc = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz: " + sonuc);
    }
}
