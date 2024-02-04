
public class Combate extends Avion {
	
	private boolean esFurtivo=true;
	
	Combate(int id, int cap){
		super(id,cap);
		
	}
	
	Combate(int id, int cap, Piloto pil){
		super(id,cap,pil);
	}
	
	public void getDatosFurtivo() {
		if (esFurtivo=true){
			System.out.println(getDatosAvion() + ". El avión es un avion de combate.");;
		}
	}
	
	

}
