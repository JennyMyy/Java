package tehtava_5;

public class Asunto {

	private String tyyppi, osoite;
	private double pintaala, hinta;
	private String kuvaus;
	public Asunto() {
		super();
		
	}
	public Asunto(String tyyppi, String osoite, double pintaala, double hinta, String kuvaus) {
		super();
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaala = pintaala;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
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
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", pintaala=" + pintaala + ", hinta=" + hinta
				+ ", kuvaus=" + kuvaus + "]";
	}
	
	
}
