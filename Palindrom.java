//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            System.out.println("================");
            System.out.println("Sayı =>" + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber ;
            System.out.println("Yeni Sayı => " + reverseNumber);
            temp /= 10;


        }
        if(number != reverseNumber){
            System.out.println(number + " Palindrom Sayı Değildir.");
        }
        else
            System.out.println(number + " Palindrom Sayıdır.");
        return  true;
    }

    public static void main(String[] args) {

        isPalindrom(36565);


    }
}