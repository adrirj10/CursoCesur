
public class Piloto {
	
	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;
	
	public Piloto (int id, String nom, int horas, String rango) {
		this.idPiloto=id;
		this.nomPiloto=nom;
		this.horasVueloPiloto=horas;
		this.rangoPiloto=rango;
	}
	
	public String getDatosPiloto() {
		return "Nombre: " + nomPiloto + ". Id del Piloto: " + idPiloto + ". Horas de vuelo del piloto " 
				+ horasVueloPiloto + ". Rango del Piloto: " + rangoPiloto;
		
	}
	
	public String getNomPiloto() {
		 return nomPiloto;
	 }
	
	public void setIdPiloto(int id) {
		idPiloto=id;
	}
	
	public void setNomPiloto(String nom) {
		nomPiloto=nom;
	}
	
	public void setHorasVuelo(int hor) {
		horasVueloPiloto=hor;
	}
	
	public void setRangoPiloto(String rank) {
		rangoPiloto=rank;
	}
}
