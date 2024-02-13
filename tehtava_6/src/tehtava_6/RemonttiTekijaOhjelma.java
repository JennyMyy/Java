package tehtava_6;

import java.util.Scanner;

public class RemonttiTekijaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna vuosi: ");
		int vuosi = input.nextInt();
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
		
		Remontti remontti = new Remontti(vuosi, kuvaus, null);
		System.out.print("Anna tekijän nimi: ");
		String nimi = input.nextLine();
		
		Henkilo_1 tekija = new Henkilo_1();
		tekija.setNimi(nimi);
		remontti.setTekija(tekija);

		System.out.print("Anna tekijän osoite: ");
		String osoite = input.nextLine();
		
		System.out.println("Vuonna "+vuosi+" tehtiin remontti " + kuvaus);
		System.out.println("Remontin teki " + nimi);
		
		input.close();
	}

}
