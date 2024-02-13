package tehtava_7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AsuntolistaRemonttiOhjelma {
	Scanner input = new Scanner(System.in);
	ArrayList<Asunto> asuntoLista = new ArrayList<Asunto>();
	DecimalFormat des = new DecimalFormat("00.00");
	
	void lisaaAsunto() {	
		Asunto uusiAsunto = new Asunto();
		//input.nextLine();
		System.out.print("Anna asunnon tyyppi: ");
		uusiAsunto.setTyyppi(input.nextLine());
		System.out.print("Anna osoite: ");
		uusiAsunto.setOsoite(input.nextLine());
		System.out.print("Anna pinta-ala: ");
		uusiAsunto.setPintaala(input.nextDouble());
		System.out.print("Anna hinta: ");
		uusiAsunto.setHinta(input.nextDouble());
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		uusiAsunto.setKuvaus(input.nextLine());	

		boolean lisaaRemontti = true;
		do {
			Remontti uusiRemontti = new Remontti();	
			System.out.print("Anna remonttivuosi (0 Lopettaa): ");
			int vuosi = input.nextInt();
			input.nextLine();
			if (vuosi != 0) {
				uusiRemontti.setVuosi(vuosi);
				System.out.print("Anna remontin kuvaus: ");
				String kuvaus = input.nextLine();
				uusiRemontti.setKuvaus(kuvaus);
				uusiAsunto.getRemontit().add(uusiRemontti);	
			} else {
				lisaaRemontti = false;
			}			
		} while (lisaaRemontti);
		
		asuntoLista.add(uusiAsunto);
	}
	
	void naytaAsunnot() {
		
		for (Asunto asunto: asuntoLista) {
			System.out.println("Tyyppi: " + asunto.getTyyppi());
			System.out.println("Osoite: " + asunto.getOsoite());
			System.out.println("Pinta-ala: " + des.format(asunto.getPintaala()));
			System.out.println("Hinta: " + des.format(asunto.getHinta()) + " euroa");
			System.out.println("Kuvaus: " + asunto.getKuvaus());
			System.out.println("Remontit: ");
			for (Remontti remontti : asunto.getRemontit()) {
				System.out.println(remontti.getVuosi() + " " + remontti.getKuvaus());
			}

		}		
	}

	public static void main(String[] args) {
		AsuntolistaRemonttiOhjelma ohjelma = new AsuntolistaRemonttiOhjelma();
		Scanner input = new Scanner(System.in);	
		boolean valmis = true;
		
		do {
			System.out.println("1. Lisää asunto");
			System.out.println("2. Näytä asunnot");
			System.out.println("0. Lopetus");
			System.out.print("Anna valintasi (0-2): ");
			switch (input.nextInt()) {
			case 0:
				valmis = false;
				break;
			case 1:
				ohjelma.lisaaAsunto();
				break;
			case 2:
				ohjelma.naytaAsunnot();
				break;
			default:
				System.out.println("Valintasi ei kelpaa");
			}		
		} while(valmis);
		
	input.close();
	}
}
