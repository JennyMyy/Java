package tehtava_4;

import java.util.Scanner;

public class Kellonaika {

	public String kysyKellonaika() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String kellonaika=input.nextLine();
		input.close();
		return kellonaika;		
	}
	
	public boolean tarkastaKellonaika(String kellonaika) {
        String[] osat = kellonaika.split(":");
        
        try {
            int eka = Integer.parseInt(osat[0]);
            int toka = Integer.parseInt(osat[1]);

            if (eka >= 0 && eka < 24 && toka >= 0 && toka < 60) {
                return true;
            } else {
                return false; 
            }
        } catch (Exception e) {
            return false; 
        }
	}
	
	public static void main(String[] args) {
		Kellonaika ohjelma = new Kellonaika();
		String kellonaika = ohjelma.kysyKellonaika();

		Scanner input = new Scanner(System.in);			
		if (ohjelma.tarkastaKellonaika(kellonaika) == true) {
			System.out.println("Kellonaika on oikein");
			
		} else {
			System.out.println("Kellonaika on väärin");
		}		
		input.close();
	}
}
