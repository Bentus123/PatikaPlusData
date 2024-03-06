import java.util.Scanner;

public class Palindrom_Sayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir şeyler yazın");
        String klm = input.nextLine();

        if (isPalindrome(klm)) {
            System.out.println(klm + " palindromdur");
        } else {
            System.out.println(klm + " palindrom değildir.");
        }
    }
    public static boolean isPalindrome(String klm) {
        int length = klm.length();
        for (int i = 0; i < length / 2; i++) {
            if (klm.charAt(i) != klm.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}