package tehtava_7;

public class Remontti {
	
	private int vuosi;
	private String kuvaus;
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
	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
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
