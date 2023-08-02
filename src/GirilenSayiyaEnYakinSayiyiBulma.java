import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayiyaEnYakinSayiyiBulma {

    public static void main(String[] args) {

        int[] list= {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(list);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int min = sayi;
        int max = sayi;

        for ( int i : list){
            if (i > sayi){
                max = i;
                break;
            }
        }
        for (int i = list.length -1 ; i >= 0; i--){
            if (list[i] < sayi){
                min = list[i];
                break;
            }
        }

        System.out.println("En yakın büyük sayı: " + max);
        System.out.println("En yakın küçük sayı: " + min);
    }
}
