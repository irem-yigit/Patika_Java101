import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = scanner.nextInt();

        double sonuc = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız: " + sonuc);

        String ortalama = (sonuc > 60) ? "Geçtiniz" : "Kaldınız ";
        System.out.println(ortalama);

    }
}
