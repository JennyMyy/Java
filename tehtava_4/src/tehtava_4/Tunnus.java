package tehtava_4;

import java.util.Scanner;

public class Tunnus {
	
	public String teeTunnus(String etu, String suku) {
		
		String etunimi = etu.substring(0, 3).toLowerCase();
		String sukunimi = suku.substring(0 ,3).toLowerCase();
		
		String kaytTunnus = sukunimi + etunimi;
		
		return kaytTunnus;
		
	}
	
	public static void main(String[] args) {
		Tunnus ohjelma = new Tunnus();
		Scanner input = new Scanner(System.in);
		String sukunimi, etunimi;
		System.out.print("Anna sukunimi: ");
		sukunimi = input.nextLine();
		System.out.print("Anna etunimi: ");
		etunimi = input.nextLine();
		String tunnus = ohjelma.teeTunnus(etunimi, sukunimi);
		
		System.out.println("Tunnus on " + tunnus);
		
		input.close();
		
	}

}
