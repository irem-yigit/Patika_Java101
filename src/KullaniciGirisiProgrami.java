import java.util.Scanner;

public class KullaniciGirisiProgrami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username, password;

        System.out.println("Kullanıcı adınızı giriniz: ");
        username = scanner.nextLine();

        System.out.println("Şifrenizi Giriniz: ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız...");
        }
        else if (username.equals("patika") && !password.equals("java123")){
            System.out.println("Şifreniz yanlış.Şifrenizi sıfırlamak ister misiniz?(Evet veya Hayır): ");
            String answer = scanner.nextLine();

            if (answer.equals("Evet") || answer.equals("evet")){
                System.out.println("Önceden kullanmadığınız yeni bir şifre girin: ");
                String newPassword =scanner.nextLine();

                if (newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz...");
                }
                else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else {
                System.out.println("Şifre oluşturmadınız.");
            }
        }
        else {
            System.out.println("Bilgileriniz yanlış !!");
        }
    }
}


