package tentti;

import java.util.ArrayList;
import java.util.Scanner;


public class OsallistujalistaSovellus {
	Osallistuja osallistuja = new Osallistuja();
	Scanner input = new Scanner(System.in);
	ArrayList<Osallistuja> osallistujat = new ArrayList<Osallistuja>();

	private void lisaaOsallistuja() {
		Osallistuja uusiOsallistuja = new Osallistuja();
		
		System.out.print("Anna osallistujan nimi: ");
		uusiOsallistuja.setNimi(input.nextLine());
		System.out.print("Anna kansallisuus: ");
		uusiOsallistuja.setKansallisuus(input.nextLine());
		System.out.print("Anna syntymävuosi: ");
		uusiOsallistuja.setSyntymavuosi(input.nextInt());
		input.nextLine();
		
		osallistujat.add(uusiOsallistuja);
		
	}

	private void naytaOsallistujat() {
		
		for (Osallistuja osallistuja: osallistujat) {
			System.out.println("Nimi: " + osallistuja.getNimi());
			System.out.println("Kansallisuus: " + osallistuja.getKansallisuus());
			System.out.println("Syntymävuosi: " + osallistuja.getSyntymavuosi());
		}
		
	}

	private void naytaKansallisuus() {
		
		System.out.println("Anna kansallisuus: ");
		String kansalaisuus = input.nextLine();
		
		for (Osallistuja osallistuja: osallistujat) {
			if (osallistuja.getKansallisuus().equals(kansalaisuus)) {
				System.out.println("Nimi: " + osallistuja.getNimi());
				System.out.println("Kansallisuus: " + osallistuja.getKansallisuus());
				System.out.println("Syntymävuosi: " + osallistuja.getSyntymavuosi());
			}
		}
		
	}

	private void muutaNimi() {
		
		System.out.print("Anna muutettavan osallistujan nimi: ");
		String muutettavaNimi = input.nextLine();
		
		for (Osallistuja osallistuja: osallistujat) {
			if (osallistuja.getNimi().equals(muutettavaNimi)) {
				System.out.print("Anna osallistujan uusi nimi: ");
				String uusiNimi= input.nextLine();
				osallistuja.setNimi(uusiNimi);
			}
		}
		
	}
	
	public static void main(String[] args) {
		OsallistujalistaSovellus sovellus = new OsallistujalistaSovellus();
		Scanner input = new Scanner(System.in);
		
		boolean valmis = true;
		
		do {
			System.out.println("1 = Lisää osallistuja");
			System.out.println("2 = Näytä kaikki osallistujat");
			System.out.println("3 = Näytä kansallisuudella");
			System.out.println("4 = Muuta osallistujan nimeä");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi (0-5): ");
			switch (input.nextInt()) {
			
			case 0:
				valmis = false;
				break;
			case 1:
				sovellus.lisaaOsallistuja();
				break;
			case 2:
				sovellus.naytaOsallistujat();
				break;
			case 3:
				sovellus.naytaKansallisuus();
				break;
			case 4:
				sovellus.muutaNimi();
				break;
			}
						
		} while (valmis);
		
	}
}
