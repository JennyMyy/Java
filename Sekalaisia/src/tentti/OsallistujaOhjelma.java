package tentti;

import java.util.Scanner;

public class OsallistujaOhjelma {
	Osallistuja osallistuja = new Osallistuja();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Osallistuja osallistuja = new Osallistuja();
		
		System.out.print("Anna osallistujan nimi: ");
		osallistuja.setNimi(input.nextLine());
		System.out.print("Anna kansallisuus: ");
		osallistuja.setKansallisuus(input.nextLine());
		System.out.print("Anna syntymävuosi: ");
		osallistuja.setSyntymavuosi(input.nextInt());
		
		System.out.println("Nimi: " + osallistuja.getNimi());
		System.out.println("Kansallisuus: " + osallistuja.getKansallisuus());
		System.out.println("Syntymävuosi: " + osallistuja.getSyntymavuosi());

	}

}
