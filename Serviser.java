package osobe;


public class Serviser extends Osoba {
	private double plata;
	private String specijalizacija;

	public Serviser() {
		super();
		this.plata = 0;
		this.specijalizacija = "";
	}

	public Serviser(double plata, String specijalizacija) {
		super();
		this.plata = plata;
		this.specijalizacija = specijalizacija;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public String getSpecijalizacija() {
		return specijalizacija;
	}

	public void setSpecijalizacija(String specijalizacija) {
		this.specijalizacija = specijalizacija;
	}

	@Override
	public String toString() {
		return "Serviser [plata=" + plata + ", specijalizacija=" + specijalizacija + "]";
	}
	
	
}
