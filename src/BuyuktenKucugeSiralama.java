import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz: ");
        a = scanner.nextInt();

        System.out.println("2. sayiyi giriniz: ");
        b = scanner.nextInt();

        System.out.println("3. sayiyi giriniz: ");
        c = scanner.nextInt();

        if (a > b && a > c){
            if (b > c){
                System.out.println(" a > b > c");
            }
            else{
                System.out.println(" a > c > b");
            }
        }
        else if (b > a && b > c){
            if (a > c){
                System.out.println("b > a > c");
            }
            else {
                System.out.println("b > c > a");
            }
        }
        else{
            if (a > b){
                System.out.println("c > a > b");
            }
            else {
                System.out.println("c > b > a");
            }
        }
    }
}
