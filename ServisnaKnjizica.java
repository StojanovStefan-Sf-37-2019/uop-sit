package osobe;

import java.util.ArrayList;

public class ServisnaKnjizica {
	private Automobil clanstvo;
	private ArrayList<ServisAutomobila> listaServisa;

	public ServisnaKnjizica() {
		this.clanstvo = new Automobil();
		this.listaServisa = new ArrayList<ServisAutomobila>();
	}

	public ServisnaKnjizica(Automobil clanstvo, ArrayList<ServisAutomobila> listaServisa) {
		super();
		this.clanstvo = clanstvo;
		this.listaServisa = listaServisa;
	}

	public Automobil getClanstvo() {
		return clanstvo;
	}

	public void setClanstvo(Automobil clanstvo) {
		this.clanstvo = clanstvo;
	}

	public ArrayList<ServisAutomobila> getListaServisa() {
		return listaServisa;
	}

	public void setListaServisa(ArrayList<ServisAutomobila> listaServisa) {
		this.listaServisa = listaServisa;
	}

	@Override
	public String toString() {
		return "ServisnaKnjizica [clanstvo=" + clanstvo + ", listaServisa=" + listaServisa + "]";
	}
	
	

}
