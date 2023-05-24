package StudentInfoSystem;

public class Student {      //avarage: ortalama, isPass: dersi geçip geçmediğini kontrol ederiz

    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){           //Bulk: toplu   --> toplu sınav notu ekleme metodu

        if (note1 >= 0 && note1 <= 100 ){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
    }

    void isPass(){
        System.out.println("============");
        this.avarage = (this.c1.note + this.c2.note + this.c3.note ) / 3.0;
        if (this.avarage >= 45 ){
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz! ");
            this.isPass = true;
        }
        else {
            System.out.println("Sınıfta kaldınız! ");
            this.isPass = false;

        }
        printNote();
    }

    void printNote(){
        System.out.println("============");
        System.out.println(this.c1.name + " Notu: " + this.c1.note);
        System.out.println(this.c2.name + " Notu: " + this.c2.note);
        System.out.println(this.c3.name + " Notu: " + this.c3.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }


}
