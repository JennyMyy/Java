package tehtava_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lahjavero {

	public double laskeVero(double arvo) {
		double summa = 0;
		
		if (arvo < 5000) {
			summa = 0;
		} else if ( arvo < 25000) {
			summa = (arvo - 5000)* 0.8 + 100;
			if (summa < 100) {
				summa = 100;
			}
		} else if (arvo < 55000) {
			summa = (arvo - 25000)* 0.1 + 1700;
			if (summa < 1700) {
				summa = 1700;
			}
		} else if (arvo < 200000) {
			summa = (arvo - 55000)* 0.12 + 4700;
			if (summa < 4700) {
				summa = 4700;
			}
		} else if (arvo < 1000000) {
			summa = (arvo - 200000)* 0.15 + 22100;
			if (summa < 22100) {
				summa = 22100;
			}
		} else {
			summa = (arvo - 1000000)* 0.17 + 142100;
			if (summa < 142100) {
				summa = 142100;
			}
		}
		
		return summa;
	}	
		
	public static void main(String[] args) { 
		Lahjavero vero = new Lahjavero();
		Scanner input = new Scanner(System.in);

		System.out.print("Anna lahjan suuruus: ");
		DecimalFormat des = new DecimalFormat("0.00");
		double lahja= input.nextDouble();
		double summa1;
		summa1=vero.laskeVero(lahja);
		
		System.out.println("Lahjavero on " + des.format(summa1) + " euroa");
	
		input.close();
	}
}
