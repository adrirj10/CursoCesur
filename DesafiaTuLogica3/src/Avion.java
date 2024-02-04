
public class Avion {
	
	private int idAvion;
	private int capAvion;
	private Piloto piloto;
	public Avion (int id, int cap) {
		this.idAvion=id;
		this.capAvion=cap;
	}
	
	public Avion (int id, int cap, Piloto pil){
		this.idAvion=id;
		this.capAvion=cap;
		this.piloto=pil;
	}
	
	public String getDatosAvion() {
		  return "ID DEL AVION: " + idAvion + " CAPACIDAD DEL AVIÓN: " + capAvion +
				  " NOMBRE DEL PILOTO: " + piloto.getNomPiloto();
		 }
	
	
	public void setIdAvion(int id) {
		idAvion=id;
	}

	public void setCapAvion(int cap) {
		capAvion=cap;
	}
	
	public void setPiloto (Piloto pil) {
		piloto=pil;
	}
}
