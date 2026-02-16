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
		
		System.out.println("Usted se llama " + nombre + ", tiene " + edad + " y mide " + altura + " metros.");
		sc.close();
	}
}