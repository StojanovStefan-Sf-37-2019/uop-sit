package osobe;

public class ServisniDeo {
	private String markaAutomobila; 
	private String modelAutomobila;
	private String nazivDela;
	private int cena;	
	
	public ServisniDeo() {
		this.markaAutomobila = "";
		this.modelAutomobila = "";
		this.nazivDela = "";
		this.cena = 0;
	}

	public ServisniDeo(String markaAutomobila, String modelAutomobila, String nazivDela, int cena) {
		super();
		this.markaAutomobila = markaAutomobila;
		this.modelAutomobila = modelAutomobila;
		this.nazivDela = nazivDela;
		this.cena = cena;
	}

	public String getMarkaAutomobila() {
		return markaAutomobila;
	}

	public void setMarkaAutomobila(String markaAutomobila) {
		this.markaAutomobila = markaAutomobila;
	}

	public String getModelAutomobila() {
		return modelAutomobila;
	}

	public void setModelAutomobila(String modelAutomobila) {
		this.modelAutomobila = modelAutomobila;
	}

	public String getNazivDela() {
		return nazivDela;
	}

	public void setNazivDela(String nazivDela) {
		this.nazivDela = nazivDela;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "ServisniDeo [markaAutomobila=" + markaAutomobila + ", modelAutomobila=" + modelAutomobila
				+ ", nazivDela=" + nazivDela + ", cena=" + cena + "]";
	}

	
	
}
