package osobe;

import java.sql.Date;
import java.util.ArrayList;

public class ServisAutomobila {
	private Automobil servisAutomobil;
	private Serviser serviser;
	private Date vremeServisa;
	private ArrayList<ServisniDeo> listaDelova;
	private String kratakOpis;
	private String vrstaDelova;
	private boolean statusServisa;
	
	public ServisAutomobila() {
		this.servisAutomobil=new Automobil();
		this.serviser=new Serviser();
		this.vremeServisa=new Date(0);
		this.listaDelova=new ArrayList<ServisniDeo>();
		this.kratakOpis="";
		this.vrstaDelova="";
		this.statusServisa=true;
	}

	public ServisAutomobila(Automobil servisAutomobil, Serviser serviser, Date vremeServisa,
			ArrayList<ServisniDeo> listaDelova, String kratakOpis, String vrstaDelova, boolean statusServisa) {
		super();
		this.servisAutomobil = servisAutomobil;
		this.serviser = serviser;
		this.vremeServisa = vremeServisa;
		this.listaDelova = listaDelova;
		this.kratakOpis = kratakOpis;
		this.vrstaDelova = vrstaDelova;
		this.statusServisa = statusServisa;
	}

	public Automobil getServisAutomobil() {
		return servisAutomobil;
	}

	public void setServisAutomobil(Automobil servisAutomobil) {
		this.servisAutomobil = servisAutomobil;
	}

	public Serviser getServiser() {
		return serviser;
	}

	public void setServiser(Serviser serviser) {
		this.serviser = serviser;
	}

	public Date getVremeServisa() {
		return vremeServisa;
	}

	public void setVremeServisa(Date vremeServisa) {
		this.vremeServisa = vremeServisa;
	}

	public ArrayList<ServisniDeo> getListaDelova() {
		return listaDelova;
	}

	public void setListaDelova(ArrayList<ServisniDeo> listaDelova) {
		this.listaDelova = listaDelova;
	}

	public String getKratakOpis() {
		return kratakOpis;
	}

	public void setKratakOpis(String kratakOpis) {
		this.kratakOpis = kratakOpis;
	}

	public String getVrstaDelova() {
		return vrstaDelova;
	}

	public void setVrstaDelova(String vrstaDelova) {
		this.vrstaDelova = vrstaDelova;
	}

	public boolean isStatusServisa() {
		return statusServisa;
	}

	public void setStatusServisa(boolean statusServisa) {
		this.statusServisa = statusServisa;
	}

	@Override
	public String toString() {
		return "ServisAutomobila [servisAutomobil=" + servisAutomobil + ", serviser=" + serviser + ", vremeServisa="
				+ vremeServisa + ", listaDelova=" + listaDelova + ", kratakOpis=" + kratakOpis + ", vrstaDelova="
				+ vrstaDelova + ", statusServisa=" + statusServisa + "]";
	}
	
	
	

}
