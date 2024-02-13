package tentti;

import java.util.ArrayList;


public class Osallistuja {
	
	private String nimi, kansallisuus;
	private int syntymavuosi;
	private ArrayList<Osallistuja> osallistujat;
	
	public Osallistuja() {
		osallistujat = new ArrayList<Osallistuja>();
	}
	public Osallistuja(String nimi, String kansallisuus, int syntymavuosi, ArrayList<Osallistuja> osallistujat) {
		super();
		this.nimi = nimi;
		this.kansallisuus = kansallisuus;
		this.syntymavuosi = syntymavuosi;
		this.osallistujat = osallistujat;
	}
	public Osallistuja(String nimi, String kansallisuus, int syntymavuosi) {
		super();
		this.nimi = nimi;
		this.kansallisuus = kansallisuus;
		this.syntymavuosi = syntymavuosi;
		osallistujat = new ArrayList<Osallistuja>();
	}
	
	public ArrayList<Osallistuja> getOsallistujat() {
		return osallistujat;
	}
	public void setOsallistujat(ArrayList<Osallistuja> osallistujat) {
		this.osallistujat = osallistujat;
	}
	
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getKansallisuus() {
		return kansallisuus;
	}
	public void setKansallisuus(String kansallisuus) {
		this.kansallisuus = kansallisuus;
	}
	public int getSyntymavuosi() {
		return syntymavuosi;
	}
	public void setSyntymavuosi(int syntymavuosi) {
		this.syntymavuosi = syntymavuosi;
	}
	@Override
	public String toString() {
		return "Osallistuja [nimi=" + nimi + ", kansallisuus=" + kansallisuus + ", syntymavuosi=" + syntymavuosi
				+ ", osallistujat=" + osallistujat + "]";
	}

}
