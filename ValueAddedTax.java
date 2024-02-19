import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variable formation
        int amount;
        int vat;
        int total;
        //ask user for expense amount
        System.out.println("KDV hesaplaması için kullanacaığınız para değerini belirtin : ");
        Scanner input = new Scanner(System.in);
        // prompt user for data entry
        amount = input.nextInt();
        // VAT calculation and total pricing based on user prompt
        if (amount > 0 && amount < 1000) {
            vat = (amount * 18) / 100;
            total = amount + vat;
            System.out.println("KDV bedeli : " + vat + " Toplam Tutar : " + total);
        }
        else {
            vat = (amount * 8) / 100;
            total = amount + vat;
            System.out.println("KDV bedeli : " + vat + " Toplam Tutar : " + total);
        }

    }

}