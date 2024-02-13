package tehtava_7;

import java.util.ArrayList;

public class Asunto {
	
	private String tyyppi, osoite, kuvaus;
	private double pintaala, hinta;
	private Remontti remontti;

	private ArrayList<Remontti> remontit; 
	
	public Asunto() {
		remontit = new ArrayList<Remontti>();
	}
	
	public Asunto(String tyyppi, String osoite, String kuvaus, double pintaala, double hinta, Remontti remontti,
			ArrayList<Remontti> remontit) {
		super();
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.kuvaus = kuvaus;
		this.pintaala = pintaala;
		this.hinta = hinta;
		this.remontti = remontti;
		this.remontit = remontit;
	}
	
	public Asunto(String tyyppi, String osoite, String kuvaus, double pintaala, double hinta, Remontti remontti) {
		super();
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.kuvaus = kuvaus;
		this.pintaala = pintaala;
		this.hinta = hinta;
		this.remontti = remontti;
		remontit = new ArrayList<Remontti>();

	}

	public Remontti getRemontti() {
		return remontti;
	}

	public void setRemontti(Remontti remontti) {
		this.remontti = remontti;
	}

	public ArrayList<Remontti> getRemontit() {
		return remontit;
	}
	public void setRemontit(ArrayList<Remontti> remontit) {
		this.remontit = remontit;
	}
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public String getOsoite() {
		return osoite;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	public double getPintaala() {
		return pintaala;
	}
	public void setPintaala(double pintaala) {
		this.pintaala = pintaala;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", kuvaus=" + kuvaus + ", pintaala=" + pintaala
				+ ", hinta=" + hinta + ", remontti=" + remontti + ", remontit=" + remontit + "]";
	}
}
