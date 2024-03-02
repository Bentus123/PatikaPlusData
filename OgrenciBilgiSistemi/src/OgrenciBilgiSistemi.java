
public class OgrenciBilgiSistemi {
    public static void main(String[] args) {

       Teacher t1 = new Teacher("Müzo","TRH", "457895");
       Teacher t2 = new Teacher("Graham Bell", "FZK", "4875221");
       Teacher t3 = new Teacher("Kül Yutmaz", "BIO", "8414351");

       Course tarih = new Course("Tarih","101","TRH");
       tarih.addTeacher(t1);

       Course fizik = new Course("Fizik","102","FZK");
       fizik.addTeacher(t2);

       Course bio = new Course("Biyoloji","103","BIO");
       bio.addTeacher(t3);

       Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,bio);
       s1.addBulkExam(100,78,50,90,40,60);
       s1.isPass();
       s1.PrintNote();

       Student s2 = new Student("Düdük Necmi","444","4",tarih,fizik,bio);
       s2.addBulkExam(50,30,70,20,75,25);
       s2.isPass();
       s2.PrintNote();
    }
}