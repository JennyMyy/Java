package tehtava_5;

import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna vuosi: ");
		int vuosi = input.nextInt();
		Remontti remontti_1 = new Remontti();
		
		   if (remontti_1.setVuosi(vuosi)) {
	            if (vuosi <= remontti_1.NykyVuosi()) {
	                System.out.print("Anna kuvaus: ");
	                input.nextLine(); 
	                String kuvaus = input.nextLine();
	                remontti_1.setKuvaus(kuvaus);
	                System.out.println("Vuonna " + remontti_1.getVuosi() + " tehtiin remontti " + remontti_1.getKuvaus());
	            } else {
	                System.out.println("Vuosi ei voi olla tulevaisuudessa.");
	            }
	        } else {
	            System.out.println("Vuosi ei voi olla suurempi kuin nykyinen vuosi.");
	        }
	    }
}
