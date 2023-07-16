import java.util.Scanner;

public class SinifGecmeProgrami {
    public static void main(String[] args) {
        int mat = 0,fizik,turkce,kimya,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = scanner.nextInt();
        
        if (mat >= 0 && mat <= 100){
        }
        else {
            System.out.println("Notunuz 0-100 arasında olmalı");
            mat = 0;
        }

        System.out.println("Fizik notunuz: ");
        fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100){

        }
        else {
            System.out.println("Notunuz 0-100 arasında olmalı");
            fizik = 0;
        }

        System.out.println("Türkçe notunuz: ");
        turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100){

        }
        else {
            System.out.println("Notunuz 0-100 arasında olmalı");
            turkce = 0;
        }

        System.out.println("Kimya notunuz: ");
        kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100){

        }
        else {
            System.out.println("Notunuz 0-100 arasında olmalı");
            kimya = 0;
        }

        System.out.println("Müzik notunuz: ");
        muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100){

        }
        else {
            System.out.println("Notunuz 0-100 arasında olmalı");
            muzik = 0;
        }

        double avarage = (mat+fizik+turkce+kimya+muzik)/5;

        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız...");
        }
        else {
            System.out.println("Tebrikler,Sınıfı geçtiniz...");
        }
        System.out.println("Ortalamanız: " + avarage);
    }
}
