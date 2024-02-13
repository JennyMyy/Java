package tehtava_5;

import java.util.Scanner;

public class RemonttiOhjelmaMetodeilla {
	Remontti remontti;
	Scanner input = new Scanner(System.in);
	
	public void teeRemontti() {
		System.out.print("Anna vuosi: ");
		int vuosi=input.nextInt();
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus=input.nextLine();
		System.out.println("Vuonna " + vuosi + " tehtiin remontti " + kuvaus);	
		remontti = new Remontti(vuosi, kuvaus);
	}
	
	public void naytaRemontti() {
		System.out.println("Vuosi: " + remontti.getVuosi());
		System.out.println("Kuvaus: " + remontti.getKuvaus());
	
	}	
	
	public void muutaRemontti(){
		System.out.print("Anna vuosi: ");
		int vuosi=input.nextInt();
		remontti.setVuosi(vuosi);
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus=input.nextLine();
		remontti.setKuvaus(kuvaus);
		System.out.println("Vuonna " + vuosi + " tehtiin remontti " + kuvaus);	
	}


	public static void main(String[] args) {
		RemonttiOhjelmaMetodeilla ohjelma = new RemonttiOhjelmaMetodeilla();
		Scanner input = new Scanner(System.in);
		boolean jatkuu=true;
		do {
		System.out.println("1. Tee remontti");
		System.out.println("2. Näytä remonttitiedot");
		System.out.println("3. Muuta remonttia");
		System.out.println("0. Lopetus");
		System.out.print("Anna valintasi (0-3): ");
		switch (input.nextInt()) {
		case 0: 
			jatkuu = false;
			break;
			case 1: 
				ohjelma.teeRemontti();
				break;
			case 2:
				ohjelma.naytaRemontti();
				break;
			case 3:
				ohjelma.muutaRemontti();
				break;				
		}
		} while (jatkuu);

	}

}
