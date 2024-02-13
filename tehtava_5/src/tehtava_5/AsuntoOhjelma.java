package tehtava_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = input.nextLine();
		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();
		System.out.print("Anna pinta-ala: ");
		double pintaala = input.nextDouble();
		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
		
		Asunto asunto_1 = new Asunto(tyyppi, osoite, pintaala, hinta, kuvaus);
		asunto_1.setTyyppi(tyyppi);
		asunto_1.setOsoite(osoite);
		asunto_1.setPintaala(pintaala);
		asunto_1.setHinta(hinta);
		asunto_1.setKuvaus(kuvaus);
		
		System.out.println("Tyyppi: " + asunto_1.getTyyppi());
		System.out.println("Osoite: " + asunto_1.getOsoite());
		System.out.println("Pinta-ala: " + des.format(asunto_1.getPintaala()));
		System.out.println("Hinta: " + des.format(asunto_1.getHinta()) + " euroa");
		System.out.println("Kuvaus: " + asunto_1.getKuvaus());
		
	}

}
