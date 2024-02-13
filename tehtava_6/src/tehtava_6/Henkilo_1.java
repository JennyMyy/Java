package tehtava_6;

public class Henkilo_1 {
	
	private String nimi;
	private String osoite;
	
	public Henkilo_1() {

	}
	public Henkilo_1(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getOsoite() {
		return osoite;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + "]";
	}
	
}
