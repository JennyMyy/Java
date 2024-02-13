package tehtava_5;

import java.time.LocalDate;

public class Remontti {
	
	private int vuosi;
	private String kuvaus;
	
	public int NykyVuosi() {
		LocalDate tanaan = LocalDate.now();
		int nykyVuosi = tanaan.getYear();
		
		return nykyVuosi;
	}
		
	public Remontti() {
		
	}
	public Remontti(int vuosi, String kuvaus) {
		super();
		this.vuosi = vuosi;
		this.kuvaus = kuvaus;
	}
	public int getVuosi() {
		return vuosi;
	}
	public boolean setVuosi(int vuosi) {	
		if (vuosi <= this.NykyVuosi()) {
			this.vuosi = vuosi;
			return true;
		} else {
			return false;
		}
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + "]";
	}
	
}
