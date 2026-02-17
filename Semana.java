package VariablesyOperadores;

import java.util.Scanner;

public class Semana{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un numero del 1 al 7: ");
		
		byte dia; //Para que no ocupe mucho espacio 
		
		try {
			dia = sc.nextByte();
		} catch (java.util.InputMismatchException e) { //y por si ponen un numero muy alto
			dia = 12;
		}
		
		switch (dia) {
		case 1:
			System.out.println("Día: Lunes");
			break;
		case 2: 
			System.out.println("Día: Martes");
			break;
		case 3:
			System.out.println("Día: Miercoles");
			break;
		case 4: 
			System.out.println("Día: Jueves");
			break;
		case 5:
			System.out.println("Día: Viernes");
			break;
		case 6: 
			System.out.println("Día: Sabado");
			break;
		case 7:
			System.out.println("Día: Domingo");
			break;
		default: 
			System.out.println("Opción no soportada.");
		}
		
		sc.close();
	}
}