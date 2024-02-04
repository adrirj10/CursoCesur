import java.util.*;
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//CREAMOS PILOTOS
		
		Piloto piloto1=new Piloto(1,"Pete Maverick", 10000, "Capitán");
		Piloto piloto2=new Piloto(2,"Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3=new Piloto(3,"Bradley Rooster", 3500, "Teniente");
		
		//CREAMOS AVIONES Y LE ASIGNAMOS PILOTOS A TRAVES DE CODIGO MEDIANTE UNO DE LOS CONSTRUCTORES DE LA CLASE AVION
		
		Combate combate1=new Combate(1,500,piloto1);
		Combate combate2=new Combate(2,2500,piloto2);
		Combate combate3=new Combate(3,1500,piloto3);
		
		
		//SOLICITAMOS AL USUARIO QUE INTRODUZCA DATOS DEL CUARTO PILOTO
		
		System.out.println("Introduce los datos del cuarto piloto. ID:");
		int id4=sc.nextInt();
		
		sc.nextLine();
		
		
		System.out.println("Nombre: ");
		String nom4=sc.nextLine();
		
		System.out.println("Horas de vuelo: ");
		int horas4=sc.nextInt();

		
		sc.nextLine();
		
		System.out.println("Rango: ");
		String rank4=sc.nextLine();
		
		
		Piloto piloto4=new Piloto(id4,nom4,horas4,rank4);
		
		System.out.println(piloto4.getDatosPiloto());
		
		//SOLICITAMOS AL USUARIO QUE INTRODUZCA DATOS DEL QUINTO PILOTO
		
		System.out.println("Introduce los datos del quinto piloto. ID:");
		int id5=sc.nextInt();
		
		sc.nextLine();
		
		
		System.out.println("Nombre: ");
		String nom5=sc.nextLine();
		
		System.out.println("Horas de vuelo: ");
		int horas5=sc.nextInt();

		
		sc.nextLine();
		
		System.out.println("Rango: ");
		String rank5=sc.nextLine();
		
		Piloto piloto5=new Piloto(id5,nom5,horas5,rank5);
		
		System.out.println(piloto5.getDatosPiloto());
		
		// LE PEDIMOS AL USUARIO QUE INTRODUZCA LOS DATOS DEL CUARTO AVION.
		
		System.out.println("Introduce el ID del avión numero 4");
		int idAvion4=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce la capacidad de carga del avion numero 4");
		int capacidadAvion4=sc.nextInt();
		sc.nextLine();
		
		
		Entrenamiento AvEntrenamiento1=new Entrenamiento(idAvion4,capacidadAvion4);
		
		System.out.println("Introduce piloto para este avion:  4 o 5");
		
		int numPilot=sc.nextInt();
		
		switch(numPilot) {
		
		case 4: AvEntrenamiento1.setPiloto(piloto4);
		break;
		case 5: AvEntrenamiento1.setPiloto(piloto5);
		break;
			
		}
		

		
		// LE PEDIMOS AL USUARIO QUE INTRODUZCA LOS DATOS DEL QUINTO AVION.
		
		System.out.println("Introduce el ID del avión numero 5");
		int idAvion5=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce la capacidad de carga del avion numero 5");
		int capacidadAvion5=sc.nextInt();
		sc.nextLine();
		
	
		Entrenamiento AvEntrenamiento2=new Entrenamiento(idAvion5,capacidadAvion5);
		
		System.out.println("Introduce piloto para este avion:  4 o 5");
		
		int numPilot2=sc.nextInt();
		
		switch(numPilot2) {
		
		case 4: AvEntrenamiento2.setPiloto(piloto4);
		break;
		case 5: AvEntrenamiento2.setPiloto(piloto5);
		break;
			
		}
		
		combate1.getDatosFurtivo();
		combate2.getDatosFurtivo();
		combate3.getDatosFurtivo();
		AvEntrenamiento1.getDatosEntrenamiento();
		AvEntrenamiento2.getDatosEntrenamiento();
		
		
		
		
		
	}

}
