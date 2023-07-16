import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {

        int heat;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz: ");
        heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (heat <= 25){

            if (heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10){
                System.out.println("Piknik yapabilirsiniz.");
            }

        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
