import java.util.Scanner;

public class IkininKuvvetleriniBulanProgram {
    public static void main(String[] args) {

        int n ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        n = scanner.nextInt();

        /*for (int i = 1; i <= n; i*=2){
            System.out.println(i);
        }*/

        for (int i = 1; i <= n; i*=4) {
            System.out.println("4'ün kuvvetleri: " + i);
        }
        System.out.println();

        for (int j = 1; j <= n; j *= 5){
            System.out.println("5'in kuvvetleri: " + j);
        }
    }
}
