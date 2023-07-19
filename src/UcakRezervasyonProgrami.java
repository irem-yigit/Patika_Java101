import java.util.Scanner;

public class UcakRezervasyonProgrami {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double normalTutar, indirimliTutar, toplamTutar, yasIndirimi = 0, biletIndirimi = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1- Tek Yön, 2- Gidiş - Dönüş): " );
        yolculukTipi = scanner.nextInt();

        if (yas > 0 && mesafe > 0){
            switch (yolculukTipi){
                case 1:
                    if (yas <= 12 ){
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 50/100;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar: " + indirimliTutar + " TL");
                    }
                    else if (yas > 12 && yas <= 24){
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 10/100;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar: " + indirimliTutar + " TL");

                    }
                    else if (yas <= 65){
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 30/100;
                        System.out.println("Toplam tutar: " + normalTutar + " TL");
                    }

                    else{
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 30/100;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar: " + indirimliTutar + " TL");
                    }
                    break;
                case 2:
                    if (yas <= 12 ){
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 50/100;
                        indirimliTutar = normalTutar - yasIndirimi;
                        biletIndirimi = indirimliTutar * 20/100;
                        toplamTutar = (indirimliTutar - biletIndirimi) * 2;
                        System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    }
                    else if (yas > 12 && yas <= 24){
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 10/100;
                        indirimliTutar = normalTutar - yasIndirimi;
                        biletIndirimi = indirimliTutar * 20/100;
                        toplamTutar = (indirimliTutar - biletIndirimi) * 2;
                        System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    }
                    else if (yas <= 65){
                        normalTutar = mesafe * 0.10;
                        indirimliTutar = normalTutar - yasIndirimi;
                        biletIndirimi = indirimliTutar * 20/100;
                        toplamTutar = normalTutar - biletIndirimi;
                        System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    }
                    else{
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 30/100;
                        indirimliTutar = normalTutar - yasIndirimi;
                        biletIndirimi = indirimliTutar * 20/100;
                        toplamTutar = indirimliTutar - biletIndirimi;
                        System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    }
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız...");
                    break;
            }
        }
        else {
            System.out.println("Geçersiz değer girdiniz.");
        }
    }
}
