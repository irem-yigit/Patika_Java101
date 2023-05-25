package BoksMaci;

public class Fighter {    // fighter: dövüşçü, boksör * damage: hasar,zarar * health: can, dayanıklılık * weight: ağırlık, siklet * hit: vurmak
    String name;
    int damage;
    int health;
    int weight;
    int dodge;     // dodge: kaçınmak, blok yapmak

    Fighter(String name, int damage, int health, int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <=100){  //adam şansını 120 girerse 0 olarak alıcam.
            this.dodge = dodge;
        }
        else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe){           //hit: vurmak * foe: rakip
        System.out.println(this.name + " -> " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isDodge()){          //rakibim bloklayabilir mi sorgusu koydum.
            System.out.println(foe.name + " gelen hasarı blokladı! ");
            System.out.println("-----------------");
            return foe.health;          //rakibin canı azalmayacak çünkü vurma işlemini gerçekleştirmeyecek. blokladı
        }

        if (foe.health - this.damage < 0){
            return 0;
        }

        return foe.health - this.damage ;   // rakipin canını benim hasarımdan çıkarıyorum.

    }
    boolean isDodge(){  // bloklama şansını üretme metodu, şansa göre bloklama diyebiliriz.
        double randomNumber = Math.random() * 100;   //0-100 arasında double türünde random sayı üretiyorum.
        return randomNumber <= this.dodge;      //eğer random sayı, verdiğim yüzdelik şanstan küçükse o zaman bloklayabilir
    }
}
