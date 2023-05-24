package StudentInfoSystem;

public class Course {

    Teacher teacher;   //  teacher Course sınıfına ait bir nitelik olabilir. Yani sınıflar birbirlerinin nitelikleri olabilirler.
    String name;
    String code;
    String prefix;     //örneğin tarih dersine matematik eklenmemesi için, prefix ile branch'in aynı olmasını bekleyeceğim.
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher){   // Bu metot benim dışardan aldığım teacher nesnemi, içerdeki teacher nesneme atayacak.
        if (teacher.branch.equals(this.prefix)){                  //branch ile prefix'in aynı olup olmadığını kontrol ediyorum.
            this.teacher = teacher;
        }
        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }




}
