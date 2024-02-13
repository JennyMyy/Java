package tehtava_6;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Kirja kirja = new Kirja();
		Kustantaja kustantaja = new Kustantaja();
		
		kirja.setNimi("Java-ohjelmointi");
		kirja.setIsbn("978-952-14-3556-0");
		kirja.setHinta(65.50);
		kirja.setVuosi(2018);
		
		System.out.print("Kustantajan nimi: ");
		String nimi = input.nextLine();
		System.out.print("Kustantajan osoite: ");
		String osoite = input.nextLine();
		System.out.print("Kustantajan puhelin: ");
		String puhelin = input.nextLine();
		
		System.err.println("Kirjan "+ kirja.getNimi()+" kustantaja on " + nimi);

	}
}
