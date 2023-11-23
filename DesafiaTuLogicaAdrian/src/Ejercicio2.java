import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner (System.in);
		
		int n=0;
		
		System.out.println("Escribe un número positivo");
		
		do{
			
			n=entrada.nextInt();
			
			System.out.println("El numero es " + n);
		
			if(n<0){
				System.out.println("Repitelo, no es positivo");
			}
			
		}while(n<0);
		
		
		System.out.println("Los siguientes 20 numeros son: ");
		
		for(int i=n+1; i < n+21; i++) {
			
			System.out.println(i);
			
		}

	}

}