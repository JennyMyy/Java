package tehtava_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {	
	public int kysyKilometrit() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ajetut kilometrit: ");
		int kilometrit = input.nextInt();
		return kilometrit;	
	}	
	public double kysyTankkaus() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna tankattu määrä: ");
		double tankattu = input.nextDouble();
		return tankattu;		
	}
	public double laskeKulutus(int kilometrit, double tankattu) {
		double kulutus = tankattu/kilometrit * 100;
		return kulutus;	
	}
	public void naytaKulutus(double kulutus) {
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Kulutus/100km on " + des.format(kulutus) + " litraa");		
	}
	public static void main(String[] args) {
		Kulutus ohjelma = new Kulutus();
		int kilometrit;
		double tankattu,kulutus;
		kilometrit = ohjelma.kysyKilometrit();
		tankattu = ohjelma.kysyTankkaus();
		kulutus = ohjelma.laskeKulutus(kilometrit, tankattu);
		ohjelma.naytaKulutus(kulutus);		
	}
}
