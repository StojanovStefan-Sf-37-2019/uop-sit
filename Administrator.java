package osobe;

public class Administrator extends Osoba {
	protected double plata;

	public Administrator() {
		super();
		this.plata = 0;
	}

	public Administrator(String ime, String prezime, String jmbg, String adresa, String telefon, String korisnickoime,
			String lozinka, double plata) {
		super(ime, prezime, jmbg, adresa, telefon, korisnickoime, lozinka);
		this.plata = plata;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	@Override
	public String toString() {
		return "Administrator [plata=" + plata + ", ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg
				+ ", adresa=" + adresa + ", telefon=" + telefon + ", korisnickoime=" + korisnickoime + ", lozinka="
				+ lozinka + "]";
	}
	
}
