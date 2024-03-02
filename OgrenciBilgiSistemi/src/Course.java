public class Course {

    /*
    Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.

     Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

        */
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int SozluNot1,SozluNot2,SozluNot3;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else
            System.out.println("Öğrentme ve Ders Bölümleri Uyuşmuyor!");

    }

    void printTeacherInfo(){
        this.teacher.print();
    }
    void CoursePrint(){
        System.out.println("Ders Adı : " + name);
        System.out.println("Kod : " + code);
        System.out.println("Prefix : " + prefix);
    }




}
