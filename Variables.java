package VariablesyOperadores;

import java.util.Scanner;

public class Variables{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese su edad: ");
		int edad = sc.nextInt();
		
		System.out.print("Ingrese su altura en metros: ");
		double altura = sc.nextDouble();
		
		System.out.print("¿Está usted casado? (true/false)");
		boolean isMarried = sc.nextBoolean();
		
		//Concatenación con +
		System.out.print("Usted se llama " + nombre + ", tiene " + edad + ", mide " + altura + " metros ");
		if (isMarried) {
			System.out.print("y esta casado");
		} else {
			System.out.print("y no está casdado");
		}
		
		sc.close();
	}
}