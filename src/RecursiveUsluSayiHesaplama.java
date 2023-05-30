import java.util.Scanner;

public class RecursiveUsluSayiHesaplama {

    static int power(int taban, int us){

        int result = 1;
        for (int i = 1; i<= us; i++){
            result *= taban;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban degeri giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs degeri giriniz: ");
        int us = scanner.nextInt();

        System.out.println("Sonuc: " + power(taban, us));
        
    }
}
