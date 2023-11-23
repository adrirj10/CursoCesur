import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Este programa muestra y cuenta los números que son múltiplos de 2 o de 3 que hay entre 1 y 100");
		System.out.println("Escribe '2' para los multiplos de 2 y '3' para los multiplos de 3");
		
		Scanner entrada=new Scanner (System.in);
		
		int seleccion=entrada.nextInt();
		
		switch(seleccion) {
		
		case 2:
		
			for(int i=2; i <= 100; i=i+2) {
				System.out.println(i);
			}
			
		break;
		
		case 3:
			
			for(int i=3; i <= 100; i=i+3) {
				System.out.println(i);
			}
			
		break; 
		
		default:
			
			System.out.println("no has introducido un valor correcto");
			
		}
		
		

	}

}
