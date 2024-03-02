public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String Classes;
    double average;
    boolean isPass;

    double SınıfOrtalama1,SınıfOrtalama2,SınıfOrtalama3;

    Student(String name, String stuNo, String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.Classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExam(int note1, int note2, int note3, int SozluNot1,int SozluNot2,int SozluNot3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if(SozluNot1 >= 0 && SozluNot1 <= 100){
            this.c1.SozluNot1 = SozluNot1;
        }
        if(SozluNot2 >= 0 && SozluNot2 <= 100){
            this.c2.SozluNot2 = SozluNot2;
        }
        if(SozluNot3 >= 0 && SozluNot3 <= 100){
            this.c3.SozluNot3 = SozluNot3;
        }
    }

    void isPass(){

        this.SınıfOrtalama1 = (c1.SozluNot1 * 0.20) + (c1.note * 0.80);
        this.SınıfOrtalama2 = (c2.SozluNot2 * 0.20) + (c2.note * 0.80);
        this.SınıfOrtalama3 = (c3.SozluNot3 * 0.20) + (c3.note * 0.80);
        this.average = (this.SınıfOrtalama1 + this.SınıfOrtalama2 + this.SınıfOrtalama3) / 3.0;
        if(this.average > 55){
            System.out.println("Sınıf Başarı İle Geçtiniz!!!");
        }else  {
            System.out.println("Sınıfta Kaldınız, Muhuhahahahaha!!!!!!");
        }
    }

    void PrintNote(){
        System.out.println("===============================================");
        System.out.println(this.c1.name + " Notu\t:" + this.SınıfOrtalama1);
        System.out.println(this.c2.name + " Notu\t:" + this.SınıfOrtalama2);
        System.out.println(this.c3.name + " Notu\t:" + this.SınıfOrtalama3);
        System.out.println("Ortalamanız => " + this.average);
    }



}
