package osobe;

public class Automobil {
	private Musterija vlasnik;
	private String marka;
	private String model;
	private int godinaProizvodnje;
	private String zapreminaMotora;
	private String snagaMotora;
	private String vrstaGoriva;
	
	public Automobil() {
		this.vlasnik = new Musterija();
		this.marka = "";
		this.model = "";
		this.godinaProizvodnje = 0;
		this.zapreminaMotora = "";
		this.snagaMotora = "";
		this.vrstaGoriva = "";
	}

	public Automobil(Musterija vlasnik, String marka, String model, int godinaProizvodnje, String zapreminaMotora,
			String snagaMotora, String vrstaGoriva) {
		super();
		this.vlasnik = vlasnik;
		this.marka = marka;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
		this.zapreminaMotora = zapreminaMotora;
		this.snagaMotora = snagaMotora;
		this.vrstaGoriva = vrstaGoriva;
	}

	public Musterija getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Musterija vlasnik) {
		this.vlasnik = vlasnik;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public String getZapreminaMotora() {
		return zapreminaMotora;
	}

	public void setZapreminaMotora(String zapreminaMotora) {
		this.zapreminaMotora = zapreminaMotora;
	}

	public String getSnagaMotora() {
		return snagaMotora;
	}

	public void setSnagaMotora(String snagaMotora) {
		this.snagaMotora = snagaMotora;
	}

	public String getVrstaGoriva() {
		return vrstaGoriva;
	}

	public void setVrstaGoriva(String vrstaGoriva) {
		this.vrstaGoriva = vrstaGoriva;
	}

	@Override
	public String toString() {
		return "Automobil [vlasnik=" + vlasnik + ", marka=" + marka + ", model=" + model + ", godinaProizvodnje="
				+ godinaProizvodnje + ", zapreminaMotora=" + zapreminaMotora + ", snagaMotora=" + snagaMotora
				+ ", vrstaGoriva=" + vrstaGoriva + "]";
	}
	
	
}