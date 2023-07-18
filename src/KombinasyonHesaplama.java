import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r, nfakt = 1, rfakt = 1, nrfakt = 1, sonuc = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n'i giriniz: ");
        n = scanner.nextInt();
        System.out.print("r'yi giriniz: ");
        r = scanner.nextInt();

        for (int i =1 ; i <= n; i++){
            nfakt *= i;
        }
        System.out.println("n: " + nfakt);

        for (int i = 1; i<= r; i++){
            rfakt *= i;
        }
        System.out.println("r: " + rfakt);

        for (int i = 1; i <= (n-r); i++){
            nrfakt *= i;

        }
        System.out.println("n - r : " + nrfakt);

        sonuc = nfakt / (rfakt * nrfakt);

        System.out.println("Kombinasyon sonucu: " + sonuc);
    }
}
