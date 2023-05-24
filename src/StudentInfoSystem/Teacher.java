package StudentInfoSystem;

public class Teacher {        // phoneNo: Telefon numarası, branch: bölümü

    String name;
    String phoneNo;
    String branch;

    Teacher(String name, String branch, String phoneNo ){
        this.name = name;
        this.branch = branch;
        this.phoneNo = phoneNo;

    }

    void print(){
        System.out.println("Adi: " + this.name);
        System.out.println("Telefonu: " + this.phoneNo);
        System.out.println("Bölümü: " + this.branch);
    }




}
