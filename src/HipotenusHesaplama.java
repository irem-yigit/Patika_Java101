import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, alan;
        double c ;

        System.out.print("Birinci kenarı giriniz: ");
        a = scanner.nextInt();

        System.out.print("İkinci kenarı giriniz: ");
        b = scanner.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs: " + c);

        int u = (int) ((a + b + c) / 2);
        System.out.println("Çevre: " + (2 * u));

        alan = (int) ((int) u * (u-a) * (u-b) * (u-c));
        System.out.println("Alan: " + alan);
        
    }
}
