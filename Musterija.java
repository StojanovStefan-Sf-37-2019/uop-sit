package osobe;

public class Musterija extends Osoba {
	protected int nagradniBodovi; 
	
	public Musterija() {
		super();
		this.nagradniBodovi = 0;
	}

	public Musterija(String ime, String prezime, String jmbg, String adresa, String telefon, String korisnickoime,
			String lozinka, int nagradniBodovi) {
		super(ime, prezime, jmbg, adresa, telefon, korisnickoime, lozinka);
		this.nagradniBodovi = nagradniBodovi;
	}

	public int getNagradniBodovi() {
		return nagradniBodovi;
	}

	public void setNagradniBodovi(int nagradniBodovi) {
		this.nagradniBodovi = nagradniBodovi;
	}

	@Override
	public String toString() {
		return "Musterija [nagradniBodovi=" + nagradniBodovi + ", ime=" + ime + ", prezime=" + prezime + ", jmbg="
				+ jmbg + ", adresa=" + adresa + ", telefon=" + telefon + ", korisnickoime=" + korisnickoime
				+ ", lozinka=" + lozinka + "]";
	}
	
}
