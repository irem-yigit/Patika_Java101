import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double kilo = 0,fiyat = 0,armut,elma,domates,muz,patlıcan,tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armut = scanner.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elma = scanner.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domates = scanner.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muz = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlıcan = scanner.nextDouble();

        tutar = (armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlıcan * 5.00);

        System.out.println("Toplam tutar: " + tutar);
    }
}
