import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {

        int basamakSayisi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz: ");
        basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--){
            for (int j = 0; j < basamakSayisi - i; j++){
                System.out.print("");
            }
            for (int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
