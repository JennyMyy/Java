package tehtava_7;

public class Dominion {
	
	private String nimi;
	private int pisteet;

	public int getPisteet() {
		return pisteet;
	}

	public void setPisteet(int pisteet) {
		this.pisteet = pisteet;
	}

	public Dominion(String nimi, int pisteet) {
		super();
		this.nimi = nimi;
		this.pisteet = pisteet;
	}

	public Dominion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dominion(String nimi) {
		super();
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public String toString() {
		return "Dominion [nimi=" + nimi + ", pisteet=" + pisteet + "]";
	}
	

}
