package VariablesyOperadores;

import java.util.Scanner;

public class Logicas{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");		
		int num1 = sc.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2 && num1 != num2) {
			System.out.println("El primer numero es mayor.");
		} else if (num2 > num1){
			System.out.println("El segundo numero es mayor.");
		} else if (num1 == num2) {
			System.out.println("Los numeros son iguales.");
		} else {
			System.out.println("No tendría que salir esto.");
		}
		//No tuve nada de creatividad con esto, perdon :(
		sc.close();
	}
}