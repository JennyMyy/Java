package tehtava_4;

import java.util.Scanner;

public class Dominion {
	
	public int laskePisteet(int kirous, int tila, int pitaja, int laani) {
		
		int pisteet;
		pisteet = -1*kirous + 2*tila + 3* pitaja + 6*laani;
		return pisteet ;		
	}

	public static void main(String[] args) {
		Dominion dom = new Dominion();
		
		Scanner input = new Scanner(System.in);
			System.out.print("Anna kirouskorttien määrä: ");
			int kirous=input.nextInt();
			System.out.print("Anna tilakorttien määrä: ");
			int tila=input.nextInt();
			System.out.print("Anna pitäjäkorttien määrä: ");
			int pitaja=input.nextInt();
			System.out.print("Anna läänikorttien määrä: ");
			int laani=input.nextInt();
			
			int pisteet;
			pisteet = dom.laskePisteet(kirous, tila, pitaja, laani);
			
			System.out.println("Pisteiden yhteismäärä on " + pisteet);
			
			input.close();

	}

}
