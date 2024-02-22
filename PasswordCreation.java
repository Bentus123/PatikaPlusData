
import java.util.Scanner;

public class PasswordCreation {
    public static void main(String[] args) {

        // Variable and scanner class creation
        int newPassword,yesNo;


        Scanner input = new Scanner(System.in);

        //Prompt user for password and username entry
        System.out.println("Enter your username : ");
        String userName = input.nextLine();

        System.out.println("Enter your password : ");
        int passWord = input.nextInt();

        if(passWord != 13579){
            System.out.println("Wrong password entry, would you like to reset it ?\n 1-Yes / 2- No");
            yesNo = input.nextInt();
            if(yesNo == 1){
                System.out.println("Enter your new password and check if you've entered the same as with the previous one");
                newPassword = input.nextInt();
                if (newPassword == passWord){
                    // mock user for stupidity
                    System.out.println("Your idiocy leaves something to be admired. You can start over and try again, or just die.");
                }
                else{
                    System.out.println("New password created, you should celebrate.\nPEASANT ");
                }
            }
        }

        else
            System.out.println("Oh its you again...");

    }
}