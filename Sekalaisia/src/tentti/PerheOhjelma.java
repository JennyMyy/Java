package tentti;

import java.util.Scanner;

public class PerheOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Henkilo henkilo = new Henkilo();
		Isa isa = new Isa();
		Aiti aiti = new Aiti();
		
		System.out.print("Anna isän nimi: ");
		isa.setNimi(input.nextLine());
		System.out.print("Anna isän osoite: ");
		isa.setOsoite(input.nextLine());
		System.out.print("Anna äidin nimi: ");
		aiti.setNimi(input.nextLine());
		System.out.print("Anna äidin osoite: ");
		aiti.setOsoite(input.nextLine());
		System.out.print("Anna lapsen nimi: ");
		henkilo.setNimi(input.nextLine());
		System.out.print("Anna lapsen osoite: ");
		henkilo.setOsoite(input.nextLine());
		
		System.out.println("Lapsen isä on " + isa.getNimi() + " ja äiti on " + aiti.getNimi());
		
		if (henkilo.getOsoite().equals(aiti.getOsoite()) && henkilo.getOsoite().equals(isa.getOsoite())){
			System.out.println("Perhe asuu samassa osoitteessa");
		} else if (henkilo.getOsoite().equals(isa.getOsoite())) {
			System.out.println("Lapsi ja isä asuvat samassa osoitteessa");
		} else {
			System.out.println("Lapsi ja äiti asuvat samassa osoitteessa");
		}

	}

}
