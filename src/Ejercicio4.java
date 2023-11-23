import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner (System.in);
		
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Este programa ordena los número de mayor a menor o de menor a mayor");
		
		System.out.println("");
		
		System.out.println("¡Escribe el primer numero!");
		
		n1 = entrada.nextInt();
		
		System.out.println("¡Escribe el segundo numero!");
		
		n2 = entrada.nextInt();
		
		System.out.println("¡Escribe el tercer numero!");
		
		n3 = entrada.nextInt();
		
		System.out.println("¿Como deseas ordenar los números? \n1) De menor a mayor \n2) De mayor a menor");
		
		int seleccion=entrada.nextInt();
		
		switch(seleccion) {
		case 1:
			
			if (n1<n2 && n2<n3 && n1<n3) {
				System.out.println("El orden de los numeros es " + n1 + " " + n2 + " " + n3);
			}
			
			else if (n1>n2 && n2<n3 && n1<n3) {
				System.out.println("El orden de los numeros es " + n2 + " " + n1 + " " + n3);
			}
			
			else if (n3<n2 && n2<n1 && n1>n3) {
				System.out.println("El orden de los numeros es " + n3 + " " + n2 + " " + n1);
			}
			
			else if (n1>n2 && n2<n3 && n1>n3) {
				System.out.println("El orden de los numeros es " + n2 + " " + n3 + " " + n1);
			}
			
			else if (n1<n2 && n2>n3 && n1<n3) {
				System.out.println("El orden de los numeros es " + n1 + " " + n3 + " " + n2);
			}
			
			else if (n1<n2 && n2>n3 && n1>n3) {
				System.out.println("El orden de los numeros es " + n3 + " " + n1 + " " + n2);
			}
			
			break;
			
		case 2:
			
			if (n1>n2 && n2>n3 && n1>n3) {
				System.out.println("El orden de los numeros es " + n1 + " " + n2 + " " + n3);
			}
			
			else if (n1<n2 && n2>n3 && n1>n3) {
				System.out.println("El orden de los numeros es " + n2 + " " + n1 + " " + n3);
			}
			
			else if (n3>n2 && n2>n1 && n1<n3) {
				System.out.println("El orden de los numeros es " + n3 + " " + n2 + " " + n1);
			}
			
			else if (n1<n2 && n2>n3 && n1<n3) {
				System.out.println("El orden de los numeros es " + n2 + " " + n3 + " " + n1);
			}
			
			else if (n1>n2 && n2<n3 && n1>n3) {
				System.out.println("El orden de los numeros es " + n1 + " " + n3 + " " + n2);
			}
			
			else if (n1>n2 && n2<n3 && n1<n3) {
				System.out.println("El orden de los numeros es " + n3 + " " + n1 + " " + n2);
			}
			
			break;
			
		}
		
		

	}

}
