package tehtava_6;

public class Remontti {
		
		private int vuosi;
		private String kuvaus;
		private Henkilo_1 tekija;
		
		public Remontti() {
			
		}
		public Remontti(int vuosi, String kuvaus, Henkilo_1 tekija) {
			this.vuosi = vuosi;
			this.kuvaus = kuvaus;
			this.tekija = tekija;
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

		public Henkilo_1 getTekija() {
			return tekija;
		}

		public void setTekija(Henkilo_1 tekija) {
			this.tekija = tekija;
		}

		@Override
		public String toString() {
			return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + ", tekija=" + tekija + "]";
		}			
}

