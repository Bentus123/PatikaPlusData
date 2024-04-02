
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Book> set = new TreeSet<>();

        set.add(new Book(1, "İnsan Olmak", "Engin Gençtan", 192, 2016));
        set.add(new Book(2, "Seks ve Ceza", "Eric Berkowitz", 432, 2016));
        set.add(new Book(3, "Dissolution ", "Richard Lee Byers", 384, 2002));
        set.add(new Book(4, "Prince of Lies", "James Lowder", 384, 1993));
        set.add(new Book(5, "Crucible: The Trial of Cyric the Mad", "Troy Denning", 384, 1998));

        System.out.println("Alfabetik Sırala : \n");
        for (Book book : set) {
            System.out.println(book.getID() + " - " + book.getBookName() + " - " +
                    book.getAuthorName() + " - " + book.getPageNumber() + " - " + book.getPublishDate());
        }

        System.out.println("=============================================");
        System.out.println("Sayfa Sayısına Göre Sırala : \n");



        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book> () {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        set2.add(new Book(1, "İnsan Olmak", "Engin Gençtan", 192, 2016));
        set2.add(new Book(2, "Seks ve Ceza", "Eric Berkowitz", 432, 2016));
        set2.add(new Book(3, "Dissolution ", "Richard Lee Byers", 384, 2002));
        set2.add(new Book(4, "Prince of Lies", "James Lowder", 384, 1993));
        set2.add(new Book(5, "Crucible: The Trial of Cyric the Mad", "Troy Denning", 384, 1998));


        for (Book book : set2) {
            System.out.println(book.getID() + " - " + book.getBookName() + " - " +
                    book.getAuthorName() + " - " + book.getPageNumber() + " - " + book.getPublishDate());
        }
    }
}