package tentti;

public class Henkilo {
	
	private String nimi, osoite;
	private Aiti aiti;
	private Isa isa;
	
	public Henkilo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Henkilo(String nimi, String osoite, Aiti aiti, Isa isa) {
		super();
		this.nimi = nimi;
		this.osoite = osoite;
		this.aiti = aiti;
		this.isa = isa;
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
	public Aiti getAiti() {
		return aiti;
	}
	public void setAiti(Aiti aiti) {
		this.aiti = aiti;
	}
	public Isa getIsa() {
		return isa;
	}
	public void setIsa(Isa isa) {
		this.isa = isa;
	}
	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", aiti=" + aiti + ", isa=" + isa + "]";
	}
	
}
