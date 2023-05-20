public class PalindromSayiHesaplama {

    /*Palindromik sayı, iki taraftan okunduğu zaman, okunuş yönüyle aynı olan sayılardır.
      Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/

    static boolean isPalindrom(int number){
        int temp = number;              //temp (geçici değişken), kullanıcının girdiği sayı
        int reverseNumber = 0;          //reverse = ters
        int lastNumber = 0;

        while(temp != 0){             //Neden 0 yaptım, çünkü gezeceğim basamak kalmadığında, programın en son 0 olup döngüden çıkmasını istiyorum.
            System.out.println("-----------");
            System.out.println("Sayı -> " + temp);

            lastNumber = temp % 10;   //Kullanıcının girdiği sayının(temp) 10'a bölümünden kalan lastı verir. Mod bulma işlemi
            System.out.println("Son basamak -> " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayı -> " + reverseNumber);

            temp /= 10;
            System.out.println("Yeni temp -> " + temp);
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(1));

    }
}
