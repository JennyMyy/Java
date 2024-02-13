package tentti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Osallistumismaksu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		
		System.out.print("Osallistuja (OS) / Katsoja (KA): ");
		String osallistuja = input.nextLine();
		double maksu = 0;
		
		 if (osallistuja.equals("KA")){
			System.out.print("Ikä: ");
			int ika = input.nextInt();
			input.nextLine();
			if (ika < 18) {
				maksu = 8;
			} else {
				maksu = 12.50;
			}	
		} else if (osallistuja.equals("OS" )) {
			System.out.print("Nuoret (NU) / Aikuiset (AI): ");
			String ikaNU = input.nextLine();
			if (ikaNU.equals("NU")) {
				maksu = 10;
				
			} else {
				maksu = 20;
			}	
		}

		System.out.println("Maksu on " + des.format(maksu) + " euroa");
		
		input.close();
	}
}
