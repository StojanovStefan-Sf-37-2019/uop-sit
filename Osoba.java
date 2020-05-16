package osobe;

public abstract class Osoba {

	protected String ime;
	protected String prezime;
	protected String jmbg;
	protected String adresa;
	protected String telefon;
	protected String korisnickoime;
	protected String lozinka;

	public Osoba() {
		this.ime = "";
		this.prezime = "";
		this.jmbg = "";
		this.adresa = "";
		this.jmbg = "";
		this.telefon = "";
		this.korisnickoime = "";
		this.lozinka = "";
	}

	public Osoba(String ime, String prezime, String jmbg, String adresa, String telefon, String korisnickoime,
			String lozinka) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.telefon = telefon;
		this.korisnickoime = korisnickoime;
		this.lozinka = lozinka;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getKorisnickoime() {
		return korisnickoime;
	}

	public void setKorisnickoime(String korisnickoime) {
		this.korisnickoime = korisnickoime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg + ", adresa=" + adresa + ", telefon="
				+ telefon + ", korisnickoime=" + korisnickoime + ", lozinka=" + lozinka + "]";
	}

}
