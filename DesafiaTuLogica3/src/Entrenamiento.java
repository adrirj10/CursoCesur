
public class Entrenamiento extends Avion {
	
	private boolean tieneDobleMando=true;
	
	Entrenamiento(int id, int cap){
		super(id,cap);
		
	}
	
	public void getDatosEntrenamiento() {
		if (tieneDobleMando=true){
			System.out.println(getDatosAvion() + ". El avión es un avion de entrenamiento.");;
		}
	}
	
	

}
