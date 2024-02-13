package tehtava_6;

import java.util.Scanner;

public class PeliOhjelma {
	Scanner input = new Scanner(System.in);
	Peli peli = new Peli();
	Henkilo henkilo = new Henkilo();
	
	public void pelaa() {
		peli.setArvattava(73);
		System.out.print("Anna nimesi: ");
		henkilo.setNimi(input.nextLine());
		System.out.print("Anna osoitteesi: ");
		henkilo.setOsoite(input.nextLine());
		
		int i = 1;
		System.out.print("Anna arvaus: ");
		int arvaus = input.nextInt();
		peli.setArvauksia(i);
		
		for (i=2; ; i+=1) {
			input.nextLine();
			
			if (arvaus == peli.getArvattava()) {
				System.out.println("Arvasit oikein");
				
				break;
			}else if (arvaus < peli.getArvattava()) {
				System.out.print("Arvaa suurempaa: ");
				arvaus=input.nextInt();
				
			} else {
				System.out.print("Arvaa pienempää: ");
				arvaus=input.nextInt();
			}
			peli.setArvauksia(i);
			}
		}	


	public void naytaPeli() {
		
		if (peli.getArvauksia()==0) {
			System.out.println("Peliä ei ole pelattu");
		} else {
			System.out.println(henkilo.getNimi() + " arvasi " + peli.getArvauksia() + " kertaa numeroa " + peli.getArvattava());
		}
		
	}	
	public static void main(String[] args) {
		PeliOhjelma ohjelma = new PeliOhjelma();		
		boolean valmis = true;
		
		do {
			
		Scanner input = new Scanner(System.in);
		System.out.println("1. Pelaa");
		System.out.println("2. Näytä peli");
		System.out.println("0. Lopetus");
		System.out.print("Anna valintasi (0-2): ");
		switch (input.nextInt()) {
		case 0:
			valmis = false;
			break;
		case 1:
			ohjelma.pelaa();
			break;
		case 2:
			ohjelma.naytaPeli();
			break;
		}
		}while(valmis);
	}

}
