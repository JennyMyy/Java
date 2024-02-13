package tehtava_7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AsuntolistaOhjelma {
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
		asuntoLista.add(uusiAsunto);
	}
	
	void naytaAsunnot() {
		
		for (Asunto asunto: asuntoLista) {
			System.out.println("Tyyppi: " + asunto.getTyyppi());
			System.out.println("Osoite: " + asunto.getOsoite());
			System.out.println("Pinta-ala: " + des.format(asunto.getPintaala()));
			System.out.println("Hinta: " + des.format(asunto.getHinta()) + " euroa");
			System.out.println("Kuvaus: " + asunto.getKuvaus());
		}		
	}

	public static void main(String[] args) {
		AsuntolistaOhjelma ohjelma = new AsuntolistaOhjelma();
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
		
	}
}
