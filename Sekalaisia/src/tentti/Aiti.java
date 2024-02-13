package tentti;

public class Aiti {
	
	private String nimi, osoite;

	public Aiti() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aiti(String nimi, String osoite) {
		super();
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
		return "Aiti [nimi=" + nimi + ", osoite=" + osoite + "]";
	}
	
	

}
