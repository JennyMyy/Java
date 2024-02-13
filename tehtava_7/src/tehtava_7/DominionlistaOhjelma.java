package tehtava_7;


import java.util.ArrayList;
import java.util.Scanner;

public class DominionlistaOhjelma {
	Scanner input = new Scanner(System.in);
	Dominion dominion = new Dominion();
	ArrayList<Dominion> dominio = new ArrayList<Dominion>();
	
	public void lisaaPelaaja() {
		System.out.print("Anna pelaajan nimi: ");
		dominion.setNimi(input.nextLine());
		dominio.add(dominion);
	}
	
	private void lisaaPisteet() {
		Dominion uusiPelaaja = new Dominion();
		int kirous = -1;
		int tila = 2;
		int pitaja = 3;
		int laani = 6;
		int laaniPisteet = 8;
		int luku = 0;
		
		while (luku < laaniPisteet) {
			System.out.print("Kuka sai pisteitä: ");
			String kuka = input.nextLine();
			System.out.print("K=kirous, T=tila, P=pitäjä, L=lääni: ");
			String vastaus = input.nextLine();
		
			for (int i = 0; i < dominio.size(); i++) {
				if (dominio.get(i).getNimi().equals(kuka)) {
					if (vastaus == "K") {
						dominio.get(i).setPisteet(+kirous);
					} else if (vastaus == "T") {
						dominio.get(i).setPisteet(+tila);
					} else if (vastaus == "P") {
						dominio.get(i).setPisteet(+pitaja);
					} else {
						dominio.get(i).setPisteet(+laani);
				}		
				}
			}
			for (dominion dominio: dominion) {
				System.out.println);
			}
		}
		
	}

	public static void main(String[] args) {
		DominionlistaOhjelma ohjelma = new DominionlistaOhjelma();
		Scanner input = new Scanner(System.in);
		System.out.print("Montako pelaajia on: ");
		int pelaajat = input.nextInt();
		int luku = 1;
		
		while (luku <= pelaajat) {
			ohjelma.lisaaPelaaja();
			luku += 1;
		}
		
		ohjelma.lisaaPisteet();
		

	}



}
