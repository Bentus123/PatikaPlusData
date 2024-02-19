package Collection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("3 adet sayı giriniz");
		int a,b,c;
		Scanner input = new Scanner(System.in);
		a= input.nextInt();
		b= input.nextInt();
		c=input.nextInt();
		System.out.println("Sonuç:" +(((a+b)*c)-b));
		
		
	}

}
